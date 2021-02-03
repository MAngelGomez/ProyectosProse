package Multihilo;

public class CuentaBancaria {

	public static void main(String[] args) {
		
		Cuenta cuenta=new Cuenta(40);
		
		sacarDinero miguel=new sacarDinero("Miguel", cuenta);
		sacarDinero juan= new sacarDinero("Juan", cuenta);
		
		miguel.start();
		juan.start();

	}
	
	static class Cuenta{
		private int saldo;
		
		public Cuenta(int saldo) {
			this.saldo=saldo;
		}
		
		public int getSaldo() {
			return saldo;
		}
		void restar(int cantidad) { 
			saldo = saldo - cantidad;
		}
		void retirar(int cantidad, String nombre) {
			if(getSaldo()>=cantidad) {
				System.out.println("Se va a retirar,Saldo actual = "+getSaldo());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				restar(cantidad);
				System.out.println(nombre+" retira: "+cantidad+" saldo= "+getSaldo());
			}else {
				System.out.println("No puede retirar el dinero, no hay saldo, saldo= "+getSaldo());
			}
			if(saldo<0) {
				System.out.println("Saldo negativo, saldo= "+getSaldo()); 
			}
			
		}
	}
	static class sacarDinero extends Thread{
		private Cuenta cuenta;
		
		String nombre;
		
		public sacarDinero(String nombre,Cuenta cuenta) {
			setName(nombre);
			this.cuenta=cuenta;
		}
		
		public void run() {
			for (int i = 1; i <=4; i++) {
				cuenta.retirar(10, getName());
			}
		}
	}

}
