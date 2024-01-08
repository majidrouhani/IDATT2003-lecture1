package edu.ntnu.idatt2003.lectures.example1.aggregation;

import java.util.List;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App1 {
	/**
	 * Main-metode som starter applikasjonen.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		List<Student> students;
		students = AppData.getData();

		for (Student student : students) {
			System.out.printf("Student ID: %s", student.getUniqueIdasString());
		}
	}
}
