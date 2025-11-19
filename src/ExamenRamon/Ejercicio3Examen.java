package ExamenRamon;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3Examen {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el id: ");
		int nuevoID = leer.nextInt();
		
		boolean encontrado = false;
		
		try {
			//Accedes de manera aleatorio al ficheo, y con "r". solo lo leer, por lo que debe existir
			RandomAccessFile ran = new RandomAccessFile("popularidad.dat", "r");
			//Con el FilePointer recorre hasta el final del fichero
		while(ran.getFilePointer() < ran.length()) {
			int id = ran.readInt();
			double valoracion = ran.readDouble();
			int numPedidos = ran.readInt();
			
			
			
			if(id == nuevoID) {
				double indice = numPedidos * valoracion;
				System.out.println("ID: "+id);
				System.out.println("Valoracion: "+valoracion);
				System.out.println("Número de Pedidos: "+numPedidos);			
				System.out.println("Indice Popularidad: "+indice);
				
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("El id no se ha encontrado");
		}
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	

	}

}
