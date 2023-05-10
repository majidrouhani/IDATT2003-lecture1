package edu.ntnu.idatt2001.lectures.tables.strings;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * TableOfStringsA.java - "Programmering i Java", 4.utgave - 2009-07-01
 */
public class TableOfStringsA {
	// Logger for å skrive ut meldinger til konsollen
	private static final Logger logger = Logger.getLogger(TableOfStringsA.class.getName());

	// En tabell med navn
	private String[] nameList = new String[5];

	/**
	 * Konstruktør som initialiserer tabellen med navn
	 */
	public TableOfStringsA() {
		this.nameList[0] = "Hanne";
		this.nameList[1] = "Berit";
		this.nameList[2] = "Hans";
		this.nameList[3] = "Hanne";
		this.nameList[4] = "Berit";
	}

	/**
	 * Metode som skriver ut alle navnene i tabellen
	 */
	public void printDuplicates() {
		int totalNames = nameList.length;
		for (int i = 0; i < totalNames; i++) {
			String name = nameList[i];
			for (int j=i+1; j<totalNames;j++) {
				String thisName = nameList[j];
				if (name.equals(thisName)) {
					logger.log(Level.INFO,"{0} er duplikat", name);
				}
			}
		}
	}
}
