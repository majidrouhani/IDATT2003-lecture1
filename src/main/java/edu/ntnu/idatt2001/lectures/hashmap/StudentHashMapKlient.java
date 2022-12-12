package edu.ntnu.idatt2001.lectures.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.ntnu.idatt2001.lectures.aggregation.AppData;
import edu.ntnu.idatt2001.lectures.aggregation.Student;


public class StudentHashMapKlient {

	public static void main(String[] args) {
		
		List<Student> data = new ArrayList<Student>();
		data = AppData.getData();

		HashMap<String,Student> studentHashmap = new HashMap<String,Student>();

		for (Student student:data) {
			studentHashmap.put(student.getUniqueIdasString(),student);
		}



		String studentId = "1998-03-15-DelFinito-Huppasahn-F";
		System.out.println(studentHashmap.containsKey(studentId)); 

		studentHashmap.remove(studentId); 
		System.out.println(studentHashmap.containsKey(studentId)); 		
	}
}

