package Binarios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio_24 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce la ruta del fichero: ");
        String ruta = leer.nextLine();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
            System.out.println("\nMostrando fichero:");

          
            while (true) {
                try {
                    
                    int expediente = dis.readInt();
                    double nota = dis.readDouble();
                    String nombre = dis.readUTF();

                    System.out.println("Número expediente: " + expediente + " Nombre: " + nombre + " Nota: " + nota);
                } catch (IOException e) {
                    
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
}
