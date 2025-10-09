package Binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploLeerBinario {

	public static void main(String[] args) {
		
		String nombreArchivo = "/home/diurno/Escritorio/AccesoDatos/datos.bin";
		
		try  (FileInputStream fis = new FileInputStream(nombreArchivo);
				DataInputStream dis = new DataInputStream(fis)){
			
			//leer los datos en el mismo orden que los escribimos
			
			int numero = dis.readInt();
			double decimal = dis.readDouble();
			boolean booleano = dis.readBoolean();
			String texto = dis.readUTF();
			
			System.out.println("Número: " + numero);
			System.out.println("Decimal: " + decimal);
			System.out.println("Booleano: " + booleano);
			System.out.println("Texto: " + texto);
	}catch (IOException e) {
		e.printStackTrace();;
	}
	}

}
