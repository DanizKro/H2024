package Uke34.oppg3;

public interface ADTintervall {

	public boolean inneholder(int x);
	
	public boolean overlapper(ADTintervall andre);
	
	public int min();
	
	public int maks();
	
}
