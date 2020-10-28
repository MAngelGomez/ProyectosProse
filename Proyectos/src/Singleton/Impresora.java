package Singleton;

public class Impresora {

	private static Impresora atributo;
	
	public Impresora() {
		
		this.atributo=atributo;
	}
	
	public static Impresora getAtributo() {
		if(atributo==null) {
			atributo= new Impresora();
		}
		return atributo;
	}
}
