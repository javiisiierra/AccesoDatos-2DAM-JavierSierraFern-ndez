package Examen2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {

		

		try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("ropa.dat"))){
			
			
			Lista l = (Lista) ois.readObject();
			
			ArrayList<productos> resultado = l.getListaProductos();
			
			RandomAccessFile archivo = new RandomAccessFile("precio.dat", "rw");
			for(productos p : resultado) {
				archivo.writeInt(p.getId());
				archivo.writeInt(p.getPrecio());
				archivo.writeInt(p.getCoste());
				archivo.writeInt(p.getDescuento());
			}
			
		} catch (EOFException eof) {
			 // Hemos llegado al final del archivo: es normal, salimos del bucle
			 } catch (FileNotFoundException fnfe) {
			 System.out.println("El archivo no existe.");
			 } catch (IOException | ClassNotFoundException e) {
			 System.out.println("Error leyendo el archivo: " + e.getMessage());
			 }
		

	}

}
