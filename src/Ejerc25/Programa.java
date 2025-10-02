package Ejerc25;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		
		
		Persona p1 = new Persona("Manuel", "Fernández", "80104188J", 22, "Soltero");
		Persona p2 = new Persona("Paola", "Pérez", "80103256L", 32, "Casada");
		
		if(p1.getEdad() > p2.getEdad()) {
			
			System.out.println(p1.getNombre() + " Es la mayor.");
		}
		
		else {
			System.out.println(p2.getNombre() + " Es la mayor");
		}

	}

}
