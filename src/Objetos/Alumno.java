package Objetos;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumno implements Serializable {
	
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
	
	
	 public Alumno(int expediente, String nombre, String apellidos) {
		super();
		this.expediente = expediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		
	}




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


	

	 @Override
	 public String toString() {
		return "Alumno [expediente=" + expediente + ", nombre=" + nombre + ", apellidos=" + apellidos+ "]";
	 }
	
	
	
	
	
}
