package AccesoAleatorio;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class EjemploAleatorioNumero {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		try {
			//Crear o abrir archivo para escribir
			RandomAccessFile archivo = new RandomAccessFile("numero.txt", "rw");
			
			//Escribir datos en el archivo
			archivo.writeInt(1);  //4 byte
			archivo.writeDouble(5.5);    //8 byte
			
			archivo.writeInt(2);  //Otro Int
			archivo.writeDouble(7.7);    //Otro Double
			
			archivo.writeInt(3);  //Tercer Int
			archivo.writeDouble(9.9);    //Tercer Double
			
			//Variables
			int numPosicion;
			double valor;
			
			//Solicitar al usuario el nombre del fichero
			System.out.println("Introduce el orden la nota a buscar: ");
			int numeroLeer = Integer.parseInt(leer.nextLine());
			
			//Ir al inicio del archivo
			archivo.seek(0);
			
			//Bucle para leer todos los datos
			try {
				while(true) { //Leer hasta el final del archivo
					numPosicion = archivo.readInt();
					
					
					if(numPosicion == numeroLeer) {
						valor = archivo.readDouble();
						System.out.println("Número encontrado: " + numPosicion + ", valor: " + valor);
						break;
					}else {
						archivo.skipBytes(0);
					}
				}
			}catch(EOFException e) {
				//Llegamos al final del archivo
				System.out.println("Fin del archivo. ");
			}
			
			//Cerramos el archivo
			archivo.close();
			
		}catch(IOException e) {
			System.out.println();
		}
		
	
	
	}

}
