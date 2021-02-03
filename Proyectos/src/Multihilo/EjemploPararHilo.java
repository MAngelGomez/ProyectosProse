package Multihilo;

 class EjemploHiloParar extends Thread{
	private boolean pararHilo=false;
	public void pararHilo() {
		pararHilo=true;
		
	}
	
	public void run() {
		while(!pararHilo) {
			System.out.println("En hilo");
		}
	}
}
public class EjemploPararHilo {

	public static void main(String[] args) {
		
		EjemploHiloParar h=new EjemploHiloParar();
		h.start();
		
		
		for (int i = 0; i < 100; i++) {
			h.pararHilo();
		}

	}
	
	

}
