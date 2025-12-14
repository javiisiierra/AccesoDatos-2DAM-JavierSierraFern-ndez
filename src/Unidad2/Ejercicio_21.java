package Unidad2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Ejercicio_21 {
	public static Scanner leer = new Scanner(System.in);
	
	 private static void llamarAgregarAlumno(Connection con) throws SQLException {
	        System.out.print("Nombre: ");
	        String nombre = leer.nextLine();
	        System.out.print("Curso (1DAM,1DAW,2DAM,2DAW): ");
	        String curso = leer.nextLine();
	        System.out.print("Teléfono: ");
	        int telefono = leer.nextInt();
	        leer.nextLine();

	        String sql = "{CALL agregar_alumno(?, ?, ?)}";
	        try (CallableStatement stmt = con.prepareCall(sql)) {
	            stmt.setString(1, nombre);
	            stmt.setString(2, curso);
	            stmt.setInt(3, telefono);
	            stmt.execute();
	            System.out.println("Alumno insertado mediante procedimiento.");
	        }
	    }

	    
	    private static void llamarChequearAlumno(Connection con) throws SQLException {
	        System.out.print("Id de alumno: ");
	        int id = leer.nextInt();
	        leer.nextLine();

	        String sql = "{? = CALL chequearAlumno(?)}";
	        try (CallableStatement stmt = con.prepareCall(sql)) {
	            stmt.registerOutParameter(1, Types.TINYINT);
	            stmt.setInt(2, id);
	            stmt.execute();
	            boolean existe = stmt.getInt(1) == 1;
	            System.out.println("¿Existe el alumno " + id + "? " + existe);
	        }
	    }

	    
	    private static void llamarContarAlumnos(Connection con) throws SQLException {
	        String sql = "{? = CALL contar_alumnos()}";
	        try (CallableStatement stmt = con.prepareCall(sql)) {
	            stmt.registerOutParameter(1, Types.INTEGER);
	            stmt.execute();
	            int total = stmt.getInt(1);
	            System.out.println("Número total de alumnos: " + total);
	        }
	    }

	public static void main(String[] args) throws SQLException {

		Connection conexion = ConexionBD.conectar();
		
		int opcion;
		  do {
	            System.out.println("\nMENÚ BDAlumnos");
	            System.out.println("1. Añadir alumno (procedimiento)");
	            System.out.println("2. Comprobar si existe alumno (función chequearAlumno)");
	            System.out.println("3. Contar alumnos (función contar_alumnos)");
	            System.out.println("0. Salir");
	            System.out.print("Elige opción: ");
	            opcion = leer.nextInt();
	            leer.nextLine();

	            switch (opcion) {
	                case 1:
	                	llamarAgregarAlumno(conexion);
	                	break;
	                case 2: 
	                	llamarChequearAlumno(conexion);
	                	break;
	                case 3:
	                	llamarContarAlumnos(conexion);
	                	break;
	                case 0:
	                	System.out.println("Has salido.");
	                	break;
	                default:
	                	System.out.println("Opción no válida");
	            }
	        } while (opcion != 0);

	        conexion.close();
	    }

	}


