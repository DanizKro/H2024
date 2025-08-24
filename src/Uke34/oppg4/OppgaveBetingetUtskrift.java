package Uke34.oppg4;

public class OppgaveBetingetUtskrift {
	
	public static void main(String[] args) {
		
		betingetUtskrift("Xtest", s -> s.startsWith("X"));
		betingetUtskrift("test", s -> s.startsWith("X"));
		
	}
	
	private static void betingetUtskrift(String s, Betingelse b) {
		
		if(b.test(s)){
			System.out.println(s);
		}
	}

}


interface Betingelse {
	
	boolean test(String string);
}