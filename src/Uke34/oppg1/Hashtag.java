package Uke34.oppg1;

public class Hashtag implements Tallformat{

	@Override
	public String somStreng(int tall) {
		
		String svar = "";
		
		for(int i = 0; i < tall; i++) {
			svar += "#";
		}
		return svar;
	}

}
