package Uke34.oppg2;

public record Person(String fornavn, String etternavn, int fodselsar, int tlf){
	
	public Person{
		
		if(tlf < 0) {
			System.out.print("ikke lov");
		}
	}



}
