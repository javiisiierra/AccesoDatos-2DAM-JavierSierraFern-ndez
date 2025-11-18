package Examen1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"dni", "telefono", "email"})

public class persona implements Serializable{
	private String dni, nombre, email;
	private int edad, telefono;
	
	public persona() {

	}

	public persona(String dni, String nombre, String email, int edad, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@XmlTransient
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlTransient
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
		return "persona [dni=" + dni + ", nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", telefono="
				+ telefono + "]";
	}
	
	
}