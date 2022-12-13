package edu.ntnu.idatt2001.lectures.tables;

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		TableOfStringsA tabellA = new TableOfStringsA();
		TableOfStringsB tabellB = new TableOfStringsB();
		TableOfStringsC tabellC = new TableOfStringsC();
		
		LOGGER.log(Level.INFO,"Tabell A:");
		tabellA.printDuplicates();		

		LOGGER.log(Level.INFO,"Tabell B:");
		tabellB.printDuplicates();

		LOGGER.log(Level.INFO,"Tabell C:");
		tabellC.printDuplicates();
		
	}
	
}
