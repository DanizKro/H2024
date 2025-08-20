package Uke34.oppg2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		
		Person p1 = new Person("Daniel", "Kron", 1992, 41234448);
		Person p2 = new Person("Halgeir", "Jesp", 1972, 47236948);
		Person p3 = new Person("Chris", "Lagan", 1984, 47456333);
		
		
		List<Person> l1 = List.of(p1,p2,p3);
		
		Personformat f1 = new Format2(); 
		Personformat f2 = new Format1();
		
//		skrivUt(p1, format1);
//		skrivUt(p1, format2);
//		
		
		for(Person e: l1) {
			skrivUt(e,f2);
		}
		
	}

	
	static void skrivUt(Person p, Personformat f) {
		
		System.out.println(f.somStreng(p));
	}
}
