package EjercicioPrueba;

import java.io.Serializable;
import java.util.ArrayList;

public class personas2 implements Serializable{

	private ArrayList<persona2> personas = new ArrayList<persona2>();

	public personas2() {
	}

	public personas2(ArrayList<persona2> listaPersonas2) {
		this.personas = listaPersonas2;
	}

	public ArrayList<persona2> getListaPersonas2() {
		return personas;
	}

	public void setListaPersonas2(ArrayList<persona2> listaPersonas2) {
		this.personas = listaPersonas2;
	}
	
	public void mostrarPersonas2() {
		for(persona2 p : personas) {
			System.out.println(p);
		}
	}
	
}
