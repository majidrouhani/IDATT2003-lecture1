package edu.ntnu.idatt2001.lectures.tables;

public class TableOfStringsC {
	private String[] nameList = new String[5];

	public TableOfStringsC() {
		this.nameList[0] = new String("Hanne");
		this.nameList[1] = new String("Berit");
		this.nameList[2] = new String( "Hans");
		this.nameList[3] = new String( "Hanne");
		this.nameList[4] = new String( "Berit");
	}

	public void printDuplicates() {
		int totalNames = nameList.length;
		for (int i = 0; i < totalNames; i++) {
			String name = nameList[i];
			for (int j=i+1; j<totalNames;j++) {
				String thisName = nameList[j];
				if (name.equals(thisName)) {
					System.out.println(name + " er duplicat");
				}
			}
		}
	}
}
