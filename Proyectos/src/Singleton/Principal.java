package Singleton;
public class Principal {

	public static void main(String[] args) {
		
		Impresora impresora1= Impresora.getAtributo();
		
		System.out.println(impresora1);
		System.out.println("Fin impresora");

	}

}
