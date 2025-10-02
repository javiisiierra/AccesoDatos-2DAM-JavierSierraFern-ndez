package File;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_7 {
	
	public static void mostrarInfo(File fichero) {
		System.out.println(fichero.getName());
		
		
		if (fichero.exists()) {
			System.out.println("Fichero existe. ");
			System.out.println("Fichero: " + fichero.isFile() + "Carpeta: " + fichero.isDirectory());
			System.out.println("Nombre del fichero: " + fichero.getAbsolutePath());
			

			String permisos = (fichero.canRead() ? "r" : "-") +

					(fichero.canWrite() ? "w" : "-") +

					(fichero.canExecute() ? "x" : "-");
			
			System.out.println(permisos);

			System.out.println("Su tamaño es: " + fichero.length());

		} else {
			System.out.println("EL fichero no existe. ");
		}
	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String introducido;

		ArrayList<File> nombres = new ArrayList<>();

		System.out.println("Introduce nombres de fichero (escribe Salir para" + " terminar):  ");

		do {
			System.out.println("Nombre de fichero: ");
			introducido = leer.nextLine();

			if (!introducido.equalsIgnoreCase("Salir")) {
				
				File fichero = new File (introducido);
				nombres.add(fichero);
				System.out.println("Fichero añadido. ");
			}
		} while (!introducido.equalsIgnoreCase("Salir"));

		System.out.println("------------------------------------------------");

		for (File nombre : nombres) {

			mostrarInfo(nombre);
			System.out.println("--------------------------------------------");
		}

	}

}
