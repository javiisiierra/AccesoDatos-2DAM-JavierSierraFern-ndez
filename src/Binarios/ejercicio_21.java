package Binarios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio_21 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce la ruta del fichero: ");
		String ruta = leer.nextLine();
		int numero;
		
		do {
			System.out.println("Introduce un número entre el 32 y 126: ");
			 numero = leer.nextInt();
		}while(numero < 32 || numero > 126);
		
		try  (FileOutputStream fos = new FileOutputStream(ruta);
				DataOutputStream dos = new DataOutputStream(fos)){
			
			
			dos.writeInt(numero); 	
			
			
			System.out.println("Datos escritos correctamente en "+ ruta);
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
