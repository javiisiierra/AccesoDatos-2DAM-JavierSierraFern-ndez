package JSON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class Ejerc_47 {

	public static void main(String[] args) {
		
			File fichero=new File("C:\\Users\\usuario\\Desktop\\ej46recetas.json");
			ObjectMapper mapper = new ObjectMapper();
			 if (fichero.exists()) {
		            try {
		                CollectionType tipoLista = mapper.getTypeFactory()
		                        .constructCollectionType(ArrayList.class, Recetas.class);
		                ArrayList<Recetas> listaRecetas = mapper.readValue(fichero, tipoLista);
		                Recetas.setListaRecetas(listaRecetas);
		            } catch (IOException e) {
		                System.err.println("Error leyendo el fichero JSON. Se iniciará una lista vacía.");
		                Recetas.setListaRecetas(new ArrayList<>());
		            }
		        } else {
		            Recetas.setListaRecetas(new ArrayList<>());
		        }
		
		
		
		
		Scanner leer = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			System.out.println("MENÚ: \n1-. Nueva receta \n2-. Mostrar receta \n3-. Borrar receta"
					+ "\n4-. Salir \nIndica la opción: ");
			opcion = leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
			case 1: 
				Recetas miReceta = new Recetas();
				System.out.println("Introduce el nombre: ");
				miReceta.setNombre(leer.nextLine());
				System.out.println("Introduce el tipo: ");
				miReceta.setTipo(leer.nextLine());
				
				Origen miOrigen = new Origen();
				System.out.println("Introduce el país: ");
				miOrigen.setPais(leer.nextLine());
				System.out.println("Introduce la región: ");
				miOrigen.setRegion(leer.nextLine());
				
				miReceta.setOrigen(miOrigen);
				
				int resp;
				do{
				
				Ingredientes miIngredientes = new Ingredientes();
				
				System.out.println("Ingredientes");
				
				System.out.println("Introduce el nombre: ");
				miIngredientes.setNombre(leer.nextLine());
				System.out.println("Introduce la cantidad: ");
				miIngredientes.setCantidad(leer.nextLine());
				
				miReceta.anadirIngredientes(miIngredientes);
				
				System.out.print("\"Agregar más ingredientes? 1-.Si, 0-.No\": ");
				
				try {
				 resp = Integer.parseInt(leer.nextLine());
				}catch(NumberFormatException e) {
					resp = 0;
				}
				}while(resp != 0);
				Recetas.anadirRecetas(miReceta);
				 try {
                     mapper.writeValue(fichero, Recetas.getListaRecetas());
                     System.out.println("Receta añadida y guardada correctamente.");
                 } catch (IOException e) {
                     System.err.println("Error al guardar el fichero: " + e.getMessage());
                 }
				
				
				break;
			case 2:
				
			Recetas.mostrarRecetas();
				break;
			case 3:
			
			System.out.println("Introduce el nombre: ");
				String nuevoNomb = leer.nextLine();
				
				boolean eliminar = false;
				
				Iterator<Recetas> it = Recetas.getListaRecetas().iterator();
				while(it.hasNext()) {
					Recetas r = it.next();
					if(r.getNombre() != null && r.getNombre().equalsIgnoreCase(nuevoNomb)) {
						it.remove();
						eliminar = true;
						System.out.println("La receta ha sido eliminada.");
						break;
					}
				}
				if (!eliminar) {
			        System.out.println("No se encontró ninguna receta con ese nombre.");
			    } else {
			        // Guardamos los cambios en el JSON
			        try {
			            mapper.writeValue(fichero, Recetas.getListaRecetas());
			        } catch (IOException e) {
			            System.err.println("Error al guardar el fichero tras borrar: " + e.getMessage());
			        }
			    }

				break;
			case 4: 
				System.out.println("Has salido del programa");
				break;
			default:
				System.out.println("Indica una opción válida");
			}
	
			
			
			
		}while(opcion != 4);

	}

}
