package Unidad2;

import java.io.Serializable;
import java.util.ArrayList;

public class Lista22 implements Serializable{

	ArrayList<Zapato> zapatos = new ArrayList<>();

	public Lista22() {
	}
	
	

	public Lista22(ArrayList<Zapato> zapatos) {
		this.zapatos = zapatos;
	}

	


	public ArrayList<Zapato> getZapatos() {
		return zapatos;
	}



	public void setZapatos(ArrayList<Zapato> zapatos) {
		this.zapatos = zapatos;
	}



	public void anadirZapato(Zapato z) {
		zapatos.add(z);
	}
	
	public void mostrarZapato() {
		for(Zapato z : zapatos) {
			//System.out.println(z);
		}
	}
}
