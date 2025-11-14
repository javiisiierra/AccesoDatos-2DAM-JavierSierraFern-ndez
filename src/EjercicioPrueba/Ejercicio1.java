package EjercicioPrueba;

import java.io.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import FicherosXML.Personas;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		 try {
		 // Leer el fichero JSON y convertirlo a un objeto de tipo Personas (ArrasList)
		 personas Personas = mapper.readValue(new File("/home/diurno/Escritorio/personas.json"), personas.class);
		 // Imprimir el objeto Persona
		 System.out.println("Resultado");
		 Personas.mostrarPersonas();
		 
		 
		  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas1.obj"));
			 oos.writeObject(Personas);
			 oos.close();
			
		 
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 
		
		 }
	

	}

