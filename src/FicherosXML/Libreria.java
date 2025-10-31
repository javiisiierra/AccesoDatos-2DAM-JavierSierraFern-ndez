package FicherosXML;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Libreria {
	
	ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	private String nombre, lugar;
	private int cp;
	
	
	
	public Libreria() {
		
	}
	

	
	
	public Libreria(ArrayList<Libro> listaLibros, String nombre, String lugar, int cp) {
		super();
		this.listaLibros = listaLibros;
		this.nombre = nombre;
		this.lugar = lugar;
		this.cp = cp;
	}



	
	@XmlElementWrapper
	@XmlElement(name ="libro")
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@XmlAttribute
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlAttribute
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	@XmlAttribute
	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}


	@Override
	public String toString() {
		return "Libreria [listaLibros=" + listaLibros + ", nombre=" + nombre + ", lugar=" + lugar + ", cp=" + cp + "]";
	}
	
	public void anadirLibro(Libro e) {
		this.listaLibros.add(e);
	}
	
	
}
