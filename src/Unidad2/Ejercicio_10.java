package Unidad2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.event.PopupMenuEvent;

public class Ejercicio_10 {
	public static Scanner leer = new Scanner(System.in);

	public static void productosPorCategoria(Connection con) throws SQLException {
		System.out.println("Introduce la categoría: ");
		String cat = leer.nextLine();
		
		String sql = "SELECT c.categoria, p.id_producto, p.nombre_producto, p.estado, p.precio "+
					"FROM PRODUCTO p "+
					" JOIN CATEGORIA c ON p.id_categoria = c.id_categoria "+
					"WHERE c.categoria = ?";
		 try (PreparedStatement ps = con.prepareStatement(sql)) {
		        ps.setString(1, cat);
		        try (ResultSet rs = ps.executeQuery()) {
		            while (rs.next()) {
		                String categoria = rs.getString("categoria");
		                int id = rs.getInt("id_Producto");
		                String nombre = rs.getString("nombre_Producto");
		                String estado = rs.getString("estado");
		                double precio = rs.getDouble("precio");
		                System.out.println(categoria + " | " + id + " | " +
		                                   nombre + " | " + estado + " | " + precio);
		            }
		        }
		    }
		
	}
	
	public static void mostrarPorTalla(Connection con) throws SQLException {
		System.out.println("Introduce la talla: ");
		String tal = leer.nextLine();
		
		String sql = "SELECT t.id_talla, t.talla, p.nombre_producto, p.estado, p.precio "+
					"FROM PRODUCTO p "+
					"JOIN TALLA t ON p.id_Talla = t.id_Talla "+
					"WHERE t.talla = ?";
		
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, tal);
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id_Talla");
					String talla = rs.getString("talla");
					String nombre = rs.getString("nombre_producto");
					String estado = rs.getString("estado");
					double precio = rs.getDouble("precio");
					System.out.println(talla + " | " + id + " | " +
		                                   nombre + " | " + estado + " | " + precio );
				}
			}
		}
	}
	
	public static void nuevoProducto(Connection con) throws SQLException {
	    System.out.println("Nombre producto: ");
	    String nombre = leer.nextLine();

	    System.out.println("Id categoría: ");
	    int idCat = leer.nextInt();
	    leer.nextLine(); // limpiar salto

	    System.out.println("Id talla: ");
	    int idTalla = leer.nextInt();
	    leer.nextLine();

	    System.out.println("Precio: ");
	    double precio = leer.nextDouble();
	    leer.nextLine();

	    System.out.println("Estado: ");
	    String estado = leer.nextLine();

	    System.out.println("Stock: ");
	    int stock = leer.nextInt();
	    leer.nextLine();

	    String sql = "INSERT INTO PRODUCTO " +
	                 "(nombre_Producto, id_Categoria, id_Talla, id_Color, id_Material, " +
	                 " stock, precio, costo, estado, descuento) " +
	                 "VALUES (?, ?, ?, 1, 1, ?, ?, 0, ?, 0)";

	    try (PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setString(1, nombre);
	        ps.setInt(2, idCat);
	        ps.setInt(3, idTalla);
	        ps.setInt(4, stock);
	        ps.setDouble(5, precio);
	        ps.setString(6, estado);
	        ps.executeUpdate();
	        System.out.println("Producto insertado correctamente.");
	    }
	}
	
	public static void precioFinal(Connection con) throws SQLException {
		System.out.println("Introduce el id_producto: ");
		int id1 = leer.nextInt();
		
		String sql = "SELECT p.id_producto, p.precio, p.descuento "+
					"FROM PRODUCTO p "+
					"WHERE p.id_producto = ?";
		
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id1);
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id_producto");
					int descuento = rs.getInt("descuento");
					double precio = rs.getDouble("precio");
					double precioFinal = precio -(precio+descuento)/100;
					System.out.println("Precio final: "+ precioFinal);
				}
			}
		}
		
		
	}
	
	public static void venderProducto(Connection con) throws SQLException {
		System.out.println("Introduce el id_producto: ");
		int id1 = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Introduce la cantidad de productos: ");
		int cantidadP = leer.nextInt();
		
		String sql = "Select p.id_producto, p.stock "+
					"FROM PRODUCTO p "+
					"WHERE p.id_producto = ?";
		
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id1);
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
				int id = rs.getInt("id_producto");
				int stock = rs.getInt("stock");
				int stockRestante = stock-cantidadP;
				System.out.println("Stock restante: "+ stockRestante);
				}
			}
		}
		
	}


	public static void main(String[] args) throws SQLException {
		
		Connection conexion = ConexionBD.conectar();
		
	
		int opcion;
		do {
			System.out.println("MENÚ: \n1-.Productos por categoría \n2-.Productos por talla \n3-.Nuevo producto \n4-.Calcular precio final"
					+ "\n5-.Vender productos \n0-.Salir \nSelecciona una opción: ");
			opcion = leer.nextInt();leer.nextLine();
			
			switch(opcion) {
			case 1: 
				
					productosPorCategoria(conexion);
			
				
				break;
			case 2:
				mostrarPorTalla(conexion);
				break;
			case 3:
				nuevoProducto(conexion);
				break;
			case 4: 
				precioFinal(conexion);
				break;
			case 5:
				venderProducto(conexion);
				break;
			case 0:
				System.out.println("Has salido del programa ");
				break;
			default:
				System.out.println("Seleccion una opción válida ");
			}
			
			
		}while(opcion != 6);

	}

}

