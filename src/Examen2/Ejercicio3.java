 	package Examen2;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce el id: ");
		int nuevID = leer.nextInt();
		
		boolean encontrado = false;
		
		try {
			RandomAccessFile ran = new RandomAccessFile("precio.dat", "r");
		while(ran.getFilePointer() < ran.length()) {
			int id = ran.readInt();
			int precio = ran.readInt();
			int coste = ran.readInt();
			int descuento = ran.readInt();
			
			if(id == nuevID) {
				double beneficio = precio-(precio*descuento/100)-coste;
				System.out.println("ID: "+id);
				System.out.println("Precio: "+precio);
				System.out.println("Coste: "+coste);
				System.out.println("Descuento: "+descuento);
				System.out.println("Beneficio: "+beneficio);
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
