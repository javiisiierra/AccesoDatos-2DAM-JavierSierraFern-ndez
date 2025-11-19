package ExamenRamon;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Lista2 implements Serializable{

	private ArrayList<Restaurante> listaRestaurante = new ArrayList<Restaurante>();

	public Lista2() {
	}

	public Lista2(ArrayList<Restaurante> listaRestaurante) {
		this.listaRestaurante = listaRestaurante;
	}

	//@XmlElementWrapper(name="listaRestaurante")
	@XmlElement(name="restaurante")
	public ArrayList<Restaurante> getListaRestaurante() {
		return listaRestaurante;
	}

	public void setListaRestaurante(ArrayList<Restaurante> listaRestaurante) {
		this.listaRestaurante = listaRestaurante;
	}
	
	public void anadirRestaurante(Restaurante r) {
		this.listaRestaurante.add(r);
	}
	
	public void mostrarRestaurante() {
		for(Restaurante r : listaRestaurante) {
			System.out.println(r);
		}
	}
}