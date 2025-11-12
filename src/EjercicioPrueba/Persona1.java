package EjercicioPrueba;

import java.io.Serializable;

import com.fasterxml.jackson.databind.deser.Deserializers;

public class Persona1 implements Serializable{

	private String dni, nombre;
	private int edad;
	
	public Persona1() {

	}

	public Persona1(String dni, String nombre, int edad) {
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
		return "Persona1 [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
