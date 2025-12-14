package Unidad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ejercicio_27 {

    public static void main(String[] args) {
        try {
            Connection con = ConexionBD.conectar();  

            String ruta = "C:\\Users\\usuario\\Downloads\\ampliarAlumnos.xml";  
            String sql = "INSERT INTO alumno (nombre, curso, telefono) VALUES (?, ?, ?)";

            try (BufferedReader br = new BufferedReader(new FileReader(ruta));
                 PreparedStatement ps = con.prepareStatement(sql)) {

                String nombre, curso, telStr;
                while ((nombre = br.readLine()) != null) {
                    curso  = br.readLine();          
                    telStr = br.readLine();           

                    if (curso == null || telStr == null) break; 
                    int telefono = Integer.parseInt(telStr.trim());

                    ps.setString(1, nombre.trim());
                    ps.setString(2, curso.trim());
                    ps.setInt(3, telefono);
                    ps.executeUpdate();
                }
            }

            System.out.println("Alumnos añadidos desde ampliarAlumnos.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
