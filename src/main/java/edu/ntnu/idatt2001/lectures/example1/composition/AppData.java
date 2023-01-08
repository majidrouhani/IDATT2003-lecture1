package edu.ntnu.idatt2001.lectures.example1.composition;

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

		data.add(new Student("Odd Even", "Primtallet",LocalDate.of(1990, Month.JANUARY, 5),"M",7000,"Trondheim", "Sør-Trøndelag"));
		data.add(new Student("Huppasahn", "DelFinito",LocalDate.of(1992, Month.APRIL, 15),"F",7000,"Trondheim", "Sør-Trøndelag"));

        return data;

    }
}
