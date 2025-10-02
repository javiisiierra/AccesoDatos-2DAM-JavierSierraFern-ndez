package Condicionales;

import java.util.Scanner;

public class Ejerc10 {

	public static void main(String[] args) {
		

		/* Recuerda las mates nº naturales: 1, 2, 3… nº enteros ..-2,-1,0,1,2.. Pedir un número entero
		y ver primero si es positivo. Si es positivo, se verifica si es par o impar dentro del primer if.
		Si el número es negativo, se imprime "El número es negativo".*/

		
		
		System.out.println("Introduce un número entero: ");
		
		Scanner leer = new Scanner(System.in);
		
		int num = leer.nextInt();
		
		
		if (num >= 0) {
			System.out.println("El número introducido es positivo.");
			
			if(num%2 ==0) {
				System.out.println("El número " +num+ " es par.");
			}
			
			else {
				System.out.println("El número " +num+ " es impar. ");
			}
			
			}
		else {
			System.out.println("El número introducido en negativo.");
		}

		
		
	}

}
