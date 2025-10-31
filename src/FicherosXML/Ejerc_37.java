package FicherosXML;

import java.io.File;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

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
		
		TreeSet<Alumno> listaAlumno = new TreeSet<>(Comparator.comparingInt(Alumno::getNumExpediente));
		
		Scanner leer = new Scanner(System.in);
		int opcion;
		
		
		do {
			
			System.out.println("Menú: \n1-.Introducir alumno \n2-.Salir");
			 opcion = leer.nextInt();
			 leer.nextLine();
			 
			 
			 switch(opcion) {
			 
			 case 1:
				 Alumno alumno = new Alumno();
				 
				 System.out.println("Introduce el número de expediente: ");
				 alumno.setNumExpediente(leer.nextInt());
				 leer.nextLine();
				 System.out.println("Introduce el nombre: ");
				 alumno.setNombre(leer.nextLine());
				 
				 System.out.println("Introduce la nota: ");
				 alumno.setNota(leer.nextDouble());
				 leer.nextLine();
				 listaAlumno.add(alumno);
				 
				 
				 
				 break;
				 
				 
			 case 2: 
				 System.out.println("Has salido del programa");
				 break; 
				 
				default: 
					System.out.println("Pulsa una opción válida");
			 
			 
			 }
			 
			 
			
		}while(opcion != 2);
		try {
			DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder db = factoria.newDocumentBuilder();
			
			Document documento = db.newDocument();
			
			documento.setXmlVersion("1.0");
			
			Element elemento = documento.createElement("alumnos");
			
			documento.appendChild(elemento);
			
			for(Alumno a : listaAlumno) {
				Element elementoAlumno = documento.createElement("alumno");
				
				elemento.appendChild(elementoAlumno);
				
				Element expediente = documento.createElement("numExpediente");
				
				elementoAlumno.appendChild(expediente);
				
				expediente.appendChild(documento.createTextNode(String.valueOf(a.getNumExpediente())));
				
				Element nomAlumno = documento.createElement("nombre");
				
				elementoAlumno.appendChild(nomAlumno);
				
				nomAlumno.appendChild(documento.createTextNode(String.valueOf(a.getNombre())));
				
				Element notAlumno = documento.createElement("nota");
				
				elementoAlumno.appendChild(notAlumno);
				
				notAlumno.appendChild(documento.createTextNode(String.valueOf(a.getNota())));
				
				}
			
			
			
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
			
	 
		
		
	}

}

