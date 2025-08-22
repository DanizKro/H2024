package Uke34.oppg2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		
		Person p1 = new Person("Daniel", "Kron", 1992, 47239858);
		Person p2 = new Person("Halgeir", "Jesp", 1972, 47236948);
		Person p3 = new Person("Chris", "Lagan", 1984, 47456333);
		
		
		List<Person> l1 = List.of(p1,p2,p3);
		
		Personformat f1 = new Format1(); 
		Personformat f2 = new Format2();
		
//		skrivUt(p1, format1);
//		skrivUt(p1, format2);
//		
		
		skrivUtAlle(l1, f1);
		
	}

	static void skrivUtAlle(List<Person> tab, Personformat f) {
		
		for(Person e : tab) {
			System.out.println(f.somStreng(e));
		}
	}
	
	static void skrivUtEn(Person p, Personformat f) {
		
		System.out.println(f.somStreng(p));
	}
}
