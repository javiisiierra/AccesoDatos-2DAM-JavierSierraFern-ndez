package Examen1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		try {
			//Instanciar un contexto de la clase JAXBContext con la clase RootElement
			 JAXBContext contexto = JAXBContext.newInstance(Personas.class);
			 //Crear un unmarshaller que convierte el XML en JavaBeans.
			 Unmarshaller um = contexto.createUnmarshaller();
			 //Realizar la deserialización llamando al método unmarshal del marshaller.
			 Personas personas = (Personas) um.unmarshal(new File("C:\\Users\\usuario\\Desktop\\personas.xml"));
			 personas.mostrarPersonas();
			 
				
				try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("personas2.obj"))){
					
					fichero.writeObject(personas); // Guardamos el objeto en el fichero
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} catch (JAXBException e) {
			 e.printStackTrace();
			 }


	}

}