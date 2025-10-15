package Objetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class ejercicio_27{
	
	

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			System.out.println("MENÚ: \n1-. Dar de alta empleados \n2-. Buscar empleados \n3-. Listar empleados"
					+ "\n4-. Borrar empleado \n5-. Salir: ");
			opcion = leer.nextInt(); 
			leer.nextLine();
			
		
		
		switch(opcion) {
		
		case 1: 
			Alumno a = new Alumno(opcion, null, null);
			int expediente; String nombre, apellido;
			
			System.out.println("Introduce el número de expediente: ");
			expediente = leer.nextInt();
			System.out.println("Introduce el nombre del alumno: ");
			nombre = leer.nextLine();
			System.out.println("Introduce el apellido del alumno: ");
			apellido = leer.nextLine();
			
			a = new Alumno(expediente, nombre, apellido);
		
			ObjectOutputStream fichero=null;
			
			 try{
			 File f = new File("alumno.bin"); 
			 if(f.exists()){
			
			 fichero = new MiObjectOutputStream(new FileOutputStream("alumno.bin",true));
			 }
			 else{
			 
			 fichero = new ObjectOutputStream(new FileOutputStream("alumno.bin",true));
			 }
			 fichero.writeObject(a);
			 }
			 catch(Exception e){
			 System.out.println(e.getMessage());
		}
			 break;
			 
		case 2: 
			
			
			break;
			
		case 3: 
			break;
			
		case 4: 
			break;
			
		case 5: 
			System.out.println("Has salido del programa. ");
			break; 
		
		default: 
			System.out.println("Opción no válida. ");

	}
		}while(opcion != 5);

	}
}//javijavijaviiiito
