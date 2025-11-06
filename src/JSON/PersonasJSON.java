package JSON;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonasJSON {

	private ArrayList<PersonaJSON> listaPersonas;
	
	

	public PersonasJSON() {
		listaPersonas=new ArrayList<PersonaJSON> ();
		
	}

	public PersonasJSON(ArrayList<PersonaJSON> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}

	public ArrayList<PersonaJSON> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<PersonaJSON> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	public void mostrarPersonas() {
	for(PersonaJSON p :listaPersonas) {
		System.out.println(p.toString());
	}
		
	}
	public void anadirPersona(PersonaJSON p) {
		this.listaPersonas.add(p);
	}

	
}
