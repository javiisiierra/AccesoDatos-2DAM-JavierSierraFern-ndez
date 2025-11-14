package EjercicioPrueba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Objetos.MiObjectOutputStream;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		ArrayList<Persona1> lista = null;
		
		try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream("personas.obj"))){
			personas p = (personas) ois.readObject();
			lista = p.getPersonas();
			
		}catch (Exception e) {
			System.out.println("Error al leer el archivo personas.obj "+e.getMessage());
		}
		
		try (FileWriter fw = new FileWriter("contactos.csv")){
			for(Persona1 persona : lista){
				fw.write(persona.getNombre() +";"+ persona.getEmail());
			}
		}catch (Exception e) {
			System.out.println("Error al escribir en el archivo contactos.csv "+e.getMessage());
		}
			
			 
			 
	}

}
