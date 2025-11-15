package Examen2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ropa.dat"))) {
			Lista l = (Lista) ois.readObject();
			
			ObjectMapper mapeador = new ObjectMapper();
			mapeador.enable(SerializationFeature.INDENT_OUTPUT);

			mapeador.writeValue(new File("ejerc5.json"), l);
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
