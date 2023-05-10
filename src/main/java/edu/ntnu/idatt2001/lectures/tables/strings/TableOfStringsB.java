package edu.ntnu.idatt2001.lectures.tables.strings;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TableOfStringsB.java - "Programmering i Java", 4.utgave - 2009-07-01
 */
public class TableOfStringsB {
	// Logger for å skrive ut feilmeldinger
	private static final Logger logger = Logger.getLogger(TableOfStringsB.class.getName());
	
	// En tabell med navn
	private String[] nameList = new String[5];

	// Konstruktør som initialiserer tabellen med navn
	public TableOfStringsB() {
		this.nameList[0] = new String("Hanne");
		this.nameList[1] = new String("Berit");
		this.nameList[2] = new String("Hans");
		this.nameList[3] = new String("Hanne");
		this.nameList[4] = new String("Berit");
	}

	// Metode som skriver ut alle navnene i tabellen
	public void printDuplicates() {
		int totalNames = nameList.length;
		for (int i = 0; i < totalNames; i++) {
			String name = nameList[i];
			for (int j=i+1; j<totalNames;j++) {
				String thisName = nameList[j];
				if (name == thisName) {
					logger.log(Level.INFO,"{0} er duplikat", name);
				}
			}
		}
	}
}
