package ComunicacionesEnRed;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.sun.jdi.connect.spi.Connection;



public class sumarParametros {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://psp2021site.000webhostapp.com/suma_parametros.php" );
			URLConnection conexion=url.openConnection();
			conexion.setDoOutput(true);
			
			String valores="PARAM_A=4&PARAM_B=7";
			
			PrintWriter output=new PrintWriter(conexion.getOutputStream());
			
			output.write(valores);
			output.close();
			
			BufferedReader reader= new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			
			String linea;
			//linea=reader.readLine();
			while((linea=reader.readLine())!=null) {
				System.out.println(linea.replaceAll("\\<[^>]*>", ""));
			}
			reader.close();
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
