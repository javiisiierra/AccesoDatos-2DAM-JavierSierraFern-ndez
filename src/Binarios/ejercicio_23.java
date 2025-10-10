package Binarios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ejercicio_23 {

	public static void main(String[] args) {

		Scanner leer = new Scanner (System.in);
		
			int opcion;
		
		do {
			
			System.out.println("Menú: \n1 - Introducir alumno \n2 - Salir:");
			opcion = leer.nextInt();
			
			switch(opcion) {
			
			case 1: 
				
				System.out.println("Introduce el número de expediente del alumno: ");
				 int expediente = leer.nextInt();
				 leer.nextLine();
				
				System.out.println("Introduce el nombre del alumno: ");
				String nombre = leer.nextLine();
				
				System.out.println("Introduce la nota del alumno: ");
				double nota = leer.nextDouble();
				
				try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("alumnos18.bin"))){
					dos.writeInt(expediente);
					dos.writeDouble(nota);
					
					
					for(char c : nombre.toCharArray()) {
						dos.writeChar(c);
					}
					dos.writeChars("\n");
					
					
					
					
					System.out.println("Datos guardados en el fichero");
				
			}catch (Exception e){
				e.printStackTrace();
			}
				
				break;
				
			case 2: 
				
				System.out.println("Has salido del programa");
				
				break;
				
				default: 
					System.out.println("Error, introduce una opción válida");
				}

			

		
		}while(opcion != 2);

	}

}
