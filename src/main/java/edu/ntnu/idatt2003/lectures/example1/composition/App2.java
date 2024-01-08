package edu.ntnu.idatt2003.lectures.example1.composition;

import java.util.List;
import java.util.logging.Logger;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App2 {

	/**
	 * Main-metode som starter applikasjonen.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(App2.class.getName());

		List<Student> students;
		students = AppData.getData();

		for (Student student : students) {
			String msg = String.format("Student ID: %s", student.getUniqueIdasString());
			logger.info(msg);
		}
	}
}
