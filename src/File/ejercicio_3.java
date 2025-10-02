package File;



import java.io.File;

import java.util.Scanner;



public class ejercicio_3 {



	public static void main(String[] args) {



		Scanner leer = new Scanner(System.in);



		System.out.println("Introduce la ruta de la carpeta: ");

		String ruta = leer.nextLine();



		File fichero = new File(ruta);



		if (fichero.exists()) {



			if (fichero.isDirectory()) {

				System.out.println("Contenido de: " + ruta);



				for (File s : fichero.listFiles()) {

					System.out.println(s.getName());

					

					String tipo = s.isDirectory() ? "Carpeta" : "Fichero";



					String permisos = (s.canRead() ? "r" : "-") + 

									  (s.canWrite() ? "w" : "-") +

							          (s.canExecute() ? "x" : "-");

					System.out.println("Nombre: " + s.getName() + " " + tipo + " " + permisos);



				}

			} else {

				System.out.println("No es una carpeta. ");

			}

		} else {

			System.out.println("No existe. ");

		}



	}



}