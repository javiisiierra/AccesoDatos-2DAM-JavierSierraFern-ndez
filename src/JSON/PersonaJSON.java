package JSON;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PersonaJSON {
	
	String dni, nombre;
	int edad;
	
	

	public PersonaJSON() {
		super();
	}

	public PersonaJSON(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	@Override
	public String toString() {
		return "PersonaJSON [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}




}
