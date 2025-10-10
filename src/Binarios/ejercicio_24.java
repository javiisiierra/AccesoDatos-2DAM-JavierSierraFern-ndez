package Binarios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio_24 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la ruta del fichero: ");
        String ruta = leer.nextLine();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
            System.out.println("\nMostrando fichero:");

            while (true) {
                try {
                    int expediente = dis.readInt();
                    double nota = dis.readDouble();

                    
                    StringBuilder nombre = new StringBuilder();
                    char c;
                    while ((c = dis.readChar()) != '\n') {
                        nombre.append(c);
                    }

                    System.out.println("Expediente: " + expediente + " Nota: " + nota + " Nombre: " + nombre.toString());

                } catch (IOException e) {
                    break; 
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
