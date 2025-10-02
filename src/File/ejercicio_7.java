package File;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_7 {
	
	public static void mostrarInfo(File fichero) {
		System.out.println("---------------------------------------");
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

		ArrayList<File> nombres = new ArrayList<>();
		int opcion;
		
		 do {
	            System.out.println("\nMENÚ DE GESTIÓN DE FICHEROS");
	            System.out.println("1 - Añadir fichero");
	            System.out.println("2 - Mostrar información de los ficheros");
	            System.out.println("3 - Salir");
	            System.out.print("Seleccione una opción: ");

	            while (!leer.hasNextInt()) {
	                System.out.print("Por favor, ingrese un número válido: ");
	                leer.next(); 

	            }   
	            opcion = leer.nextInt();
	            leer.nextLine();
	            
	            switch (opcion) {
	                case 1:
	                    System.out.print("Nombre de fichero: ");
	                    String nombreFichero = leer.nextLine();
	                    File fichero = new File(nombreFichero);
	                    nombres.add(fichero);
	                    System.out.println("Fichero añadido.");
	                    break;

	                case 2:
	                    if (nombres.isEmpty()) {
	                        System.out.println("No hay ficheros registrados.");
	                    } else {
	                        System.out.println("------------------------------------------------");
	                        for (File nombre : nombres) {
	                            mostrarInfo(nombre);
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.println("Has salido del programa. ");
	                    break;

	                default:
	                    System.out.println("Opción no válida. Intente de nuevo.");
	            }

	        } while (opcion != 3);


		

	}
}



