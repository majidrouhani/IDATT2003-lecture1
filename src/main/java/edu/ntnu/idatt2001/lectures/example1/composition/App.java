package edu.ntnu.idatt2001.lectures.example1.composition;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {
	private static final Logger logger = Logger.getLogger(App.class.getName());

	/**
	 * Main-metode som starter applikasjonen.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students = AppData.getData();
		
		for (Student student : students) {
			logger.log(Level.INFO,"Student ID: {0}",student.getUniqueIdasString());
		}
	}

}
