package EjercicioPrueba;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el dni: ");
		String dni2 = leer.nextLine();
		
		try {
			RandomAccessFile archivo = new RandomAccessFile("C:\\Users\\\\usuario\\git\\AccesoDatos-2DAM-JavierSierraFern-ndez\\telefonos.bin", "r");
			boolean encontrado = false;
			while (archivo.getFilePointer() < archivo.length()) {
				String dni = archivo.readUTF();
				int telefono = archivo.readInt();
				
				if(dni.equalsIgnoreCase(dni2)) {
					System.out.println("Teléfono: "+telefono);
					encontrado = true;
					break;
				}
				
				}
			if(!encontrado) {
				System.out.println("El dni no se ha encontrado");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
