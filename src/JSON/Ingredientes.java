package JSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredientes {
	
	private String nombre;
	private String cantidad;
	
	public Ingredientes() {
		
	}

	public Ingredientes(String nombre, String cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Ingredientes [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	

}
