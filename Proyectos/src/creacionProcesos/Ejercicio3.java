package creacionProcesos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ejercicio3 {

	public static void main(String[] args) {


		try(BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("listado.txt"))){
			
			File carpeta = new File("C:\\Users\\miguel\\git\\ProyectosProse\\Proyectos");
			
			String[] listado = carpeta.list();
			if (listado == null || listado.length == 0) {
			    System.out.println("No hay elementos dentro de la carpeta actual");
			    
			}
			else {
			    for (int i=0; i< listado.length; i++) {
			        
			    	filtroEscritura.write(listado[i]+"\n");
			    }
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
