package EjercicioPrueba;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personas")

public class personas implements Serializable{

	
	private ArrayList<Persona1> personas = new ArrayList<Persona1>();

	public personas() {
	}

	public personas(ArrayList<Persona1> personas) {
		this.personas = personas;
	}

	@XmlElement(name = "persona")
	public ArrayList<Persona1> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona1> personas) {
		this.personas = personas;
	}

	public void mostrarPersonas() {
		for(Persona1 p : personas) {
			System.out.println(p);
		}
	}
	
}
