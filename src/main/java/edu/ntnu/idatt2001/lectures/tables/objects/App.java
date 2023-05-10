package edu.ntnu.idatt2001.lectures.tables.objects;

import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.ntnu.idatt2001.lectures.example1.aggregation.Student;
import edu.ntnu.idatt2001.lectures.example1.utils.Address;
import edu.ntnu.idatt2001.lectures.example1.utils.Name;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {

  // Logger for å skrive ut informasjon til konsollen
  private static final Logger logger = Logger.getLogger(App.class.getName());

  /**
   * Main-metode som starter applikasjonen.
   *
   * @param args
   */
  public static void main(String[] args) {

    Student[] students = new Student[2];

    Name name1 = new Name("Odd Even", "Primtallet");
    Address postalAddress1 = new Address(7000, "Trondheim", "Sør-Trøndelag");
    LocalDate birthday1 = LocalDate.of(1990, Month.JANUARY, 5);

    students[0] = new Student(name1, postalAddress1, birthday1, "M");

    Name name2 = new Name("Huppasahn", "DelFinito");
    Address postalAddress2 = new Address(7001, "Trondheim", "Sør-Trøndelag");
    LocalDate birthday2 = LocalDate.of(1998, Month.MARCH, 15);

    students[1] = new Student(name2, postalAddress2, birthday2, "F");

    for (Student student : students) {
      logger.log(Level.INFO, "Student ID: {0}", student.getUniqueIdasString());
    }
  }
}