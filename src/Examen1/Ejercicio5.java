package Examen1;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.obj"));
			Personas p = (Personas) ois.readObject();
			
			RandomAccessFile archivo = new RandomAccessFile("telefonos.bin", "rw");
			for(persona p2 : p.getPersonas()) {
				 System.out.println("DNI: " + p2.getDni() + " - Tel: " + p2.getTelefono() + " - Edad: " + p2.getEdad());
				String dni;
				if (p2.getDni() == null) {
				    dni = "";
				} else {
				    dni = p2.getDni();
				}
				int Tlf = p2.getTelefono();
				archivo.writeUTF(dni);
				archivo.writeInt(Tlf);
			}
			archivo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
