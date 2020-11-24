package creacionProcesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) {

		try {
			Runtime rt = Runtime.getRuntime();
			String comandoLinux = "ls -help";
			String comandoWindows = "CMD /C DIR";
			
			String comando = comandoWindows;
			
			Process p;
			
			p = rt.exec(comando);
			
				
			InputStream is = p.getInputStream();
			try(BufferedReader br= new BufferedReader(new InputStreamReader(is));
					BufferedWriter bw = new BufferedWriter( new FileWriter("salida_comando_" + comando.replace('/',  '_')));) {
				
				String linea = br.readLine();
				while (linea!=null) {
					bw.write(linea);
					bw.newLine();
					linea = br.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	} catch (IOException e1) {
		System.out.println(e1.getMessage());
	}
	}

}
