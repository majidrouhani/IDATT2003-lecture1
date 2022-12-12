package edu.ntnu.idatt2001.lectures.tables;

public class TableOfStringsApp {

	public static void main(String[] args) {
		TableOfStringsA tabellA = new TableOfStringsA();
		TableOfStringsB tabellB = new TableOfStringsB();
		TableOfStringsC tabellC = new TableOfStringsC();
		
		System.out.println("Tabell A: ");
		tabellA.printDuplicates();		

		System.out.println("Tabell B: ");
		tabellB.printDuplicates();

		System.out.println("Tabell C: ");
		tabellC.printDuplicates();
		
	}
	
}
