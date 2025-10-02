package Bucles;

import Ejerc25.Persona;

public class Ejerc23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p[] = new Persona [5];

		
		Persona p1 = new Persona("Manuel", "Fernández", "80104188J", 22, "Soltero");
		Persona p2 = new Persona("Paola", "Pérez", "80103256L", 32, "Casada");
		Persona p3 = new Persona("Javier", "Fernández", "80101238P", 42, "Soltero");
		Persona p4 = new Persona("Lucia", "Garcia", "80103254T", 32, "Soltera");
		Persona p5 = new Persona("Luis", "Sanz", "80205732R", 62, "Casado");
		
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		p[3] = p4;
		p[4] = p5;
		
		for(Persona ll: p) {
			System.out.println(ll.toString());
		}
		
		
			
	}

}
