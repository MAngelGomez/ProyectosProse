package creacionProcesos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) {
		try {
			Runtime rt = Runtime.getRuntime();
			String comandoLinux = "lsss -help";
			String comandoWindows = "CMD /C DIRRRR";
			String comando = comandoWindows;
			Process p = null;
			
			p = rt.exec(comando);
			
			
			int status;
			InputStream errStream = p.getErrorStream();
			try(BufferedReader br = new BufferedReader(new InputStreamReader(errStream));) {
				
				status = p.waitFor();
				System.out.println("El comando " + comando + " ha resultado " + status);	
				System.out.println("La salida ha sido: ");
				
				
				String linea = br.readLine();
				while (linea !=null){
					System.out.println(linea);
					linea = br.readLine();
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
