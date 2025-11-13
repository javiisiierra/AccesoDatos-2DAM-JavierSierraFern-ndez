package EjercicioPrueba;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.deser.Deserializers;

@XmlRootElement(name="persona")
public class Persona1 implements Serializable{

	private String dni, nombre, email;
	private int edad, telefono;
	
	public Persona1() {

	}

	public Persona1(String dni, String nombre, String email, int edad, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.telefono = telefono;
	}

	@XmlElement(name="dni")
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@XmlElement(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona1 [dni=" + dni + ", nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", telefono="
				+ telefono + "]";
	}


	
	
}
