package Repaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) {

		try {
			Runtime rt= Runtime.getRuntime();
			
			String comandoLinux="ls --help";
			String comandoWindows=" CMD /C DIR";
	
			String comando= comandoWindows;
			
			Process p=null;
			p=rt.exec(comando);
			InputStream is= p.getInputStream();
			try(BufferedReader br= new BufferedReader(new InputStreamReader(is));
					BufferedWriter bw= new BufferedWriter(new FileWriter("listado.txt"))){
				
				String linea;
				linea= br.readLine();
				while(linea!=null) {
					bw.write(linea);
					linea=br.readLine();
				}
				
				System.out.println("Terminado");
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
