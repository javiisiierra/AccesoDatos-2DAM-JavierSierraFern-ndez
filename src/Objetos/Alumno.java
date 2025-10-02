package Objetos;

import java.util.ArrayList;

public class Alumno {
	
	/*. Implementaremos la clase Alumno con una serie de atributos y métodos.
Atributos:
 Expediente, ocho dígitos.
 Nombre, un texto de 20 caracteres.
 Apellidos una texto de 40 caracteres.
 Notas, estructura de almacenamiento de notas numéricas con decimales. Esta
estructura por lo tanto tendrá datos donde puede haber duplicados, el orden no es
importante y su función principal no es de búsquedas
Los métodos de la clase Alumno serán los métodos set y get para cada atributo y el método
toString. Además:
 Un método añadirNota que recibe como parámetro un número con decimal, el método
lo debe añadir a la estructura de almacenamiento notas.
 El método calcularNota que hace la media de todas las notas guardadas en la
estructura de almacenamiento notas. Para ello sumamos todas las notas y las
dividiremos por el número total de notas introducidas. */
	
	private int expediente;
	private String nombre;
	private String apellidos;
	
	
	 private ArrayList<Double> calificaciones = new ArrayList<Double>();


	 public int getExpediente() {
		 return expediente;
	 }


	 public void setExpediente(int expediente) {
		 this.expediente = expediente;
	 }


	 public String getNombre() {
		 return nombre;
	 }


	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }


	 public String getApellidos() {
		 return apellidos;
	 }


	 public void setApellidos(String apellidos) {
		 this.apellidos = apellidos;
	 }


	 public ArrayList<Double> getCalificaciones() {
		 return calificaciones;
	 }


	 public void setCalificaciones(ArrayList<Double> calificaciones) {
		 this.calificaciones = calificaciones;
	 }


	 @Override
	 public String toString() {
		return "Alumno [expediente=" + expediente + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", calificaciones=" + calificaciones + "]";
	 }
	
	 public void anadirNota(double calificacion) {
		 
		  calificaciones.add(calificacion);
	 }
	
	public double calcularNota() {
		
		
		double suma = 0;
		
		for(Double s : calificaciones) {
			
			 suma = suma + s;
		}
		
		return suma/calificaciones.size();
		
	}
	
}
