package Unidad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejercicio_17 {

    public static void main(String[] args) throws SQLException {
        Connection con = ConexionBD.conectar();

        String ruta = "C:\\Users\\usuario\\Downloads\\navavinted.csv";   

        String sql = "INSERT INTO PRODUCTO " +
                "(nombre_Producto, id_Categoria, id_Talla, id_Color, id_Material, " +
                " stock, precio, costo, estado, descuento) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

   try (PreparedStatement ps = con.prepareStatement(sql)) {
       try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
           String linea;
           while ((linea = br.readLine()) != null) {
               String[] c = linea.split(";");
               String nombre    = c[1];
               int idCat        = Integer.parseInt(c[2]);
               int idTalla      = Integer.parseInt(c[3]);
               int idColor      = Integer.parseInt(c[4]);
               int idMaterial   = Integer.parseInt(c[5]);
               int stock        = Integer.parseInt(c[6]);
               double precio    = Double.parseDouble(c[7]);
               double costo     = Double.parseDouble(c[8]);
               String estado    = c[9];
               int descuento    = Integer.parseInt(c[10]);

               ps.setString(1, nombre);
               ps.setInt(2, idCat);
               ps.setInt(3, idTalla);
               ps.setInt(4, idColor);
               ps.setInt(5, idMaterial);
               ps.setInt(6, stock);
               ps.setDouble(7, precio);
               ps.setDouble(8, costo);
               ps.setString(9, estado);
               ps.setInt(10, descuento);

               ps.executeUpdate();
           }
       } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

    }
}
