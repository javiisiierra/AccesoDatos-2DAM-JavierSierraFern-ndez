package ExamenRamon;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import Examen2.Lista;

public class Ejercicio5Examen {

	public static void main(String[] args) {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("restaurantes.dat"))) {
			Lista2 l = (Lista2) ois.readObject();
			
			ObjectMapper mapeador = new ObjectMapper();
			mapeador.enable(SerializationFeature.INDENT_OUTPUT);

			mapeador.writeValue(new File("ejerc5Examen.json"), l);
			System.out.println("Json creado");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
