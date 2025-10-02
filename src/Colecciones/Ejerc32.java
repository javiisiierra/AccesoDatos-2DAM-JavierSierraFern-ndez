package Colecciones;


import java.util.LinkedHashSet;

public class Ejerc32 {

	public static void main(String[] args) {
		/*Crea una lista de niveles educativos que se imparten en el centro sin duplicados y
ordenados por el orden de inserción, añade cinco niveles y muestra su contenido.
Ejemplo de niveles: ESO, GM-SMR, GS-DAM, GS-ASIR, BACH*/
		
		LinkedHashSet<String> niveles = new LinkedHashSet<String>();
		
		niveles.add("ESO");
		niveles.add("GM-SMR");
		niveles.add("GS-DAM");
		niveles.add("GS-ASIR");
		niveles.add("BACH");
		
		for(String n : niveles) {
			
			System.out.println(n);
		}

	}

}
