package creacionProcesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		try {
			Runtime rt = Runtime.getRuntime();
			String comandoLinux = "lsss -help";
			String comandoWindows = "CMD /C DIRRRR";
			String comando = comandoWindows;
			Process p = null;
			
			p = rt.exec(comando);
			
			
			int status;
			InputStream errStream = p.getErrorStream();
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(errStream));
					BufferedWriter bw = new BufferedWriter(new FileWriter("log_err_ejercicio6.txt"));) {
				
				status = p.waitFor();
				System.out.println("El comando " + comando + " ha resultado " + status);	
				System.out.println("Consulte los fichero de logs para más información.");
				
						
				String linea = br.readLine();
				while (linea!=null) {
					bw.write(linea);
					bw.newLine();
					linea = br.readLine();
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	

}
