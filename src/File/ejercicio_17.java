/*package File;

import java.io.File;
import java.util.Scanner;

public class ejercicio_17 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce la ruta del fichero: ");
		String ruta = leer.nextLine();		
		File fichero = new File(ruta);
		
		if(!fichero.exists()) {
			System.out.println("El fichero no existe. ");
			return;
		}
		
		mostrarFichero(fichero);
		
		System.out.println("Introduce que línea quieres modificar: ");
		int lineaModificar = leer.nextInt();
		
		modificarFichero(fichero, lineaModificar);
		
		System.out.println("\nContenido modificado: ");
		mostrarFichero(fichero);
		
		public static void mostrarFichero(File fichero) {
			
		}
		
		public static void modificarFichero(File fichero, int lineaModificar) {
			
		}

	}

}*/
