package edu.ntnu.idatt2001.lectures.aggregation;

import java.util.ArrayList;
import java.util.List;
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

		LOGGER.info("Logger Name: " + LOGGER.getName());

		List<Student> students = new ArrayList<>();
		students = AppData.getData();

		for (Student student : students) {
			LOGGER.info(student.getUniqueIdasString());
		}
	}
}
