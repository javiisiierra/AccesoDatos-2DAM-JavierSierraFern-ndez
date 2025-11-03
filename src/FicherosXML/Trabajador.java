package FicherosXML;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trabajador")
public class Trabajador {

	private String  nombre, cargo, dni;


	public Trabajador() {
		super();
	}

	public Trabajador(String dni, String nombre, String cargo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.cargo = cargo;
	}
    @XmlElement
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
    @XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    @XmlElement
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", cargo=" + cargo + ", dni=" + dni + "]";
	}
	
	
}
