package FicherosXML;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Ejerc_42 {

	public static void main(String[] args) {
		int opcion = 0;
		
		//CREAR LA LIBRERIA(CLASE LIBRERIA)
		Libreria miLibreria = new Libreria();
		
		//PEDIR LOS DATOS DE LA LIBRERIA 
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de la libreria: ");
		miLibreria.setNombre(leer.nextLine());
		
		System.out.println("Introduce el lugar: ");
		miLibreria.setLugar(leer.nextLine());
		
		System.out.println("Introduce el cp: ");
		miLibreria.setCp(Integer.parseInt(leer.nextLine()));
		
		//PEDIR DATOS DE LOS LIBROS DE LA LIBRERIA
		do {
		Libro miLibro = new Libro();
		
		System.out.println("Introduce el título del libro: ");
		miLibro.setTitulo(leer.nextLine());
		
		System.out.println("Introduce el autor del libro: ");
		miLibro.setAutor(leer.nextLine());
		
		System.out.println("Introduce la editorial del libro: ");
		miLibro.setEditorial(leer.nextLine());
		
		System.out.println("Introduce el ISBN del libro: ");
		miLibro.setIsbn(Integer.parseInt(leer.nextLine()));
		
		//AÑADIR LIBRO, NECESITO UN ADD LIBRO, CREO UNU MÉTODO
		miLibreria.anadirLibro(miLibro);
		
		//AÑADIR MÁS LIBROS, EN BUCLE
		System.out.println("Agregar más libros? 1-.Si, 0-.No");
		opcion=Integer.parseInt(leer.nextLine());
		
		}while(opcion != 0);
		
		//PASAR LA LIBREIA A XML
		try {
			// Crear contexto JAXB
			JAXBContext jaxbContext = JAXBContext.newInstance(Libreria.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			// Configuración opcional para formato legible
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			// Convertir objeto a XML y mostrar en consola
			marshaller.marshal(miLibreria, System.out);
			// Convertir objeto a XML y guardar en XML
			marshaller.marshal(miLibreria, new File("ejercicio42.xml"));
			
			} catch (JAXBException e) {
			e.printStackTrace();
			}
		

	}

}
