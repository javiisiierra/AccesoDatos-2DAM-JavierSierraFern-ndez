package Examen1;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="personas")
public class Personas implements Serializable{

	
	private ArrayList<persona> personas = new ArrayList<persona>();

	public Personas() {
	}

	public Personas(ArrayList<persona> personas) {
		this.personas = personas;
	}

	
	
	@XmlElement(name="persona")
	public ArrayList<persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<persona> personas) {
		this.personas = personas;
	}
	
	public void mostrarPersonas() {
		for(persona p : personas) {
			System.out.println(p);
		}
	}
	
}