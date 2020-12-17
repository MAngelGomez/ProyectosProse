package Repaso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) {

		try {
			Runtime rt= Runtime.getRuntime();
			
			String comandoLinux="ls --help";
			String comandoWindows=" CMD /C DIR";
	
			String comando= comandoWindows;
			
			Process p=null;
			p=rt.exec(comando);
			InputStream is= p.getInputStream();
			try(BufferedReader br= new BufferedReader(new InputStreamReader(is));){
				
				String linea;
				linea= br.readLine();
				while(linea!=null) {
					System.out.println(linea);
					linea=br.readLine();
				}
				
				
				
				
				
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
