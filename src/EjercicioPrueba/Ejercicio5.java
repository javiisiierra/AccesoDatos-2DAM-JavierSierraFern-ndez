package EjercicioPrueba;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		
		ArrayList<Persona1> lista = null;
		
		try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream("C:\\Users\\usuario\\git\\AccesoDatos-2DAM-JavierSierraFern-ndez\\personas.obj"))){
			personas p = (personas) ois.readObject();
			lista = p.getPersonas();
			
		}catch (Exception e) {
			System.out.println("Error al leer el archivo personas.obj "+e.getMessage());
		}
		
		try {
			RandomAccessFile archivo = new RandomAccessFile("telefonos.bin", "rw");
			for(Persona1 persona : lista){
				String dni = String.format("%-9s", persona.getDni());
		        String tel = String.format("%-9s", persona.getTelefono());
		        archivo.writeBytes(dni + tel); 
				/* archivo.writeUTF(persona.getDni());
			        archivo.writeInt(persona.getTelefono());*/
		        //QUEDA MEJOR CON LA OPCIÓN QUE ESTA PUESTA, PERO SE PUEDE HACER DE CUALQUIERA DE LAS DOS MANERAS
			}
		} catch (IOException e) {
			e.printStackTrace();
		
		}
	}
		
}
