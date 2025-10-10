package Objetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ejercicio_26 {
		
	public static void main(String[] args) {
		
		
		Alumno alumno = new Alumno(123, "Paco", "Sanz");
		ObjectOutputStream oos =null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("alumno.bin"));
			oos.writeObject(alumno);
			
			System.out.println("Empleado guardado correctamente en alumno.bin");
			
			
		}catch(IOException e) {
			System.out.println("Error al guardar el alumno: " + e.getMessage());
			
		}finally {
			if(oos != null) {
				try {
					oos.close();
				}catch(IOException e) {
					System.out.println("Error al cerrar el ObjectOutputStream: " + e.getMessage());
				}
			}
		}
		
		Alumno alumno2 = null;
		ObjectInputStream ois =null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("alumno.bin"));
			try {
				alumno2= (Alumno) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(alumno2.toString());
			
			
		}catch(IOException e) {
			
			
		}finally {
			if(ois != null) {
				try {
					ois.close();
				}catch(IOException e) {
					System.out.println("Error al cerrar el ObjectOutputStream: " + e.getMessage());
				}
			}
		}
		
		
		
		
		
	}
}
