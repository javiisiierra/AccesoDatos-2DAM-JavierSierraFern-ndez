package FicherosXML;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "titulo", "autor", "editorial", "isbn" })
public class Libro {

	private String titulo;
	private String autor;
	private String editorial;
	private int isbn;
	
	
	public Libro() {
		
	}


	public Libro(String titulo, String autor, String editorial, int isbn) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	
	
}
