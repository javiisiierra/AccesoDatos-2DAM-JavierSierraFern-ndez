package JSON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class LibreriaPaqui {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		ObjectMapper mapper = new ObjectMapper();
		File fichero=new File("C:\\Users\\usuario\\Desktop\\datosPaqui.json");
		Libreria miLibreria = new Libreria();
		miLibreria.setLiberia("Paqui");
		
		 if (fichero.exists()) {
	            try {
	               /* ArrayList<Libro> libros = mapper.readValue(fichero,
	                        mapper.getTypeFactory().constructCollectionType(ArrayList.class, Libro.class));
	                miLibreria.setListaLibros(libros);*/
	            	miLibreria = mapper.readValue(fichero, Libreria.class);
	                System.out.println("Datos cargados correctamente.");
	            } catch (IOException e) {
	                System.err.println("Error leyendo el fichero JSON. Se iniciará una lista vacía.");
	            }
	        } else {
	            System.out.println("Fichero no encontrado. Se iniciará una lista vacía.");
	        }
		
		
		
		int opcion = 0;
		
		
		do {
			System.out.println("MENÚ: \n1-.Nuevo libro \n2-.Modificar libro \n3-.Borrar libro \n4-.Mostrar libreria \n5-.Salir"
					+ "\nElige una opción: ");
			opcion = leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
			case 1: 
				Libro miLibro = new Libro();
				System.out.println("Introduce nombre: ");
				miLibro.setNombre(leer.nextLine());
				System.out.println("Introduce autor: ");
				miLibro.setAutor(leer.nextLine());
				System.out.println("Introduce la editorial: ");
				miLibro.setEditorial(leer.nextLine());
				System.out.println("Introduce isbn: ");
				miLibro.setIsbn(Integer.parseInt(leer.nextLine()));
				
				miLibreria.anadirLibro(miLibro);

				break;
			case 2:
				System.out.println("Introduce el isbn: ");
				int isbnModificar = Integer.parseInt(leer.nextLine());
				System.out.println("Introduce el nuevo nombre: ");
				String nuevoNombre = leer.nextLine();
				System.out.println("Introduce el autor: ");
				String nuevoAutor = leer.nextLine();
				System.out.println("Introduce la nueva editorial: ");
				String nuevaEditorial = leer.nextLine();
				boolean modificado = miLibreria.modificarLibro(isbnModificar, nuevoNombre, nuevoAutor, nuevaEditorial);
				
				if(modificado) {
					System.out.println("Libro modificado");
				}else {
					System.out.println("El libro no se ha modificado");
				}
			
				break;
			case 3:
				System.out.println("Introduce el isbn: ");
				int isbnBorrar = Integer.parseInt(leer.nextLine());
				
				boolean borrado = miLibreria.borrarLibro(isbnBorrar);
				if(borrado) {
					System.out.println("El libro se ha eliinado");
				}else {
					System.out.println("El libro no se ha borrado");
				}
				
				break;
			case 4:
				System.out.println(miLibreria);
				break;
			case 5:
				  try {
                      mapper.writerWithDefaultPrettyPrinter().writeValue(fichero, miLibreria);
                      System.out.println("Datos guardados en datosPaqui.json.");
                  } catch (IOException e) {
                      System.err.println("Error al guardar los datos.");
                  }
				System.out.println("Has salido del programa");
			break;
			default:
				System.out.println("Introduce una opción válida");
			
			}	
		}while(opcion != 5);
		

	}

}
