package File;

import java.io.File;
import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del fichero: ");
		String fichero = leer.nextLine();
		
		
		try {
			
		
		boolean newFile = false;
		File file = new File(fichero);

		if(file.exists()) {
			System.out.println("El fichero ya esiste. ");
		}else if(newFile = file.createNewFile()){
			System.out.println("Fichero creado. ");
		}else {
			System.out.println("No se ha podido crear. ");
		}
		
		}catch(Exception  e) {
			System.out.println("Error. ");
		}
			
		
	}

}