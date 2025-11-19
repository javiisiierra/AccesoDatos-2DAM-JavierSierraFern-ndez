package ExamenRamon;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import Examen2.Lista;

public class Ejercicio4Examen {

	public static void main(String[] args) {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("restaurantes.dat"))) {
			Lista2 l = (Lista2) ois.readObject();

			
		
			JAXBContext jaxbContext = JAXBContext.newInstance(Lista2.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			// Configuración opcional para formato legible
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			// Convertir objeto a XML y mostrar en consola
			
			marshaller.marshal(l, new File("ejerc4Examen.xml"));
			System.out.println("Xml creado");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
