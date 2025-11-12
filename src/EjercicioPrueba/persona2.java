package EjercicioPrueba;

import java.io.Serializable;

public class persona2 implements Serializable{
	private String dni, email;
	private int telefono;
	
	public persona2() {
	}

	public persona2(String dni, String email, int telefono) {
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "persona2 [dni=" + dni + ", email=" + email + ", telefono=" + telefono + "]";
	}
	
	
	

}
