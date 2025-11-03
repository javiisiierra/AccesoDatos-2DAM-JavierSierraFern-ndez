package FicherosXML;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"nombreVia", "numero", "poblacion", "cp"})
public class Direccion {
	
	private String nombreVia, poblacion;
	private int numero, cp;
	
	public Direccion() {
		super();
	}

	public Direccion(String nombreVia, String poblacion, int numero, int cp) {
		super();
		this.nombreVia = nombreVia;
		this.poblacion = poblacion;
		this.numero = numero;
		this.cp = cp;
	}
	 @XmlElement
	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	 @XmlElement
	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	 @XmlElement
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	 @XmlElement
	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	
	

}
