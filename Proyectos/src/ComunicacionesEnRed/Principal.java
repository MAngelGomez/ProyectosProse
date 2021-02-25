package ComunicacionesEnRed;

import java.io.IOException;

import java.net.MalformedURLException;


public class Principal {

	public static void main(String[] args) throws MalformedURLException, IOException {

		ManagerCalculadora mc = new ManagerCalculadora();
			mc.sumar(2, 5);
			mc.restar(9, 7);
			mc.multiplicar(4,8);
	}

}
