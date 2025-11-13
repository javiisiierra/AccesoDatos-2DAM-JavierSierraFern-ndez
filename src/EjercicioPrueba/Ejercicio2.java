package EjercicioPrueba;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.*;


public class Ejercicio2 {

	public static void main(String[] args) {
		
		try {
			JAXBContext contexto = JAXBContext.newInstance(personas.class);
			 Unmarshaller um = contexto.createUnmarshaller();
			 personas personas2 = (personas) um.unmarshal(new File("/home/diurno/Escritorio/personas.xml"));
			 
			 personas2.mostrarPersonas();
			 
			 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas2.obj"));
			 oos.writeObject(personas2);
			 oos.close();
			 
			} catch (JAXBException e) {
			 e.printStackTrace();
			 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	}

}
