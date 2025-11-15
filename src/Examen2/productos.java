package Examen2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlType(propOrder={"nombre", "talla", "color", "precio", "estado"})
@JsonIgnoreProperties({"stock", "descuento", "coste", "nombre", "talla", "color", "estado"})

public class productos implements Serializable{

	private int id, stock,descuento, precio,  coste;
	private String nombre, talla, color, estado;
	
	
	public productos() {
	}


	public productos(int id, int stock, int descuento, int precio, int coste, String nombre,
			String talla, String color, String estado) {

		this.id = id;
		this.stock = stock;
		this.descuento = descuento;
		this.precio = precio;
		this.coste = coste;
		this.nombre = nombre;		
		this.talla = talla;
		this.color = color;
		this.estado = estado;
	}

	@XmlTransient
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@XmlTransient
	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	@XmlTransient
	public int getDescuento() {
		return descuento;
	}


	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@XmlTransient
	public int getCoste() {
		return coste;
	}


	public void setCoste(int coste) {
		this.coste = coste;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}



	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "productos [id=" + id + ", stock=" + stock + ", descuento=" + descuento + ", precio=" + precio
				+ ", coste=" + coste + ", nombre=" + nombre + ", talla=" + talla
				+ ", color=" + color + ", estado=" + estado + "]";
	}

	
	
}
