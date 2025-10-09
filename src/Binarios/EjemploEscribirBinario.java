package Binarios;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploEscribirBinario {

	public static void main(String[] args) {
		
		String nombreArchivo = "/home/diurno/Escritorio/AccesoDatos/datos.bin";
		
		try  (FileOutputStream fos = new FileOutputStream(nombreArchivo);
				DataOutputStream dos = new DataOutputStream(fos)){
			
			//Escribir datos binarios
			
			dos.writeInt(123); 	//Escribir un entero
			dos.writeDouble(45.67); //Escribir un double
			dos.writeBoolean(true); //Escribir un booleano
			dos.writeUTF("Hola Mundo"); //Escribir un String en UTF-8
			
			System.out.println("Datos escritos correctamente en "+ nombreArchivo);
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
