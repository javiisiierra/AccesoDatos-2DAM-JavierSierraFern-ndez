package Unidad2;

import java.sql.Connection;
import java.sql.SQLException;

public class Ejercicio_13 {
	
	 static final String SQL_ORIGEN =
		        "INSERT INTO Origen (pais, region) VALUES " +
		        "('España', 'Andalucía'), " +
		        "('Francia', 'Vichy'), " +
		        "('España', 'varias');";

		    static final String SQL_RECETA =
		        "INSERT INTO Receta (nombre, tipo, origen_id) VALUES " +
		        "('Gazpacho', 'Sopa fría', 1), " +
		        "('Vichyssoise', 'Sopa fría', 2), " +
		        "('Sopa de ave', 'Sopa caliente', 3);";

		    static final String SQL_INGREDIENTE =
		        "INSERT INTO Ingrediente (receta_id, nombre, cantidad) VALUES " +
		        "(1, 'Tomate', '1 kg'), " +
		        "(1, 'Aceite', '100 ml'), " +
		        "(1, 'Pimiento verde', '100 g'), " +
		        "(1, 'Ajo', '1 diente'), " +
		        "(2, 'Puerro', '400 g'), " +
		        "(2, 'Patata', '300 g'), " +
		        "(2, 'Mantequilla', '100 g'), " +
		        "(2, 'Nata líquida', '200 ml'), " +
		        "(3, 'Caldo de pollo', '1 l'), " +
		        "(3, 'Fideos', '100 g'), " +
		        "(3, 'Puerro', '100 g'), " +
		        "(3, 'Zanahoria', '200 g');";

		    // Métodos que usan esas constantes
		    public static void insertarOrigen(Connection con) throws SQLException {
		        try (java.sql.Statement st = con.createStatement()) {
		            st.executeUpdate(SQL_ORIGEN);
		        }
		    }

		    public static void insertarRecetas(Connection con) throws SQLException {
		        try (java.sql.Statement st = con.createStatement()) {
		            st.executeUpdate(SQL_RECETA);
		        }
		    }

		    public static void insertarIngredientes(Connection con) throws SQLException {
		        try (java.sql.Statement st = con.createStatement()) {
		            st.executeUpdate(SQL_INGREDIENTE);
		        }
		    }

	public static void main(String[] args) throws SQLException {
		Connection conexion = ConexionBD.conectar();
		
		insertarOrigen(conexion);
		insertarRecetas(conexion);
		insertarIngredientes(conexion);
		

	}

}
