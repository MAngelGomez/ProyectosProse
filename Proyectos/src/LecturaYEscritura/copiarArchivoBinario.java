package LecturaYEscritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class copiarArchivoBinario {

	public static void main(String[] args) {
		
		try(BufferedReader filtroLectura= new BufferedReader(new FileReader(".bin"));
				BufferedWriter filtroEscritura= new BufferedWriter(new FileWriter(".bin"))) {
			String linea;
			
			linea=filtroLectura.readLine();
			
			while (linea!=null) {

				filtroEscritura.write(linea);
				linea=filtroLectura.readLine();
			}
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
