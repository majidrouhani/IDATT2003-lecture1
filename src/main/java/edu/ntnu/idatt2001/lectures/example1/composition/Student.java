package edu.ntnu.idatt2001.lectures.example1.composition;

import java.time.LocalDate;

import edu.ntnu.idatt2001.lectures.example1.utils.Address;
import edu.ntnu.idatt2001.lectures.example1.utils.Name;

/**
 * Student.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * Fra programliste 11.5 side 361.
 *
 * Komposisjon: Navneobjektet er gjemt inne i studentobjektet.
 * Klienten forholder seg ikke til klassen Navn i det hele tatt.
 */

public class Student {
  private final Name name;
  private final Address address;
  private final LocalDate birthday;
  private final String gender; 

  public Student(String firstname, String lastname, LocalDate birthday, String gender, int zipCode, String city, String state) {
    this.name = new Name(firstname, lastname);
    this.birthday = birthday;
    this.gender = gender;
    this.address = new Address(zipCode, city, state);
  }

  public String getGender() {
    return gender;
  }
  public LocalDate getBirthday() {
    return birthday;
  }

  public String getLastname() {
    return name.getLastname();
  }

  public String getFirstname() {
    return name.getFirstname();
  }

	public String getUniqueIdasString() {
		return this.getBirthday().toString() + "-" + this.getLastname()+"-"+this.getFirstname()+"-"+this.getGender();
	}


  @Override
  public String toString() {
    return "Student [studentName=" + name + ", postalAddress=" + address + ", birthday=" + birthday
        + ", gender=" + gender + "]";
  }
}