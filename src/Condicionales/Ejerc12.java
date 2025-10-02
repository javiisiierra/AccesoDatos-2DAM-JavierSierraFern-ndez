package Condicionales;

import java.util.Scanner;

public class Ejerc12 {

	public static void main(String[] args) {
		// Pedir la calificación numérica y decir si es un sobresaliente, notable, bien, suficiente o
				//insuficiente (usando el if)
				
				System.out.println("Introduce la nota: ");
				
				Scanner leer = new Scanner(System.in);
				
				double num = leer.nextDouble();
				
				if (num >= 9) {
					System.out.println("Sobresaliente. ");
				}
				
				else if(num >= 7 && num <= 9) {
					System.out.println("Notable. ");
				}
				
				else if(num >= 6 && num <=7) {
					System.out.println("Bien. ");
				}
				
				else if(num >= 5 && num <=6) {
					System.out.println("Suficiente. ");
				}
				
				else if(num <= 5) {
					System.out.println("Insuficiente. ");
				}
		

	}

}
