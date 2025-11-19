package ExamenRamon;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;



public class Ejercicio2Examen {

	public static void main(String[] args) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("restaurantes.dat"))){
			
			Lista2 l = (Lista2) ois.readObject();
			
			ArrayList<Restaurante> result = l.getListaRestaurante();
			
			//Accedes de manera aleatoria, y con el rw , no solo lo lee, sino también lo crea y lo escribe
			RandomAccessFile archivo = new RandomAccessFile("popularidad.dat", "rw");
			for(Restaurante r : result) {
				archivo.writeInt(r.getId());
				archivo.writeDouble(r.getValoracion());
				archivo.writeInt(r.getNumPedidos());
				
			}
			System.out.println("popularidad.dat creado");
		}catch (EOFException eof) {
			
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			 System.out.println("El archivo no existe.");
			 } catch (IOException | ClassNotFoundException e) {
			 System.out.println("Error leyendo el archivo: " + e.getMessage());
			 }

	}

}