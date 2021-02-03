package Multihilo;

public class EjemploSincronizacion {

	public static void main(String[] args) {
		Contador contador=new Contador(100);
		HiloA hiloA=new HiloA("HiloA", contador);
		HiloB hiloB= new HiloB("HiloB", contador);
		
		hiloA.start();
		hiloB.start();
		
		try {
			hiloA.join();
			hiloB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Al final: "+contador.getValor());
	}

	static class HiloB extends Thread{
		private Contador contador;
		
		public HiloB(String n, Contador contador) {
			setName(n);
			this.contador=contador;
		}
		
		public void run() {
			for (int i = 0; i < 100; i++) {
				contador.decrementar();
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(getName()+" contador vale: "+contador.getValor());
		}
	}
	
	static class HiloA extends Thread{
		private Contador contador;
		
		public HiloA(String n, Contador contador) {
			setName(n);
			this.contador=contador;
		}
		public void run() {
			for (int i = 0; i < 100; i++) {
				contador.incrementar();
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(getName()+" contador vale: "+contador.getValor());
		}
	}
	
	static class Contador{
		private int c;
		
		public Contador(int c) {
			this.c=c;
		}
		public void incrementar() {
			c=c+1;
		}
		public void decrementar() {
			c=c-1;
		}
		public int getValor() {
			return c;
		}
	}
}
