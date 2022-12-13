package edu.ntnu.idatt2001.lectures.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.ntnu.idatt2001.lectures.aggregation.AppData;
import edu.ntnu.idatt2001.lectures.aggregation.Student;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		
		List<Student> data = new ArrayList<>();
		data = AppData.getData();

		HashMap<String,Student> studentHashmap = new HashMap<>();

		for (Student student:data) {
			studentHashmap.put(student.getUniqueIdasString(),student);
		}


		String studentId = "1998-03-15-DelFinito-Huppasahn-F";

		LOGGER.log(Level.INFO,"Student exist: {0}",studentHashmap.containsKey(studentId));

		studentHashmap.remove(studentId); 
		LOGGER.log(Level.INFO,"Student exist: {0}",studentHashmap.containsKey(studentId));
	}
}

