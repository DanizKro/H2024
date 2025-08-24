package Uke34.oppg3;

public class Intervall implements ADTintervall {

	private int a;
	private int b;
	
	public Intervall(int a, int b) {
		
		if(a > b) {
			throw new IllegalArgumentException("Nedre kan ikke være større enn øvre grense");
		}
		this.a = a;
		this.b = b;
	}
	
	public boolean inneholder(int x){
		return a <= x && x <= b;
	}
	
	public boolean overlapper(ADTintervall andre) {
		
		if(inneholder(andre.min()) || inneholder(andre.maks())) {
			return true;
		}
		return false;
	}
	
	public int min() {
		return a;
	}
	
	public int maks(){
		return b;
	}

	

	

}
