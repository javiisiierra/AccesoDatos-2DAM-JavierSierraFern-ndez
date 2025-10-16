package Objetos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class ejercicio_27{
	
	

	public static void main(String[] args) throws EOFException {
		
		
		Scanner leer = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			System.out.println("MENÚ: \n1-. Dar de alta a un alumno \n2-. Buscar alumnos \n3-. Listar alumnos"
					+ "\n4-. Borrar alumno \n5-. Salir: ");
			opcion = leer.nextInt(); 
			leer.nextLine();
			
		
		
		switch(opcion) {
		
		case 1: 
			Alumno a = new Alumno(opcion, null, null);
			int expediente; String nombre, apellido;
			
			System.out.println("Introduce el número de expediente: ");
			expediente = Integer.parseInt(leer.nextLine());
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
			
			System.out.println("Introduce el número de expediente: ");
			int expediente1 = leer.nextInt();
			
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumno.bin"))){
				boolean encontrado = false;
				
				while(true) {
					try {
				Alumno alumno = (Alumno) ois.readObject();
				
				if(alumno.getExpediente() == expediente1) {
					System.out.println("Alumno encontrado: " + alumno);
					encontrado = true;
					break;
				}

					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}	
				
				if (!encontrado) {
					System.out.println("Archivo no encontrado. ");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			break;
			
		case 3: 
		
		    try (ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("alumno.bin"))) {
		        System.out.println("Listado de alumnos:");

		        while (true) {
		            try {
		                Alumno a1 = (Alumno) fichero1.readObject();
		                System.out.println(a1);
		            } catch (EOFException e) {
		                break; 
		            } catch (ClassNotFoundException e) {
		                System.out.println("Clase Alumno no encontrada.");
		            }
		        }

		    } catch (FileNotFoundException e) {
		        System.out.println("No se encontró el archivo 'alumno.bin'.");
		    } catch (IOException e) {
		        System.out.println("Error al leer el archivo: " + e.getMessage());
		    }

		    break;

			
		case 4: 
			System.out.println("Introduce el número de expediente del alumno a borrar: ");
			int borrar = leer.nextInt();
			
			 File ficheroTemporal = new File("tmp.bin");
			 File ficheroOriginal = new File("alumno.bin");
			 
			 boolean encontrado = false;

		        try (
		            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroOriginal));
		        		
		        ) {
		        	
		        	ObjectOutputStream oos;
		        	 
					if (ficheroTemporal.exists()) {
		                 oos = new MiObjectOutputStream(new FileOutputStream(ficheroTemporal, true));
		             } else {
		                 oos = new ObjectOutputStream(new FileOutputStream(ficheroTemporal));
		             }
		           

					while (true) {
			            try {
			                Alumno alumno = (Alumno) ois.readObject();
			                if (alumno.getExpediente() != borrar) {
			                    oos.writeObject(alumno);
			                } else {
			                    encontrado = true;
			                }
			            } catch (EOFException e) {
			                break;
			            }
			        }

			        oos.close(); 

			    } catch (IOException | ClassNotFoundException e) {
			        System.out.println("Error al procesar el archivo: " + e.getMessage());
			        e.printStackTrace();
			        break;
			    }

			    
			    if (encontrado) {
			        
			        if (ficheroOriginal.delete()) {
			            if (ficheroTemporal.renameTo(ficheroOriginal)) {
			                System.out.println("Alumno borrado correctamente.");
			            } else {
			                System.out.println("No se pudo renombrar el archivo temporal.");
			            }
			        } else {
			            System.out.println("No se pudo eliminar el archivo original.");
			        }
			    } else {
			        System.out.println("Alumno no encontrado.");
			        ficheroTemporal.delete(); 
			    }

			    break;
			
		case 5: 
			System.out.println("Has salido del programa. ");
			break; 
		
		default: 
			System.out.println("Opción no válida. ");

	}
		}while(opcion != 5);

	}
}
