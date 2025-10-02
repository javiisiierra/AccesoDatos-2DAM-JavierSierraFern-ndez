package File;

import java.io.File;
import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		

		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce el nombre de la carpeta: ");
		String carpeta = leer.nextLine();

		try {

			
			File directorio = new File(carpeta);

			if (directorio.exists()) {
				System.out.println("La carpeta ya existe. ");
			} else if (directorio.mkdir()) {
				System.out.println("Carpeta creada. ");
			}else {
				System.out.println("No se ha podido crear. ");
			}

		} catch (Exception e) {
			System.out.println("Error. ");
		}
		leer.close();
	}

}

