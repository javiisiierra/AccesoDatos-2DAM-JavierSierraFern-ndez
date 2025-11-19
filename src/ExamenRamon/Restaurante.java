package ExamenRamon;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlType(propOrder={"nombre", "tipoComida", "descripcion"})
@JsonIgnoreProperties({"nombre", "tipoComida", "descripcion"})
public class Restaurante implements Serializable{

	private int id, tiempoEntrega, numPedidos;
	private String nombre, tipoComida, descripcion;
	private double valoracion;
	
	
	public Restaurante() {
	}

	public Restaurante(int id, int tiempoEntrega, int numPedidos, String nombre, String tipoComida, String descripcion,
			double valoracion) {
		this.id = id;
		this.tiempoEntrega = tiempoEntrega;
		this.numPedidos = numPedidos;
		this.nombre = nombre;
		this.tipoComida = tipoComida;
		this.descripcion = descripcion;
		this.valoracion = valoracion;
	}

	@XmlTransient
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlTransient
	public int getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(int tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

	@XmlTransient
	public int getNumPedidos() {
		return numPedidos;
	}

	public void setNumPedidos(int numPedidos) {
		this.numPedidos = numPedidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@XmlTransient
	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Restaurante [id=" + id + ", tiempoEntrega=" + tiempoEntrega + ", numPedidos=" + numPedidos + ", nombre="
				+ nombre + ", tipoComida=" + tipoComida + ", descripcion=" + descripcion + ", valoracion=" + valoracion
				+ "]";
	}
	
	
}