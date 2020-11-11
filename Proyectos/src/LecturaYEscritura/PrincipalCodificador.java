package LecturaYEscritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PrincipalCodificador {

	public static void main(String[] args) {
		
		try(BufferedReader filtroLectura= new BufferedReader(new FileReader("archivoActual.bin"));
				BufferedWriter filtroEscritura= new BufferedWriter(new FileWriter("archivoCodificado.bin"))) {
			String linea;
			
			linea=filtroLectura.readLine();
			
			while (linea!=null) {
				
				linea=Codificador.codifica(linea);
				filtroEscritura.write(linea);
				linea=filtroLectura.readLine();
			}
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try(BufferedReader filtroLectura= new BufferedReader(new FileReader("archivoCodificado.bin"));
				BufferedWriter filtroEscritura= new BufferedWriter(new FileWriter("archivoDecodificado.bin"))) {
			String linea;
			
			linea=filtroLectura.readLine();
			
			while (linea!=null) {
				
				linea=Codificador.decodifica(linea);
				filtroEscritura.write(linea);
				linea=filtroLectura.readLine();
			}
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	

		
		

	

}
