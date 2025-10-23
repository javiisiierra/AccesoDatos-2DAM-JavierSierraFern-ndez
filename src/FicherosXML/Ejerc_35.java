package FicherosXML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.*;

public class Ejerc_35 {
	
	/*Crea un documento DOM vacío, añade un nodo raíz llamado profesores, un nodo
elemento llamado profesor con un atributo grupo 2DAM y un nodo texto. Muestra el
resultado por consola.*/

	public static void main(String[] args) throws
	
	TransformerFactoryConfigurationError, TransformerException {
		
		try {
			DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder db = factoria.newDocumentBuilder();
			
			Document documento = db.newDocument();
			
			documento.setXmlVersion("1.0");
			
			Element elemento = documento.createElement("profesores");
			Element elemento1 = documento.createElement("profesor");
			
			documento.appendChild(elemento);
			elemento.appendChild(elemento1);
			elemento1.setAttribute("grupo", "2DAM");
			elemento1.setTextContent("Javier Sierra");
			
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
			
		
	
		
		
	}

}
