package edu.ntnu.idatt2001.lectures.example1.aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App {

	private static final Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		logger.log(Level.INFO,"Logger Name: {0}",logger.getName());

		List<Student> students = new ArrayList<>();
		students = AppData.getData();

		for (Student student : students) {
			logger.log(Level.INFO,"Student ID: {0}",student.getUniqueIdasString());
		}
	}
}
