package FicherosXML;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "empresa")
@XmlAccessorType(XmlAccessType.FIELD)
public class Empresas {

	private String nombre, direccion, nie;
	  @XmlElementWrapper(name = "trabajadores")
	    @XmlElement(name = "trabajador")
	 ArrayList<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();
	
	public Empresas() {
		super();
	}

	public Empresas(String nie, String nombre, String direccion, ArrayList<Trabajador> listaTrabajadores) {
		super();
		this.nie = nie;
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaTrabajadores = listaTrabajadores;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}

	public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}

	@Override
	public String toString() {
		return "Empresas [nie=" + nie + ", nombre=" + nombre + ", direccion=" + direccion + ", listaTrabajadores="
				+ listaTrabajadores + "]";
	}
	
	public void anadirTrabajador(Trabajador e) {
		this.listaTrabajadores.add(e);
	}
	
}
