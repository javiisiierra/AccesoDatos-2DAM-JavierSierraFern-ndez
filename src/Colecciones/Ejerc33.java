package Colecciones;

import java.util.TreeSet;

public class Ejerc33 {

	public static void main(String[] args) {
		/*Crea una lista de grupos que hay en el centro sin duplicados y ordenados por el grupo,
añade cinco niveles y muestra su contenido.
Ejemplo de grupos: 1ESOA, 4ESOC, 2DAM,1FPB,2BACHB*/
		
		TreeSet<String> grupos = new TreeSet<String>();
		
		grupos.add("1ESOA");
		grupos.add("4ESOC");
		grupos.add("2DAM");
		grupos.add("1FPB");
		grupos.add("2BACHB");
		
		for(String g : grupos) {
			
			System.out.println(g);
		}
	}

}
