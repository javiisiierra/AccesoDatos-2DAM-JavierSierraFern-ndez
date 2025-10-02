package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;



public class Ejerc35 {

	public static void main(String[] args) {
		/*35. Crea una aplicación con un menú de operaciones que nos permita trabajar uno de los
ejercicios anteriores.
1.- Añadir elemento
2.- Borrar elemento
3.- Listar
4.- Salir*/
		
		ArrayList<String> ListaNombres = new ArrayList<String>();
		
		Scanner leer = new Scanner(System.in);
		
		String opcion;
		
		
		do {
			System.out.print("Menú: \n1-. Añadir elemento \n2-.Borrar elemento \n3-. Listar \n4-. Salir. ");
			 opcion = leer.nextLine().toUpperCase();
			
			switch(opcion) {
			
			case "1": 
				System.out.println("Introduce elemento: ");
				String incorpora = leer.nextLine();
				ListaNombres.add(incorpora);
				
			break;
			
			case "2":
				System.out.println("¿Qué elemento quieres borrar?: ");
				String borrar = leer.nextLine();
				
				if(ListaNombres.contains(borrar)) {
					
					ListaNombres.remove(borrar);
					
				}else
					System.out.println("Introduce un nombre qué este en la lista. ");
				
			break;
			
			case "3":
				for (String l : ListaNombres) {
					System.out.println(l);
				}
				
				break;
				
			case "4":
				System.out.println("Has salido del programa guapo!!. ");
				
				break;
				
				default: 
					System.out.println("Opción no válida. ");
			
			}
			
			
		}while(!opcion.equals("4"));

	}

}
