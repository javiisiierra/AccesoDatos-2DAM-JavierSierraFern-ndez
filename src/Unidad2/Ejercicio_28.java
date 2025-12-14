package Unidad2;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.sql.*;

public class Ejercicio_28 {

    public static void main(String[] args) {
        try (Connection con = ConexionBD.conectar()) {

           
            String sql = "SELECT nombre, curso, telefono FROM alumno";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

           
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            
            Element root = doc.createElement("alumnos");
            doc.appendChild(root);

          
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String curso  = rs.getString("curso");
                int telefono  = rs.getInt("telefono");

                Element eAlumno = doc.createElement("alumno");
                root.appendChild(eAlumno);

                Element eNombre = doc.createElement("nombre");
                eNombre.appendChild(doc.createTextNode(nombre));
                eAlumno.appendChild(eNombre);

                Element eCurso = doc.createElement("curso");
                eCurso.appendChild(doc.createTextNode(curso));
                eAlumno.appendChild(eCurso);

                Element eTelefono = doc.createElement("telefono");
                eTelefono.appendChild(doc.createTextNode(String.valueOf(telefono)));
                eAlumno.appendChild(eTelefono);
            }

            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("totalAlumno.xml"));
            transformer.transform(source, result);

            System.out.println("Fichero totalAlumno.xml generado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
