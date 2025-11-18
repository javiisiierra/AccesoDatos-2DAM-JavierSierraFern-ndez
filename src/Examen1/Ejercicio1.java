package Examen1;

import java.io.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ejercicio1 {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			// Leer el fichero JSON y convertirlo a un objeto de tipo Personas (ArrasList)
			Personas personas = mapper.readValue(new File("C:\\Users\\usuario\\Desktop\\personas.json"), Personas.class);
			// Imprimir el objeto Persona
			personas.mostrarPersonas();
			
			
			try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("personas1.obj"))){
				
				fichero.writeObject(personas); // Guardamos el objeto en el fichero
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	

	}

}