package Unidad2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio_3_Examen {
	
	private static void exportarZapatos(Connection conn) throws SQLException {
	    String sql = "SELECT marca, modelo, tamano, color, stock, precio FROM ZAPATO";

	    try (Statement st = conn.createStatement();
	         ResultSet rs = st.executeQuery(sql);
	         java.io.PrintWriter pw = new java.io.PrintWriter("zapatos.txt")) {

	        // Cabecera opcional
	        pw.println("marca;modelo;tamano;color;stock;precio");

	        while (rs.next()) {
	            String linea =
	                    rs.getString("marca")  + ";" +
	                    rs.getString("modelo") + ";" +
	                    rs.getInt("tamano")    + ";" +
	                    rs.getString("color")  + ";" +
	                    rs.getInt("stock")     + ";" +
	                    rs.getDouble("precio");
	            pw.println(linea);
	        }

	        System.out.println("Exportación completada a zapatos.txt");
	    } catch (java.io.IOException e) {
	        System.out.println("Error al escribir el archivo: " + e.getMessage());
	    }
	}


	public static void main(String[] args) {
		Connection conn = ConexionBD.conectar();
		
		try {
			exportarZapatos(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
