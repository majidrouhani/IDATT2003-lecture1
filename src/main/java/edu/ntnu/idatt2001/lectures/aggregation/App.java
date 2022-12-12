package edu.ntnu.idatt2001.lectures.aggregation;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class App 
{
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		students = AppData.getData();

		for (Student student:students) {
			System.out.println(student.getUniqueIdasString());
		}
	}
}
