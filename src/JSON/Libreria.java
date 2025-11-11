package JSON;

import java.util.ArrayList;
import java.util.Iterator;

public class Libreria {
	private String liberia;
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public Libreria() {
    }
    
    

    public String getLiberia() {
		return liberia;
	}



	public void setLiberia(String liberia) {
		this.liberia = liberia;
	}



	public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void anadirLibro(Libro l) {
        listaLibros.add(l);
    }

    public boolean modificarLibro(int isbn, String nuevoNombre, String nuevoAutor, String nuevaEditorial) {
        for (Libro l : listaLibros) {
            if (l.getIsbn() == isbn) {
                l.setNombre(nuevoNombre);
                l.setAutor(nuevoAutor);
                l.setEditorial(nuevaEditorial);
                return true;
            }
        }
        return false;
    }

    public boolean borrarLibro(int isbn) {
        Iterator<Libro> it = listaLibros.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getIsbn() == isbn) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Libro l : listaLibros) {
            sb.append(l.toString()).append("\n");
        }
        return sb.toString();
    }

}

