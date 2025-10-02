package Condicionales;

import java.util.Scanner;

public class Ejerc13 {

	public static void main(String[] args) {
		/*Pedir la calificación numérica y decir si es un sobresaliente, notable, bien, suficiente o
		insuficiente (usando el swicth)*/
		
		System.out.println("Introduce la nota: ");
		
		Scanner leer = new Scanner(System.in);
		
		int num = leer.nextInt();
		
		
		switch (num) {
		
		case 0,1,2,3,4:
			System.out.println("Insuficiente. ");
			break;
			
		case 5:
			System.out.println("Suficiente. ");
			break;
			
		case 6:
			System.out.println("Bien. ");
			break;
			
		case 7,8:
			System.out.println("Notable. ");
			break;
			
		case 9,10:
			System.out.println("Sobresaliente. ");
			break;
				
			
		default: 
			System.out.println("Número no válido. ");
		}

	}

}
