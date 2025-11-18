package Examen1;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el dni: ");
		String dniNuev = leer.nextLine();
		
		boolean encontrado = false;

		
		try {
			RandomAccessFile archivo = new RandomAccessFile("telefonos.bin", "r");
			
			while(archivo.getFilePointer() < archivo.length()) {
				 String dni = archivo.readUTF();   // se lee igual que se escribió
	                int tlf = archivo.readInt();

	                if (dni.equalsIgnoreCase(dniNuev)) {
	                    System.out.println("Teléfono: " + tlf);
	                    encontrado = true;
	                    break;
	                }
			}
		
			if(!encontrado) {
				System.out.println("Dni no encontrado");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}