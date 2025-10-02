package File;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String introducido;
		
		ArrayList<String> nombres = new ArrayList<>();
		
		System.out.println("Introduce nombres de fichero (escribe Salir para"
				+ " terminar):  ");
		
		do {
			System.out.println("Nombre de fichero: ");
		    introducido = leer.nextLine();
		   
		    if(!introducido.equals("Salir")) {
		    nombres.add(introducido);
		    System.out.println("Fichero añadido. ");
		}
		}while(!introducido.equals("Salir")); 
			
		System.out.println("------------------------------------------------");
		
		for(String nombre : nombres) {
			System.out.println(nombre);
			mostrarInfo(nombre);
			System.out.println("--------------------------------------------");
		}
		
	}	
		
		public static void mostrarInfo(String ruta) {
			File fichero = new File(ruta);
			
			if(fichero.exists()) {
				System.out.println("Fichero existe. ");
				System.out.println("Fichero: " + fichero.isFile() + "Carpeta: " + fichero.isDirectory());
				System.out.println("Nombre del fichero: ");
				System.out.println(fichero.getAbsolutePath());
					

				String permisos = (fichero.canRead() ? "r" : "-") + 

								  (fichero.canWrite() ? "w" : "-") +

						          (fichero.canExecute() ? "x" : "-");
				
				System.out.println("Su tamaño es: " + fichero.length());
					
				}else {
					System.out.println("EL fichero no existe. ");
				}
			}
		
		}
		


	

	


