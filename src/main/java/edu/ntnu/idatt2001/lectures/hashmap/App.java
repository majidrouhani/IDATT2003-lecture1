package edu.ntnu.idatt2001.lectures.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.ntnu.idatt2001.lectures.example1.aggregation.AppData;
import edu.ntnu.idatt2001.lectures.example1.aggregation.Student;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {

	/**
	 * Main-metode som starter applikasjonen.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> data = new ArrayList<>();
		data = AppData.getData();

		Map<String,Student> studentHashmap = new HashMap<>();

		for (Student student:data) {
			studentHashmap.put(student.getUniqueIdasString(),student);
		}


		String studentId = "1998-03-15-DelFinito-Huppasahn-F";

		System.out.printf("Student exist: %s",studentHashmap.containsKey(studentId));

		studentHashmap.remove(studentId); 
		System.out.printf("Student exist: %s",studentHashmap.containsKey(studentId));
	}
}

