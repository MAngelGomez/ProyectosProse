package Multihilo;

public abstract class Coche {

	private int kms;

	public Coche(int kms) {
		
		this.kms = kms;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	@Override
	public String toString() {
		return "Coche [kms=" + kms + "]";
	} 
	
	
}
