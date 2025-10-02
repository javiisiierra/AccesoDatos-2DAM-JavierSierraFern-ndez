package File;



import java.io.File;

import java.util.Scanner;



public class ejercicio_6 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		Scanner leer = new Scanner(System.in);

		

		System.out.println("Introduce la ruta del fichero a renombrar: ");

		String ruta = leer.nextLine();

		

		System.out.println("Introduce el nuevo nombre: ");

		String nuevoNombre = leer.nextLine();

		

		File fichero = new File(ruta);

		

		if(fichero.exists()) {

			

			String directorio = fichero.getParent();

			

			File nuevoFichero = new File(directorio, nuevoNombre);

			

			if(!nuevoFichero.exists()) {

				boolean renombrado = fichero.renameTo(nuevoFichero);

				

				if(renombrado) {

					System.out.println("Fichero renombrado. ");

				}else {

					System.out.println("El fichero no se ha podido renombrar. ");

				}

			}else {

				System.out.println("Este fichero ya existe. ");

			}

		}else {

			System.out.println("Este fichero no existe. ");

		}

	}



}