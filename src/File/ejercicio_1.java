package File;
import java.io.*;
import java.io.IOException;
public class ejercicio_1 {

	public static void main(String[] args) {
		//Mostrar la ruta absoluta de la carpeta actual
		/*La ruta absoluta de la carpeta actual es:
C:\Users\dam23\Desktop\workSpace\EjerciciosUnidad1*/
		
		
		
		try {
			
			File file = new File("EjerciciciosUnidad1.txt");
			if(file.createNewFile()) {
				System.out.println("Fichero creado correctamente. ");
				System.out.println(file.getAbsolutePath());
			}else {
				System.out.println("Ya existe el nuevo fichero. ");
			}
			
			
			
		}catch(IOException e) {
			System.out.println("Error. ");
		}

	}

}
