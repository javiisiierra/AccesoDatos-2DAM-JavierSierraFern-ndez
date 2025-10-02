package File;

import java.io.File;
import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce la ruta: ");
		String ruta = leer.nextLine();
		
		File fichero = new File(ruta);
		
		try {
		
		if(fichero.exists()) {
			
			if(fichero.isDirectory()) {
			System.out.println("ES una carpeta. ");
			System.out.println("Su tamaño es: " + fichero.length());
			
			}else if(fichero.isFile()) {
			System.out.println("Es un fichero. ");
			System.out.println("Su tamaño es: " + fichero.length());
		}
		}
	}catch(Exception e) {
		System.out.println("Error");
	}

}
}