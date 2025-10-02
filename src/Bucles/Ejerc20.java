package Bucles;

import java.util.Scanner;

public class Ejerc20 {

	public static void main(String[] args) {
		/*Escribe un programa que permita al usuario adivinar un número entre 1 y 100. El programa
debe guiar al usuario diciéndole si el número es mayor o menor que el que ingresó.*/
		
	
		
		Scanner leer = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random()*100 )+ 1;
		
	
		int numero = 0;
		do {
			
			do {
				
				try {
					
					System.out.println("Adivina un número entre el 1 y el 100: ");
					 numero = leer.nextInt();
					 
				}catch(Exception  e) {
					System.out.println("Opción no válida. ");
					leer.nextLine();
				}
				
			}while(numero < 1 || numero > 100) ;
			
			
			
			if (numero < 1 || numero > 100) {
				System.out.println("Introduce un número permitido, entre el 1 y el 100.");
			}
		 else if (numero < aleatorio) {
            System.out.println("El número es mayor.");
        } else if (numero > aleatorio) {
            System.out.println("El número es menor.");
        } else {
            System.out.println("Adivinaste el número.");
        }
			
			

		}while (numero != aleatorio);
		
	
		leer.close();

	}
	

}
