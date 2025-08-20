package Uke34.oppg2;

public class Format2 implements Personformat{


	@Override
	public String somStreng(Person p) {
		return p.fornavn().toUpperCase() + " " + p.etternavn().toUpperCase() + ", født i "+ p.fodselsar();
	}
	
	

}
