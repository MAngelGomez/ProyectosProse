package creacionProcesos;

public class Ejercicio1 {

	public static void main(String[] args) {

		
		
		try {
			Process p;
			Runtime rt= Runtime.getRuntime();
			
			p=rt.exec("firefox");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
