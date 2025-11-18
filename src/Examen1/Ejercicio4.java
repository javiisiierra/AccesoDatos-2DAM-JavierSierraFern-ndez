package Examen1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.obj"));
			Personas p = (Personas) ois.readObject();

		ois.close();
		
		FileWriter fw = new FileWriter("contactos.csv");
			for(persona p2 : p.getPersonas()) {
				fw.write(p2.getNombre()+ ";" +p2.getEmail()+ "\n");
			}
		fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
