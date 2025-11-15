package Examen2;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Lista implements Serializable{

	private ArrayList<productos> listaProductos = new ArrayList<>();

	public Lista() {
		
	}

	public Lista(ArrayList<productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
	@XmlElementWrapper(name="listaProductos")
	@XmlElement(name="producto")
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
