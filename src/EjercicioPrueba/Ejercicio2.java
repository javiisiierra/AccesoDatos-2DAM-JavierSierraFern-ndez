package EjercicioPrueba;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		try {
			 JAXBContext contexto = JAXBContext.newInstance(personas2.class);
			 Unmarshaller um = contexto.createUnmarshaller();
			 personas2 personas = (personas2) um.unmarshal(new File("/home/diurno/Escritorio/personas.xml"));
			 personas.mostrarPersonas2();
			 
			} catch (JAXBException e) {
			 e.printStackTrace();
			 }

	}

}
