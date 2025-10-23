/*package FicherosXML;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejerc_37 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int opcion;
		
		
		do {
			
			System.out.println("Menú: \n1-. Introducir alumno \n2-.Salir");
			 opcion = leer.nextInt();
			 
			 
			 
			 switch(opcion) {
			 
			 case 1:
				 System.out.println("Introduce el número de expediente: ");
				 int numExpediente = leer.nextInt();
				 System.out.println("Introduce el nombre: ");
				 String nombre = leer.nextLine();
				 System.out.println("Introduce la nota: ");
				 double nota = leer.nextDouble();
				 
				 try {
						DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
						
						DocumentBuilder db = factoria.newDocumentBuilder();
						
						Document documento = db.newDocument();
						
						documento.setXmlVersion("1.0");
						
						Element elemento = documento.createElement("alumnos");
						Element elemento1 = documento.createElement("alumno");
						Element elemento2 = documento.createElement("numExpediente");
						Element elemento3 = documento.createElement("nombreAlumno");
						Element elemento4 = documento.createElement("nota");
						
						documento.appendChild(elemento);
						elemento.appendChild(elemento1);
						elemento1.appendChild(elemento2);
						elemento2.setTextContent(String.valueOf(numExpediente));
						elemento3.setTextContent(nombre);
						elemento.setTextContent(Double.toString(nota));
						
						DOMSource fuente = new DOMSource(documento);
						StreamResult ficheroXML = new StreamResult(new File("ejerc35.xml"));
						
						StreamResult consola = new StreamResult(System.out);
						
						 Transformer t = TransformerFactory.newInstance().newTransformer();
						
						 t.setOutputProperty(OutputKeys.INDENT, "yes");
						 t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
						 
						 t.transform(fuente, ficheroXML);
						 
						  t.transform(fuente, consola);
						 } catch (ParserConfigurationException e) {
						 }
						
				 
				 
				 break;
				 
				 
			 case 2: 
				 System.out.println("Has salido del programa");
				 break; 
				 
				default: 
					System.out.println("Pulsa una opción válida");
			 
			 
			 }
			 
			 
			
		}while(opcion != 2);
		
		
		
	}

}
*/
