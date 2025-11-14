package Examen2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		
		
		try {
			
			BufferedReader fichero = new BufferedReader(new FileReader("ropa.csv"));
			
			String linea;
			
			Lista listaproducto=new Lista();
			
			while((linea=fichero.readLine())!=null){
	
			String[] textoSeparado = linea.split(";");
			
			productos miProducto = new productos();
			miProducto.setId(Integer.parseInt(textoSeparado[0]));
			miProducto.setNombre(textoSeparado[1]);
			miProducto.setTalla(textoSeparado[4]);
			miProducto.setColor(textoSeparado[5]);
			miProducto.setStock(Integer.parseInt(textoSeparado[7]));
			miProducto.setPrecio(Integer.parseInt(textoSeparado[8]));
			miProducto.setCoste(Integer.parseInt(textoSeparado[9]));
			miProducto.setEstado(textoSeparado[10]);
			miProducto.setDescuento(Integer.parseInt(textoSeparado[11]));
			
			//System.out.println(linea);
			listaproducto.anadirProducto(miProducto);
			
			}
			
			ObjectOutputStream fich = new ObjectOutputStream(new FileOutputStream("ropa.data", true));
			fich.writeObject(listaproducto);
			
			
			
			
		} catch (Exception e) {
			System.out.println("Error al abrir el fichero");
			e.printStackTrace();
			e.getMessage();
		}
		 	
		

	}

}
