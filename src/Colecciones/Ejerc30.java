package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejerc30 {

	public static void main(String[] args) {
		/*Crea una lista de nombres de los alumnos con duplicados, añade cinco nombres y muestra
		su contenido.*/
		
		ArrayList<String> ListaAlumnos = new ArrayList<String>();
		
		ListaAlumnos.add("Paco");
		ListaAlumnos.add("Paco");
		ListaAlumnos.add("Paco");
		ListaAlumnos.add("Marcos");
		ListaAlumnos.add("Pablo");
		
		for (String a : ListaAlumnos) {
		
		System.out.println(ListaAlumnos.toString());
		
		}
	}

}
