package creacionProcesos;

import java.io.File;

public class Ejercicio2 {

	public static void main(String[] args) {


		
		File carpeta = new File("C:\\Users\\miguel\\git\\ProyectosProse\\Proyectos");
		
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
		    System.out.println("No hay elementos dentro de la carpeta actual");
		    return;
		}
		else {
		    for (int i=0; i< listado.length; i++) {
		        System.out.println(listado[i]);
		    }
		}


	}

}
