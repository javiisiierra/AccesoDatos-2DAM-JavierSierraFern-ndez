package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejerc16 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Inroduce la ruta del fichero: ");
		String ruta = leer.nextLine();
		
		
		BufferedReader fichero;
		
		public static void modificarFichero(File fichero, int numLinea) {
		
		try {
			
			BufferedReader FOriginal = new BufferedReader(new FileReader(ruta));
			
			System.out.println("Contenido del fichero: ");
			
			File Ftemporal = new File("tmp.txt");
			BufferedWriter ftmp = new BufferedWriter ( new FileWriter (Ftemporal));
			

			String linea;
			int numlinea=1;
			
			while((linea=FOriginal.readLine())!=null) {
				System.out.println(numlinea+" "+linea);
				numlinea++;
			}
			
			ftmp.close();
			FOriginal.close();
			
			if(fichero.delete()) {
				if(!Ftemporal.renameTo(fichero.getAbsoluteFile())) {
					System.out.println("No se puede renombrar el fichero original. ");
				}
			}else {
				System.out.println("No se puede borrar el fichero original. ");
			}
			
		}catch (Exception e) {
			System.out.println("Error al abrir el fichero. ");			
			e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println("¿Qué línea quieres borrar?: ");
		int borrar = leer.nextInt();
		
		
		
		
	

	}
}