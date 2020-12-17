package Repaso;

import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {

		Runtime rt= Runtime.getRuntime();
		
		String comandoLinux="ls --help";
		String comandoWindows="CMD /C DIRrr";
		
		Process p=null;
		
		try {
			p=rt.exec(comandoWindows);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int estado= p.waitFor();
			
			System.out.println("El comando " + comandoWindows + " ha resultado " +estado);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
