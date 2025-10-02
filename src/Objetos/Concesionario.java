package Objetos;

import java.util.Scanner;


public class Concesionario {

	public static void main(String[] args) {
		/* Crea una clase principal llamada Concesionario donde se instancian o crean 2 objetos de la
		clase vehiculo (coche1 y moto1)
		 Para el objeto coche1 los datos se inicializaran llamando al constructor con parámetros
		y le pasamos los datos directamente al constructor.
		 Para el objeto moto1 los datos se inicializaran llamando al constructor por defecto (al
		vacio) y pasaremos los datos utilizando los métodos setters de variables locales
		declaradas en el método main.
		Para este ejercicio nos inventaremos los datos y no será necesario solicitárselos al usuario
		Continuamos con la clase principal anterior. Una vez que tenemos los 2 vehículos vamos a
		mostrar los datos de cada uno de ellos por pantalla, para ello debes emplear los métodos:
		 Para el coche1 los métodos get.
		 Para el moto1 el método toString.
		Una vez mostrados los datos llamaremos al método pvp de cada objeto. Pasándole el
		beneficio que queramos pero comprendido entre 0 y 100.*/
		
		Scanner leer = new Scanner(System.in);
		
		Vehiculos coche1 = new Vehiculos("4183LMP", "Toyota", 15000);
		Vehiculos moto1 = new Vehiculos();
		moto1.setMatricula("8596PLK");
		moto1.setMarca("KTM");
		moto1.setPreciocompra(8000);
		
		
		System.out.println("Matricula: " +coche1.getMatricula()+ " Marca: "+coche1.getMarca()+ " PrecioCompra: "+coche1.getPreciocompra());
		System.out.println(moto1.toString());
			
		
		System.out.println("El precio final es: "+coche1.pvp(89));
		System.out.println("El precio final es: "+moto1.pvp(45));
		
	}

}
