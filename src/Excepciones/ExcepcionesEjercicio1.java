package Excepciones;

import java.util.*;

public class ExcepcionesEjercicio1 {
    public static void main(String[] args) {

        // 1. Conversión inválida de String a int
        try {
        	String invalido = "abc";
            int numero = Integer.parseInt(invalido); 
        } catch(NumberFormatException e) {
        	System.out.println("Introduce un valor válido. ");
        }

        // 2. División por cero
        
        try {
        
        int resultado = 10 / 0; 
        
        }catch(ArithmeticException i ) {
        	System.out.println("Valor incorrecto. ");
        }

        // 3. Operación sobre variable null
        try {
        	String texto = null;
            int longitud = texto.length(); 

        }catch(NullPointerException e) {
        	System.out.println("Valor intoducido no válido. ");
        }
        // 4. Acceso a índice inválido en lista
        
        try {
        	  List<String> lista = new ArrayList<>();
              lista.add("A");
              String valor = lista.get(2); 
        }catch(IndexOutOfBoundsException e) {
        	System.out.println("Introduce un valor correcto. ");
        }
      

        // 5. Modificación de colección durante iteración
        
        try {
        
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Luis");
        nombres.add("Luis");
        nombres.add("Luis");

        for (String nombre : nombres) {
            if (nombre.equals("Ana")) {
                nombres.remove(nombre); 
            }
        }
        
        }catch(ConcurrentModificationException e ) {
        	System.out.println("Incorrecto. ");
        }
       
    }
}
