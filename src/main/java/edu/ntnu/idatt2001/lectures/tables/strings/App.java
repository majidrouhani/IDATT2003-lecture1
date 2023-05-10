package edu.ntnu.idatt2001.lectures.tables.strings;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {

	/**
	 * Main-metode som starter applikasjonen.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		TableOfStringsA tabellA = new TableOfStringsA();
		TableOfStringsB tabellB = new TableOfStringsB();
		
		System.out.println("Tabell A:");
		tabellA.printDuplicates();		

		System.out.println("Tabell B:");
		tabellB.printDuplicates();
	}
	
}
