package creacionProcesos;

import java.io.BufferedReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		List<String>comando= new ArrayList<String>();
		comando.add("CMD");
		comando.add("/C");
		comando.add("DIRR");
		
		String comandoEje=String.valueOf(comando);
		ProcessBuilder pb= new ProcessBuilder(comando);
		File fOut= new File("salida_Ejercicio9.txt");
		File fError= new File("log_Ejercicio9.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fError);
		
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int status;
		
		Runtime rt= Runtime.getRuntime();
		Process p=null;
		
		try {
			p=rt.exec(comandoEje);
			
			status=p.waitFor();
			
			if(status==0) {
				System.out.println("El comando  ha resultado " + status);
			}
			else {
				System.out.println("No existe el archivo o directorio");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
