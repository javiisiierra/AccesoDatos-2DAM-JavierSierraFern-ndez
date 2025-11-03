package FicherosXML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Ejerc_43 {

	public static void main(String[] args) {

		try {
		JAXBContext contexto = JAXBContext.newInstance(Libreria.class);
        Unmarshaller um = contexto.createUnmarshaller();
		Libreria miLibreria = (Libreria) um.unmarshal(new File("ejercicio42.xml"));
		
		System.out.println("Nombre de la libreria: "+miLibreria.getNombre());
		System.out.println("Lugar: "+miLibreria.getLugar());
		System.out.println("CP: "+miLibreria.getCp());
		
		System.out.println("Libros disponibles: ");
		for(Libro libro : miLibreria.listaLibros) {
			System.out.println("Título: "+libro.getTitulo()+ "\tAutor: "+libro.getAutor()+
					"\tEditorial: "+libro.getEditorial()+ "\tISBN: "+libro.getIsbn());
			
		}
		} catch (JAXBException e) {
		    System.out.println("Error unmarshalling XML:");
		    e.printStackTrace();
		}

	}

}
