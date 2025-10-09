package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercic_16 {
	public class BorrarLineaFichero {

		public static void main(String[] args) {
			
			 Scanner leer = new Scanner(System.in);

		        System.out.print("Introduce la ruta del fichero: ");
		        String ruta = leer.nextLine();
		        File fichero = new File(ruta);

		        if (!fichero.exists()) {
		            System.out.println("El fichero no existe.");
		            return;
		        }

		        
		        mostrarFichero(fichero);

		        
		        System.out.print("\n¿Qué línea quieres borrar?: ");
		        int lineaABorrar = leer.nextInt();

		        
		        modificarFichero(fichero, lineaABorrar);

		       
		        System.out.println("\nContenido del fichero modificado:");
		        mostrarFichero(fichero);
		    }

		    public static void mostrarFichero(File fichero) {
		        try (BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
		            String linea;
		            int numLinea = 1;
		            while ((linea = lector.readLine()) != null) {
		                System.out.println(numLinea + ". " + linea);
		                numLinea++;
		            }
		        } catch (IOException e) {
		            System.out.println("Error al leer el fichero.");
		            e.printStackTrace();
		        }
		    }

		    public static void modificarFichero(File fichero, int lineaABorrar) {
		        File ficheroTemporal = new File("tmp.txt");

		        try (
		            BufferedReader lector = new BufferedReader(new FileReader(fichero));
		            BufferedWriter escritor = new BufferedWriter(new FileWriter(ficheroTemporal))
		        ) {
		            String linea;
		            int numLinea = 1;

		            while ((linea = lector.readLine()) != null) {
		                if (numLinea != lineaABorrar) {
		                    escritor.write(linea);
		                    escritor.newLine();
		                }
		                numLinea++;
		            }

		        } catch (IOException e) {
		            System.out.println("Error al modificar el fichero.");
		            e.printStackTrace();
		            return;
		        }

		        
		        if (fichero.delete()) {
		            if (!ficheroTemporal.renameTo(fichero)) {
		                System.out.println("No se pudo renombrar el archivo temporal.");
		            }
		        } else {
		            System.out.println("No se pudo eliminar el fichero original.");
		        }
		    }
}
}