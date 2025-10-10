package Binarios;



import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio_23 {

    public static void main(String[] args) {
    	
    	


        Scanner leer = new Scanner(System.in);
        int opcion;

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("alumnos123.dat", true))) {
            

            do {
                System.out.println("\nMenú:\n1 - Introducir alumno\n2 - Salir");
                opcion = leer.nextInt();
                leer.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el número de expediente del alumno: ");
                        int expediente = leer.nextInt();
                        leer.nextLine();

                        System.out.print("Introduce el nombre del alumno: ");
                        String nombre = leer.nextLine();

                        System.out.print("Introduce la nota del alumno: ");
                        double nota = leer.nextDouble();
                        leer.nextLine(); 

                        dos.writeInt(expediente);
                        dos.writeDouble(nota);

                        for (char c : nombre.toCharArray()) {
                            dos.writeChar(c);
                        }
                       
                        dos.writeChar('\n');

                        System.out.println("Datos guardados correctamente.\n");
                        break;

                    case 2:
                        System.out.println("Has salido del programa.");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } while (opcion != 2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

