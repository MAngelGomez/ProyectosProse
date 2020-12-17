package Repaso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Ejercicio8 {

	public static void main(String[] args) {

		ProcessBuilder pEnv= new ProcessBuilder();
		Map<String, String>vEnv=pEnv.environment();
		System.out.println(vEnv);

		
		ArrayList<String>comando=new ArrayList<String>();
		
		comando.add("CMD");
		comando.add("/C");
		comando.add("DIR");
		
		
		ProcessBuilder pb=new ProcessBuilder(comando);
		System.out.println(pb.command());
		
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
