package edu.ntnu.idatt2001.lectures.tables;

public class TableOfStringsA {
	private String[] nameList = new String[5];

	public TableOfStringsA() {
		this.nameList[0] = "Hanne";
		this.nameList[1] = "Berit";
		this.nameList[2] = "Hans";
		this.nameList[3] = "Hanne";
		this.nameList[4] = "Berit";
	}

	public void printDuplicates() {
		int totalNames = nameList.length;
		for (int i = 0; i < totalNames; i++) {
			String name = nameList[i];
			for (int j=i+1; j<totalNames;j++) {
				String thisName = nameList[j];
				if (name == thisName) {
					System.out.println(name + " er duplicat");
				}
			}
		}
	}
}
