package JSON;

import java.io.IOException;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EjemploPersonasJSON {

	public static void main(String[] args) {
		
		
		File fichero=new File("/home/diurno/Escritorio/leerPersonas.json");
		
		if (fichero.exists())
		
		{
		System.out.println("El fichero existe.");
		ObjectMapper mapper = new ObjectMapper();
				
		
		try {
			
			PersonasJSON personas = mapper.readValue(fichero, PersonasJSON.class);
		
			// Imprimir las personas
			
			personas.mostrarPersonas();
			
			
			
			
			} catch (IOException e) {
			e.printStackTrace();
			 }

	       }
		
		else {
			System.out.println("El fichero no existe.");
			
		}
		
		}

}
