package creacionProcesos;

import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {

		
		String comandoLinux = "firefox iescristobaldemonroy.es";
		String comandoWindows = "C:\\Program Files\\Mozilla Firefox\\firefox.exe ";
		
		String comando = comandoWindows;
		ProcessBuilder pb = new ProcessBuilder(comando);
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
