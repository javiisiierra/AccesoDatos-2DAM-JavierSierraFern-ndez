package Unidad2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicio2_2_Examen {
	public static  Scanner leer = new Scanner(System.in);
	
	private static void mostrarZapatos(Connection conn) throws SQLException {
	    String sql = "SELECT * FROM ZAPATO WHERE stock < 5";

	    try (Statement st = conn.createStatement();
	         ResultSet rs = st.executeQuery(sql)) {

	        System.out.println("Zapatos con stock menor a 5:");
	        while (rs.next()) {
	            String marca  = rs.getString("marca");
	            String modelo = rs.getString("modelo");
	            int stock     = rs.getInt("stock");
	            System.out.println(marca + " " + modelo + " - stock: " + stock);
	        }
	    }
	}

	
	private static void aumentaPrecio(Connection conn) throws SQLException {
	    String sql = "UPDATE ZAPATO SET precio = precio + 2 WHERE marca = 'Nike'";

	    try (Statement st = conn.createStatement()) {
	        int filas = st.executeUpdate(sql);
	        System.out.println("Filas actualizadas: " + filas);
	    }
	}

	
	private static void anadeTabla(Connection conn) {
	    String sql = "ALTER TABLE ZAPATO ADD descripcion VARCHAR(50)";

	    try (Statement st = conn.createStatement()) {
	        st.executeUpdate(sql);   
	        System.out.println("Columna 'descripcion' añadida correctamente.");
	    } catch (SQLException e) {
	        
	        System.out.println("No se pudo añadir la columna: " + e.getMessage());
	    }
	}

	
	private static void zapatosRojo(Connection conn) throws SQLException {
	    String sql = "SELECT * FROM ZAPATO WHERE color = ? AND precio < ?";

	    try (PreparedStatement ps = conn.prepareStatement(sql)) {
	        ps.setString(1, "Rojo");
	        ps.setDouble(2, 20.0);

	        try (ResultSet rs = ps.executeQuery()) {
	            while (rs.next()) {
	                String marca  = rs.getString("marca");
	                String modelo = rs.getString("modelo");
	                double precio = rs.getDouble("precio");
	                System.out.println(marca + " " + modelo + " - " + precio);
	            }
	        }
	    }
	}

	private static void totalZapatos(Connection conn) throws SQLException {
	    String sql = "SELECT COUNT(*) AS total FROM ZAPATO";

	    try (Statement st = conn.createStatement();
	         ResultSet rs = st.executeQuery(sql)) {

	        if (rs.next()) {
	            int total = rs.getInt("total");
	            System.out.println("Total de zapatos: " + total);
	        }
	    }
	}



	public static void main(String[] args) throws SQLException {
		
		Connection conn = ConexionBD.conectar();
		int opcion;
		
		do {
			System.out.println("MENÚ: \n1-.Mostrar todos los zapatos stock menor 5 \n2-.Aumenta el precio en 2€	todas las zapatillas de Nike"
					+ "\n3-.Añade a la tabla el campo descripción \n4-.Mostrar todos los zapatos de color rojo y menores de 20 \n5-.Muestra total de zapatos"
					+ "\n6-.Salir \nOpción: ");
			opcion = leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
			case 1:
				mostrarZapatos(conn);
				break;
			case 2:
				aumentaPrecio(conn);
				break;
			case 3:
				anadeTabla(conn);
				break;
			case 4:
				zapatosRojo(conn);
				break;
			case 5:
				totalZapatos(conn);
				break;
			case 6:
				System.out.println("Has salido del programa");
				break;
			default:
				System.out.println("Marca una opción correcta");
			}
			
		}while(opcion !=6);
		
		
		
		

	}

}
