package Examen2;

import java.util.ArrayList;

public class Lista {

	private ArrayList<productos> listaProductos = new ArrayList<>();

	public Lista() {
		
	}

	public Lista(ArrayList<productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public ArrayList<productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void anadirProducto(productos p) {
		listaProductos.add(p);
	}
	
	public void mostrarProductos() {
		for(productos p : listaProductos) {
			System.out.println(p);
		}
	}
	
}
