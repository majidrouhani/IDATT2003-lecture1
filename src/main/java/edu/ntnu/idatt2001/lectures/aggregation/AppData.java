package edu.ntnu.idatt2001.lectures.aggregation;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class AppData {

    private AppData() {
        throw new IllegalStateException("AppData class");
    }

    public static List<Student> getData() {
        List<Student> data = new ArrayList<>();

        StudentName name1 = new StudentName("Odd Even", "Primtallet");
        PostalAddress postalAddress1 = new PostalAddress(7000, "Trondheim");
        LocalDate birthday1 = LocalDate.of(1990, Month.JANUARY, 5);

        Student student1 = new Student(name1, postalAddress1, birthday1, "M");
        data.add(student1);

        StudentName name2 = new StudentName("Huppasahn", "DelFinito");
        PostalAddress postalAddress2 = new PostalAddress(7001, "Trondheim");
        LocalDate birthday2 = LocalDate.of(1998, Month.MARCH, 15);

        Student student2 = new Student(name2, postalAddress2, birthday2, "F");
        data.add(student2);

        return data;

    }
}
