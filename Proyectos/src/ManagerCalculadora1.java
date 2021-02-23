import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ManagerCalculadora1 {

	private String protocoloWeb;
	private String urlOperacion;
	private Integer apiKey;
	private boolean registrada;
	
	
	public ManagerCalculadora1() {
		super();
	}
	
	public ManagerCalculadora1(String protocoloWeb, String urlOperacion, Integer apiKey, boolean registrada) {
		super();
		this.protocoloWeb = protocoloWeb;
		this.urlOperacion = urlOperacion;
		this.apiKey = apiKey;
		this.registrada = registrada;
	}

	public String getProtocoloWeb() {
		return protocoloWeb;
	}
	public void setProtocoloWeb(String protocoloWeb) {
		this.protocoloWeb = protocoloWeb;
	}
	public String getUrlOperacion() {
		return urlOperacion;
	}
	public void setUrlOperacion(String urlOperacion) {
		this.urlOperacion = urlOperacion;
	}
	public Integer getApiKey() {
		return apiKey;
	}
	public void setApiKey(Integer apiKey) {
		this.apiKey = apiKey;
	}
	public boolean isRegistrada() {
		return registrada;
	}
	public void setRegistrada(boolean registrada) {
		this.registrada = registrada;
	}
	
	public void sumar(int a, int b) {
		try {
			URL url= new URL(protocoloWeb+urlOperacion+"?API_KEY="+apiKey+"&TIPO_OPERACION=SUMA&SUMANDO_A=" +a+ "&SUMANDO_B=" + b);
			URLConnection conexion=url.openConnection();
			
			protocoloWeb="https://psp2021site.000webhostapp.com/";
			apiKey=112;
			urlOperacion="realizaOperacion.php";
			
			BufferedReader br;
			InputStream is=conexion.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while((linea=br.readLine())!=null) {
				System.out.println(linea.replaceAll("\\<[^>]*>", ""));
			}
			br.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	public void restar(int a, int b) {
		try {
			URL url= new URL(protocoloWeb+urlOperacion+"?API_KEY="+apiKey+"\"&TIPO_OPERACION=RESTA&MINUENDO=\"" +a+ "&SUSTRAENDO=" + b);
			URLConnection conexion=url.openConnection();
			
			protocoloWeb="https://psp2021site.000webhostapp.com/";
			apiKey=112;
			urlOperacion="realizaOperacion.php";
			
			BufferedReader br;
			InputStream is=conexion.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while((linea=br.readLine())!=null) {
				System.out.println(linea.replaceAll("\\<[^>]*>", ""));
			}
			br.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void multiplicar(int a, int b) {
		try {
			URL url= new URL(protocoloWeb+urlOperacion+"?API_KEY="+apiKey+"&TIPO_OPERACION=MULTIPLICACION&OPERADOR_1=" +a+ "&OPERADOR_2=" + b);
			URLConnection conexion=url.openConnection();
			
			protocoloWeb="https://psp2021site.000webhostapp.com/";
			apiKey=112;
			urlOperacion="realizaOperacion.php";
			
			BufferedReader br;
			InputStream is=conexion.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while((linea=br.readLine())!=null) {
				System.out.println(linea.replaceAll("\\<[^>]*>", ""));
			}
			br.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
