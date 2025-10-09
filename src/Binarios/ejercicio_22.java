package Binarios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio_22 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce la ruta del fichero que contiene un número: ");
		String ruta = leer.nextLine();
		
		try  (FileInputStream fis = new FileInputStream(ruta);
				DataInputStream dis = new DataInputStream(fis)){
			
			
			
			int numero = dis.readInt();
			
			
			System.out.println("Número: " + numero);
			
	}catch (IOException e) {
		e.printStackTrace();;
	}
	}

}
