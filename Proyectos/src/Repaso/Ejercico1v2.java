package Repaso;

import java.io.IOException;

public class Ejercico1v2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "firefox iescristobaldemonroy.es";
		String comandoWindows = "C:\\Program Files\\Mozilla Firefox\\firefox.exe iescristobaldemonroy.es";
		
		String comando = comandoWindows;
		
		try {
			rt.exec(comando);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
