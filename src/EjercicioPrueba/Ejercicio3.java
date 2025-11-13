package EjercicioPrueba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Objetos.MiObjectOutputStream;

public class Ejercicio3 {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		
		personas lista1 = (personas) new ObjectInputStream(new FileInputStream("personas1.obj")).readObject();
		personas lista2 = (personas) new ObjectInputStream(new FileInputStream("personas2.obj")).readObject();
		
		
		Map<String, Persona1> mapa = new HashMap<>();
			for(Persona1 p : lista1.getPersonas()) {
				mapa.put(p.getDni(), p);
			}
		for(Persona1 p : lista2.getPersonas()) {
			if(mapa.containsKey(p.getDni())) {
				Persona1 existente = mapa.get(p.getDni());
				existente.setTelefono(p.getTelefono());
				existente.setEmail(p.getEmail());
			}
		}
		personas fusionadas = new personas();
		fusionadas.setPersonas(new ArrayList<>(mapa.values()));
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("personas.obj"))){
		  out.writeObject(fusionadas);
		
			
		} 
		catch (Exception e) {
			
		}
	}

}
