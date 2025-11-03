package FicherosXML;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;

public class Ejerc_44 {

	public static void main(String[] args) {
		

		int opcion = 0;
		
		Empresas miEmpresas = new Empresas();
		
		Scanner leer = new Scanner(System.in);
	
		
		do {	
			System.out.println("MENÚ:  \n1-.Ver datos de las empresas \n2-.Ver trabajadores \n3-.Añadir trabajador"
					+ "\n4-.Modificar trabajador \n5-.Borrar trabajador \n6-.Salir" );
			opcion = Integer.parseInt(leer.nextLine());
			
		switch(opcion) {
		
		case 1:
			System.out.println(miEmpresas);
			break;
		case 2:
			for(Trabajador t : miEmpresas.listaTrabajadores) {
				System.out.println(t);
			}
			break;
		case 3:
			Trabajador miTrabajador = new Trabajador();
			
			System.out.println("Introduce el nombre: ");
			miTrabajador.setNombre(leer.nextLine());
			System.out.println("Introduce el DNI: ");
			miTrabajador.setDni(leer.nextLine());
			System.out.println("Introduce el Cargo: ");
			miTrabajador.setCargo(leer.nextLine());
			
			miEmpresas.anadirTrabajador(miTrabajador);
			
			break;
		case 4:
			System.out.println("Introduce el DNI: ");
			String dniIntroducido = (leer.nextLine());
			
			for(Trabajador t : miEmpresas.getListaTrabajadores()) {
				if(t.getDni().equalsIgnoreCase(dniIntroducido)) {
					System.out.println("Introduce el nuevo nombre: ");
					t.setNombre(leer.nextLine());
					System.out.println("Introduce el nuevo cargo: ");
					t.setCargo(leer.nextLine());

					
				}
			}
			
			break;
		/*case 5:
			System.out.println("Introduce el DNI: ");
			String dniIntroducido2 = (leer.nextLine());
			
			for(Trabajador t : miEmpresas.listaTrabajadores) {
				if(t.getDni().equalsIgnoreCase(dniIntroducido2)) {
					
				}
			}
			break;*/
		case 6:
			System.out.println("Has salido del programa");
			break;	
		default: 
			System.out.println("Introduce una opción válida");
		
		
		}
			
			
			
			
			
			
			
		}while(opcion != 6);
		
		try {
			 StreamResult ficheroXML = new StreamResult(new File("ejercicio42.xml"));
			// Crear contexto JAXB
			JAXBContext jaxbContext = JAXBContext.newInstance(Libreria.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			// Configuración opcional para formato legible
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			// Convertir objeto a XML y mostrar en consola
			marshaller.marshal(miEmpresas, ficheroXML);
			marshaller.marshal(miEmpresas, System.out);
			} catch (JAXBException e) {
			e.printStackTrace();
			}

	}

}
