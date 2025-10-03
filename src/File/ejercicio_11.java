package File;

import java.io.File;
import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		/* Realiza un programa que cree un fichero y añada un texto. El programa pedirá el nombre
		del fichero y el texto. */
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del fichero: ");
		String nombre = leer.nextLine();
		
		File fichero = new File(nombre);
		
		try {
		
		boolean newFile = false;
		if(fichero.exists()) {
			System.out.println("El fichero ya esiste. ");
		}else if(newFile = fichero.createNewFile()){
			System.out.println("Fichero creado. ");
		}else {
			System.out.println("No se ha podido crear. ");
		}
		
		}catch(Exception e) {
			
		}
	}

}
