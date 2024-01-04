package edu.ntnu.idatt2001.lectures.hashmap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import edu.ntnu.idatt2001.lectures.example1.aggregation.Student;
import edu.ntnu.idatt2001.lectures.example1.utils.Address;
import edu.ntnu.idatt2001.lectures.example1.utils.Name;

/**
 * AppData.java - "Programmering i Java", 4.utgave - 2009-07-01
 * 
 * A class that represents a student.
 * 
 */
public class AppData {
    
    private AppData() {
        throw new IllegalStateException("AppData class");
    }

    /**
     * getData() returnerer en liste med studentobjekter.
     * @return data
     */
    public static Map<String, Student> getData() {
        Map<String,Student> data = new HashMap<>();

        Name name1 = new Name("Odd Even", "Primtallet");
        Address postalAddress1 = new Address(7000, "Trondheim", "Sør-Trøndelag");
        LocalDate birthday1 = LocalDate.of(1990, Month.JANUARY, 5);

        Student student1 = new Student(name1, postalAddress1, birthday1, "M");
        data.put(student1.getUniqueIdasString(), student1);

        Name name2 = new Name("Huppasahn", "DelFinito");
        Address postalAddress2 = new Address(7001, "Trondheim", "Sør-Trøndelag");
        LocalDate birthday2 = LocalDate.of(1998, Month.MARCH, 15);

        Student student2 = new Student(name2, postalAddress2, birthday2, "F");
        data.put(student2.getUniqueIdasString(), student2);

        return data;
    }
}
