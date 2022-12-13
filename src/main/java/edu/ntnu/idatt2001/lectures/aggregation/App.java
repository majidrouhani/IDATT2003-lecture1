package edu.ntnu.idatt2001.lectures.aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LOGGER.log(Level.INFO,"Logger Name: {0}",LOGGER.getName());

		List<Student> students = new ArrayList<>();
		students = AppData.getData();

		for (Student student : students) {
			LOGGER.log(Level.INFO,"Student ID: {0}",student.getUniqueIdasString());
		}
	}
}
