package JSON;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recetas {

	private String nombre, tipo;
	private Origen origen;
	private ArrayList<Ingredientes> listaIngredientes = new ArrayList<>();
	
	private static ArrayList<Recetas> listaRecetas = new ArrayList<Recetas>();
	
	
	
	public Recetas() {
		this.listaIngredientes = new ArrayList<>();
	}
	

	
	public Recetas(String nombre, String tipo, Origen origen, ArrayList<Ingredientes> listaIngredientes,
			ArrayList<Recetas> listaRecetas) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.origen = origen;
		this.listaIngredientes = listaIngredientes;
		this.listaRecetas = listaRecetas;
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public Origen getOrigen() {
		return origen;
	}



	public void setOrigen(Origen origen) {
		this.origen = origen;
	}



	public ArrayList<Ingredientes> getListaIngredientes() {
		return listaIngredientes;
	}



	public void setListaIngredientes(ArrayList<Ingredientes> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}

	public void anadirIngredientes(Ingredientes i) {
		this.listaIngredientes.add(i);
	}

	public static ArrayList<Recetas> getListaRecetas() {
		return listaRecetas;
	}



	public static void setListaRecetas(ArrayList<Recetas> listaRecetas) {
		listaRecetas = listaRecetas;
	}
	
	public static void anadirRecetas(Recetas r) {
		listaRecetas.add(r);
	}

	public static void mostrarRecetas() {
		for(Recetas r : listaRecetas) {
			System.out.println(r);
		}
	}




	@Override
	public String toString() {
		return "Recetas [nombre=" + nombre + ", tipo=" + tipo + ", origen=" + origen + ", listaIngredientes="
				+ listaIngredientes + "]";
	}
	
	
	
}
