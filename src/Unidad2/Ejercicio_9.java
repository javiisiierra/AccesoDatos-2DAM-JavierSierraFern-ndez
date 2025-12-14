package Unidad2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Ejercicio_9 {
	
	
	public static void mostrarAlumnosAsignaturas(Connection con) throws SQLException {
		 String sql = "SELECT a.nombre AS alumno, m.nombre AS asignatura " +
                 "FROM ALUMNO a " +
                 "JOIN NOTA n ON a.id = n.alumno " +
                 "JOIN MODULO m ON n.modulo = m.codigo " +
                 "ORDER BY a.nombre, m.nombre";

    try (Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(sql)) {

        while (rs.next()) {
            String alumno = rs.getString("alumno");
            String asignatura = rs.getString("asignatura");
            System.out.println(alumno + " -> " + asignatura);
        }
    }
		
	}
	
	public static void mostrarNotasAlumno(Connection con) throws SQLException {
		String sql = "SELECT a.nombre as alumno, n.nota as nota "+
					"FROM ALUMNO a "+
					"JOIN NOTA n ON a.id = n.alumno "+
					"ORDER BY a.nombre, n.nota";
		  try (Statement st = con.createStatement();
			         ResultSet rs = st.executeQuery(sql)) {

			        while (rs.next()) {
			            String alumno = rs.getString("alumno");
			            int nota = rs.getInt("nota");
			            System.out.println(alumno + " -> " + nota);
			        }
			    }
		
	}
	
	public static void nuevoAlumno(Connection con) throws SQLException {
		String sql = "INSERT INTO alumno (nombre, curso) "+
				" VALUES ('Javier Sierra', '2DAM')";
		
		  try (Statement st = con.createStatement()){
			         int filas = st.executeUpdate(sql);
			  System.out.println("Filas insertadas "+filas);

		  }
		
	}
	
	public static void anadirTelefono(Connection con) throws SQLException {
		String sql = "ALTER TABLE alumno ADD telefono INT NOT NULL";
		 try (Statement st = con.createStatement()){
	         int columnas = st.executeUpdate(sql);
	  System.out.println("Columnas insertadas "+columnas);

  }
	}
	
	public static void rellenarTelefono(Connection con) throws SQLException {
		String sql = "UPDATE alumno SET telefono = '603458581' WHERE id=7";
		try (Statement st = con.createStatement()){
	         int telefono = st.executeUpdate(sql);
	  System.out.println("Telefonos insertados "+telefono);

 }
		
	}

	public static void main(String[] args) {
		Connection conexion = ConexionBD.conectar();
		try {
			//mostrarAlumnosAsignaturas(conexion);
			//mostrarNotasAlumno(conexion);
			//nuevoAlumno(conexion);
			//anadirTelefono(conexion);
			rellenarTelefono(conexion);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
