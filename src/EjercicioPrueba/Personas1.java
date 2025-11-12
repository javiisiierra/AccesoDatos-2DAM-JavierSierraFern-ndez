package EjercicioPrueba;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Personas1 implements Serializable{
	

	private  ArrayList<Persona1> listaPersonas = new ArrayList<Persona1>();



	public Personas1() {

	}

	public Personas1(ArrayList<Persona1> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}

	public ArrayList<Persona1> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona1> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	public  void mostrarPersonas() {
		for(Persona1 p: listaPersonas) {
			System.out.println(p);
		}
		
	}

}
