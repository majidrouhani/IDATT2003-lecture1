package edu.ntnu.idatt2001.lectures;

import java.util.ArrayList;
import java.util.List;

import edu.ntnu.idatt2001.lectures.aggregation.PostalAddress;
import edu.ntnu.idatt2001.lectures.aggregation.Student;
import edu.ntnu.idatt2001.lectures.aggregation.StudentName;

/**
 *
 */
public class App 
{
	public static void main(String[] args) {
		List<Student> studenter = new ArrayList<Student>();
		
		StudentName name1 = new StudentName("Odd Even","Primtallet");
		PostalAddress postalAddress1 = new PostalAddress(7000,"Trondheim");

		StudentName name2 = new StudentName("Huppasahn","DelFinito");
		PostalAddress postalAddress2 = new PostalAddress(7001,"Trondheim");
		
		Student student1 = new Student(name1,postalAddress1);
		studenter.add(student1);
		
		Student student2 = new Student(name2,postalAddress2);		
		studenter.add(student2);
	}
}
