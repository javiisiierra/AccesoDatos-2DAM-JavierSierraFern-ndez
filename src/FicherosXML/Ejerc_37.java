package FicherosXML;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
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
				 String numExpediente = leer.nextLine();
				 leer.nextLine();
				 System.out.println("Introduce el nombre: ");
				 String nombre = leer.nextLine();
				 System.out.println("Introduce la nota: ");
				 String nota = leer.nextLine();
				 
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
						
						//ALUMNOS
						documento.appendChild(elemento);
						//ALUMNO COMO HUIJO DE ALUMNOS
						elemento.appendChild(elemento1);
						
						
						//METES EL VALOR DEL EXPEDIENTE
						elemento2.appendChild(documento.createTextNode(numExpediente));
						//LO PONES COMO HIJO DE ALUMNO
						elemento1.appendChild(elemento2);
						//METES EL VALOR DEL NOMBRE
						elemento3.appendChild(documento.createTextNode(nombre));
						//LO AÑADO
						elemento1.appendChild(elemento3);
						
						//METES EL VALOR EXPEDIENTE
						elemento4.appendChild(documento.createTextNode(nota));
						//LO AÑADO
						elemento1.appendChild(elemento4);
						
						elemento2.setTextContent(numExpediente);
						elemento3.setTextContent(nombre);
						elemento4.setTextContent(nota);
						
						DOMSource fuente = new DOMSource(documento);
						StreamResult ficheroXML = new StreamResult(new File("ejerc37.xml"));
						
						StreamResult consola = new StreamResult(System.out);
						
						 Transformer t = null;
						try {
							t = TransformerFactory.newInstance().newTransformer();
						} catch (TransformerConfigurationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (TransformerFactoryConfigurationError e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						 t.setOutputProperty(OutputKeys.INDENT, "yes");
						 t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
						 
						 try {
							t.transform(fuente, ficheroXML);
						} catch (TransformerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 
						  try {
							t.transform(fuente, consola);
						} catch (TransformerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
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

