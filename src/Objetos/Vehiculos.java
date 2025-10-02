package Objetos;

public class Vehiculos {
	/*Crea la clase vehículos con los atributos: matricula, marca y precio de compra. Como
métodos tendremos los constructores, los getters y setters, el toString y un método
propios llamado pvp que recibe por parámetros un beneficio que será un número entero
entre 0 y 100 y devuelve el precio de venta al público. Para calcularlo se utiliza la siguiente
fórmula: pvp= preciocompra+((preciocompra*beneficio)/100)*/
	
	protected String matricula;
	protected String marca;
	protected double preciocompra;
	
	
	public Vehiculos(String matricula, String marca, double preciocompra) {
		this.matricula = matricula;
		this.marca = marca;
		this.preciocompra = preciocompra;
	}
	
	


	public Vehiculos() {
		super();
	}




	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPreciocompra() {
		return preciocompra;
	}


	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", preciocompra=" + preciocompra + "]";
	}
	
	public double pvp(int beneficio) {
		
		
		return preciocompra+((preciocompra*beneficio)/100);
	}
	
	
}
