package Uke34.oppg2;

public class Format1 implements Personformat{

	@Override
	public String somStreng(Person p) {
		
		return p.fornavn().toUpperCase() + ", født i " + p.fodselsar() + ", tlf: " + p.tlf();
	}

}
