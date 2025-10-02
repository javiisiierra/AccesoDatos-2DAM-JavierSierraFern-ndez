package Colecciones;

import java.util.HashSet;



public class Ejerc31 {

	public static void main(String[] args) {
		/* Crea una lista de nombres de los profesores sin duplicados, añade cinco nombres y
		muestra su contenido.*/
		
		HashSet<String> profesores = new HashSet <String>();

		profesores.add("Luis");
		profesores.add("Francisco");
		profesores.add("Paco");
		profesores.add("Pablo");
		profesores.add("Pablo");
		
		for (String p : profesores) {
			
		System.out.println(p);
			
		}
		
	}

}
