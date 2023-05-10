package edu.ntnu.idatt2001.lectures.tables.strings;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {

	// Logger for å skrive ut informasjon til konsollen
	private static final Logger logger = Logger.getLogger(App.class.getName());

	/**
	 * Main-metode som starter applikasjonen.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		TableOfStringsA tabellA = new TableOfStringsA();
		TableOfStringsB tabellB = new TableOfStringsB();
		
		logger.log(Level.INFO,"Tabell A:");
		tabellA.printDuplicates();		

		logger.log(Level.INFO,"Tabell B:");
		tabellB.printDuplicates();
	}
	
}
