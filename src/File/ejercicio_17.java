package File;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.util.Scanner;



public class ejercicio_17 {

	/*Realiza un programa que permita modificar los datos de un fichero. El programa mostrará

el fichero y pedirá al usuario qué línea quiere modificar. El usuario introducirá un número

de línea y el programa le pedirá los datos de la nueva línea. Por último, el programa

modificará el fichero y mostrará el fichero modificado.*/

	

	public static void mostrarFichero(File fichero) {

		

		try {

			BufferedReader lector = new BufferedReader(new FileReader(fichero));

			

			String linea;

			int numLinea = 1;

			

			while((linea = lector.readLine()) != null) {

				System.out.println(numLinea + ". " + linea);

				numLinea ++;

			}

			

		}catch (Exception e) {

			System.out.println("No se ha podido mostrar el fichero");

			e.printStackTrace();

		}

		

	}

	

	public static void modificarFichero(File fichero, int lineaBorrar, String nuevaLinea) {

		

		File ficheroTemporal = new File(fichero.getParent(), "tmp.txt");

		

		try(

				BufferedReader lector = new BufferedReader(new FileReader(fichero));

				BufferedWriter escritor = new BufferedWriter(new FileWriter(ficheroTemporal));

		

				

				) {

			

			String linea;

			int numLinea = 1;

			

			while((linea = lector.readLine()) != null) {

				if(numLinea == lineaBorrar) {

					escritor.write(nuevaLinea);

					

				}else {

					escritor.write(linea);

				}

				escritor.newLine();

				numLinea ++;

			}

			

			

			

				}catch (Exception e) {

					System.out.println("No se ha podido modificar el fichero");

					e.printStackTrace();

					return;

				}

		

		if(fichero.delete()) {

			if(!ficheroTemporal.renameTo(fichero)) {

				System.out.println("No se pudo renombrar ");

			}

		}else {

			System.out.println("No se ha podido modificar el fichero");

		}

		

		

		}

		

	





	public static void main(String[] args) {

		

		Scanner leer = new Scanner(System.in);

		

		System.out.println("Introduce el fichero: ");

		String ruta = leer.nextLine();

		

		File fichero = new File(ruta);

		

		if(!fichero.exists()) {

			System.out.println("No se ha podido eliminar el fichero");

		}

		

		mostrarFichero(fichero);

		

		System.out.println("Introduce la línea que quieres borrar: ");

		int lineaBorrar = leer.nextInt();

		leer.nextLine();

		System.out.println("Introduce los nuevos datos: ");

		String nuevaLinea = leer.nextLine();

		

		modificarFichero(fichero, lineaBorrar, nuevaLinea);

		

		System.out.println("Fichero modificado");

		mostrarFichero(fichero);

		

		leer.close();

	}



}
