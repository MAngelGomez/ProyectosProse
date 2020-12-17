package Repaso;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("CMD");
		lCommand.add("/C");
		lCommand.add("DIRR");
		
		ProcessBuilder pb = new ProcessBuilder(lCommand); 		
		File fOut = new File("salida_ejercicio9.txt");
		File fErr = new File("log_ejercicio9.txt");		
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
