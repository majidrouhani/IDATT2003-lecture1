package edu.ntnu.idatt2001.lectures.tables.strings;

/*
 * TableOfStringsA.java - "Programmering i Java", 4.utgave - 2009-07-01
 */
public class TableOfStringsA {

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
					System.out.printf("%s er duplikat", name);
				}
			}
		}
	}
}
