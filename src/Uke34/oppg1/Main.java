package Uke34.oppg1;

public class Main {

	public static void main(String[] args) {
		
		
		int[] tab1 = {2,3,1,5};
		
		Tallformat format1 = new Stjerneformat();
		
		skrivUtTallene(tab1, format1);
		
		System.out.println();
		
		Tallformat format2 = new Hashtag();
		
		skrivUtTallene(tab1, format2);

	}
	
	public static void skrivUtTallene(int[] tab, Tallformat format) {

		for (int i = 0; i < tab.length; i++) {
			System.out.println(format.somStreng(tab[i]));
		}
	}

	
	

}
