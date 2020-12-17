package Repaso;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) {

		try {
			Runtime rt = Runtime.getRuntime();
			String comandoLinux = "lsss -help";
			String comandoWindows = "CMD /C DIRRRR";
			String comando = comandoWindows;
			Process p = null;
			
			p=rt.exec(comando);
			
			InputStream errorStream= p.getErrorStream();
			
			try(BufferedReader br= new BufferedReader(new InputStreamReader(errorStream))){
				
				System.out.println("Error en comando:");
				String linea=br.readLine();
				
				while(linea!=null) {
					System.out.println(linea);
					linea=br.readLine();
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
