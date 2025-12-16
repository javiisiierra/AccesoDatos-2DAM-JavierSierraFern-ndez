package Unidad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ejercicio2_Examen {
	private static void insertarZapatosEnBD(Connection conn, Lista22 lista) throws SQLException {
        String sql = "INSERT INTO ZAPATO (marca, modelo, tamano, color, stock, precio) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            for (Zapato z : lista.getZapatos()) {
                ps.setString(1, z.getMarca());
                ps.setString(2, z.getModelo());
                ps.setString(3, z.getTamano());
                ps.setString(4, z.getColor());
                ps.setInt(5, z.getStock());
                ps.setDouble(6, z.getPrecio());
                ps.executeUpdate();
            }
        }
    }

    public static void main(String[] args) {

        // Conexión usando tu clase ConexionBD (asegúrate de que apunta a bdzapatos)
        Connection conn = ConexionBD.conectar();

        if (conn == null) {
            System.out.println("No se pudo conectar a la base de datos.");
            return;
        }

       try (Statement stmt = conn.createStatement()) {

            // 1) Ejecutar el script SQL que crea la BD/tabla y lo que haga falta
            StringBuilder script = new StringBuilder();
            try (BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\usuario\\Desktop\\scriptzapatos.sql"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    script.append(linea).append("\n");
                }
            }
            stmt.execute(script.toString());
            System.out.println("Scripts ejecutados con éxito.");

            // 2) Leer el JSON de zapatos
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            Lista22 lista = mapper.readValue(
                    new File("C:\\Users\\usuario\\Downloads\\zapatos.json"),
                    Lista22.class
            );
            
            // 2.1)Leer de un xml e insertar
           /* private static void importarXMLaBD(Connection conn) throws Exception {

                // 1. Cargar y parsear el XML
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse("zapatos.xml");   // ruta al XML

                doc.getDocumentElement().normalize();

                // 2. Obtener la lista de nodos <zapato>
                NodeList listaZapatos = doc.getElementsByTagName("zapato");

                // 3. Preparar el INSERT
                String sql = "INSERT INTO ZAPATO (marca, modelo, tamano, color, stock, precio) " +
                             "VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {

                    for (int i = 0; i < listaZapatos.getLength(); i++) {
                        Node nodo = listaZapatos.item(i);
                        if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                            Element e = (Element) nodo;

                            String marca  = e.getElementsByTagName("marca").item(0).getTextContent();
                            String modelo = e.getElementsByTagName("modelo").item(0).getTextContent();
                            int tamano    = Integer.parseInt(e.getElementsByTagName("tamano").item(0).getTextContent());
                            String color  = e.getElementsByTagName("color").item(0).getTextContent();
                            int stock     = Integer.parseInt(e.getElementsByTagName("stock").item(0).getTextContent());
                            double precio = Double.parseDouble(e.getElementsByTagName("precio").item(0).getTextContent());

                            // 4. Rellenar parámetros del INSERT
                            ps.setString(1, marca);
                            ps.setString(2, modelo);
                            ps.setInt(3, tamano);
                            ps.setString(4, color);
                            ps.setInt(5, stock);
                            ps.setDouble(6, precio);

                            ps.addBatch();   // añade a lote
                        }
                    }

                    // 5. Ejecutar todos los INSERTs de golpe
                    ps.executeBatch();
                    System.out.println("Zapatos importados desde XML correctamente.");
                }
            }*/

            

            // 3) Insertar los zapatos en la tabla
            insertarZapatosEnBD(conn, lista);
            System.out.println("Zapatos insertados correctamente.");

        } catch (IOException e) {
            System.out.println("Error leyendo el JSON o el script.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error de SQL.");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Conexión cerrada.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	
	


}
