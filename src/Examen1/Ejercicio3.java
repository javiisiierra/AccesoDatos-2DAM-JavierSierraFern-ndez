package Examen1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		try {
			ObjectInput ois = new ObjectInputStream(new FileInputStream("personas1.obj"));
			ObjectInput ois2 = new ObjectInputStream(new FileInputStream("personas2.obj"));
			
				 Personas lista1 = (Personas) ois.readObject();
				 Personas lista2 = (Personas) ois2.readObject();
				 
				 
				 ArrayList<persona> fusionados = new ArrayList<persona>();
				 
				 for(persona p: lista1.getPersonas()) {
					 for(persona p2 : lista2.getPersonas()) {
						 if(p.getDni().equalsIgnoreCase(p2.getDni())) {
							 persona fusion = new persona(
									 p.getDni(),
									 p.getNombre(),
									 p2.getEmail(),				//Hay que poner esta "lista", con los atributos en el mismo orden que tenga el contructor de la clase persona					 
									 p.getEdad(),
									 p2.getTelefono()
									 );
							fusionados.add(fusion);
						 }
					 }
				 }
			Personas resultado = new Personas(fusionados);
			try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("personas.obj"))){
				
				fichero.writeObject(resultado); // Guardamos el objeto en el fichero
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}