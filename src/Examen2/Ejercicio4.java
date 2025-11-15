package Examen2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Ejercicio4 {

	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ropa.dat"))) {
			Lista l = (Lista) ois.readObject();

			
		
			JAXBContext jaxbContext = JAXBContext.newInstance(Lista.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			// Configuración opcional para formato legible
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			// Convertir objeto a XML y mostrar en consola
			//l no es un 1, es la 1 de lo que esta declarado arriba Lista l
			marshaller.marshal(l, new File("ejerc4.xml"));//Si en vez de querrer crear un fichero.xml, quiero mostrar por pantalla. en vez 
			//de lo de new File("ejerc4.xml"), pongo System.out
		} catch (Exception e) {
			// TODO: handle exception
		}

		

	}

}
