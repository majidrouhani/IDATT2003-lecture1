package edu.ntnu.idatt2003.lectures.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.ntnu.idatt2003.lectures.example1.aggregation.Student;

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
		
		Map<String,Student> data = new HashMap<>();
		data = AppData.getData();

		String studentId = "1998-03-15-DelFinito-Huppasahn-F";

		System.out.printf("Student exist: %s",data.containsKey(studentId));

		data.remove(studentId); 
		System.out.printf("Student exist: %s",data.containsKey(studentId));
	}
}

