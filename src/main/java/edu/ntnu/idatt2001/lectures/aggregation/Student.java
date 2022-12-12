package edu.ntnu.idatt2001.lectures.aggregation;

import java.time.LocalDate;

/**
 * Student.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * Fra programliste 11.5 side 361.
 *
 * Komposisjon: Navneobjektet er gjemt inne i studentobjektet.
 * Klienten forholder seg ikke til klassen Navn i det hele tatt.
 */

public class Student {
  private final StudentName studentName;
  private final PostalAddress postalAddress;
  private final LocalDate birthday;
  private final String gender; 

  public Student(StudentName studentName, PostalAddress postalAddress, LocalDate birthday, String gender) {
    this.studentName = studentName;
    this.postalAddress = postalAddress;
    this.birthday = birthday;
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }
  public LocalDate getBirthday() {
    return birthday;
  }

  public String getLastname() {
    return studentName.getLastname();
  }

  public String getFirstname() {
    return studentName.getFirstname();
  }

	public String getUniqueIdasString() {
		return this.getBirthday().toString() + "-" + this.getLastname()+"-"+this.getFirstname()+"-"+this.getGender();
	}


  @Override
  public String toString() {
    return "Student [studentName=" + studentName + ", postalAddress=" + postalAddress + ", birthday=" + birthday
        + ", gender=" + gender + "]";
  }
}