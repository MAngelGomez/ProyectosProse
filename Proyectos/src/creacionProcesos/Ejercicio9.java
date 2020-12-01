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
		
		try {
			//String comandoLinux="ls -help";
			//String comandoWindows="CMD /C DIR";
			List<String>lista= new ArrayList<String>();
			lista.add("ls");
			lista.add("agua");
			//String comando= comandoLinux;
			
			Process p = null;
			int status;
			ProcessBuilder pb=new ProcessBuilder(lista);
			File fOut=new File("salida_ejercicio9.txt");
			File fError=new File("logError_ejercicio9.txt");
			
			pb.redirectOutput(fOut);
			pb.redirectError(fError);
			
			pb.start();
			
			InputStream is = p.getInputStream();	
			
			status = p.waitFor();
			
			if(status==0) {
				System.out.println("El comando  ha resultado " + status);
			}
			else {
				System.out.println("No existe el archivo o directorio");
			}
				
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
