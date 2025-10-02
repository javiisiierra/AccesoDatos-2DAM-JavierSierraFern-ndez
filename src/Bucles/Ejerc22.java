package Bucles;



public class Ejerc22 {

	public static void main(String[] args) {
		// Crea un array con cinco números enteros y muestra después su contenido.
		
		int [] numeros = {12,24,44,62};
		
		System.out.println("Usando un for clásico: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento em posición " + i + ": " + numeros[i]);
		}
		
		System.out.println("\nUsando for-each: ");
		for(int num : numeros) {
			System.out.println(num);
		}

	}

}
