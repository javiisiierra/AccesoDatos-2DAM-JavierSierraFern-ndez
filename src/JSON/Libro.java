package JSON;

public class Libro {
	
	private String nombre, autor,editorial;
	private int isbn;
	
	public Libro() {
		
	}

	public Libro(String nombre, String autor, String editorial, int isbn) {

		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + ", isbn=" + isbn + "]";
	}


	

}
