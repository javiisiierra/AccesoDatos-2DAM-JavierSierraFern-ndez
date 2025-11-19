package ExamenRamon;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;

public class Ejercicio1Examen {

	public static void main(String[] args) {
		
		try {
			BufferedReader fichero = new BufferedReader(new FileReader("/home/diurno/Escritorio/NavalFood.csv"));
			
			String linea;
			
			Lista2 listarestaurante = new Lista2();
			
			while((linea = fichero.readLine()) != null) {
				String[] textoSeparado = linea.split("#");
				
				Restaurante miRestaurante = new Restaurante();
				miRestaurante.setId(Integer.parseInt(textoSeparado[0]));
				miRestaurante.setNombre(textoSeparado[1]);
				miRestaurante.setTipoComida(textoSeparado[2]);
				miRestaurante.setTiempoEntrega(Integer.parseInt(textoSeparado[3]));
				miRestaurante.setValoracion(Double.parseDouble(textoSeparado[4]));
				miRestaurante.setNumPedidos(Integer.parseInt(textoSeparado[5]));
				miRestaurante.setDescripcion(textoSeparado[6]);
				
				listarestaurante.anadirRestaurante(miRestaurante);
			}
			
			ObjectOutputStream fich = new ObjectOutputStream(new FileOutputStream("restaurantes.dat", true));
			fich.writeObject(listarestaurante);
			System.out.println("restaurantes.dat creado");
		} catch (Exception e) {
			System.out.println("Error al abrir el fichero");
			e.printStackTrace();
			e.getMessage();
		}
	}

}