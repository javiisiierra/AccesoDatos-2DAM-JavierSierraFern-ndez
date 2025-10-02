package Condicionales;

import java.util.Scanner;

public class Ejerc11 {

	public static void main(String[] args) {
		// Pedir un número del 1 al 7 e indicar el día de la semana
		
				System.out.println("Introduce un número del 1 al 7: ");
				
				Scanner leer = new Scanner(System.in);
				
				
				int num = leer.nextInt();
				
				
				switch (num) {
				
				case 1:
					System.out.println("El día es Lunes. ");
					break;
					
				case 2:
					System.out.println("El día es Martes. ");
					break;
					
				case 3:
					System.out.println("El día es Miércoles. ");
					break;
					
				case 4:
					System.out.println("El día es Jueves. ");
					break;
					
				case 5:
					System.out.println("El día es Viernes. ");
					break;
					
				case 6:
					System.out.println("El día es Sábado. ");
					break;
					
				case 7:
					System.out.println("El día es Domingo. ");
					break;	
					
				default: 
					System.out.println("Número no válido. ");
				}

	}

}
