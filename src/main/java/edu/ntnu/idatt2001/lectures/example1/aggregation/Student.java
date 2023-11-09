package edu.ntnu.idatt2001.lectures.example1.aggregation;

import java.time.LocalDate;

import edu.ntnu.idatt2001.lectures.example1.utils.Address;
import edu.ntnu.idatt2001.lectures.example1.utils.Name;

/**
 * Student.java - "Programmering i Java", 4.utgave - 2009-07-01
 * 
 * A class that represents a student.
 * 
 */
public class Student {
  private final Name name;
  private final Address address;
  private final LocalDate birthday;
  private final String gender;

  /*
   * Constructor: Oppretter et studentobjekt.
   * 
   * @param name
   * 
   * @param address
   * 
   * @param birthday
   * 
   * @param gender
   */
  public Student(Name name, Address address, LocalDate birthday, String gender) {
    this.name = name;
    this.address = address;
    this.birthday = birthday;
    this.gender = gender;
  }

  /**
   * getName() returnerer studentens navn.
   * 
   * @return name
   */
  public String getGender() {
    return gender;
  }

  /**
   * getAddress() returnerer studentens adresse.
   * 
   * @return address
   */

  public LocalDate getBirthday() {
    return birthday;
  }

  /**
   * getBirthday() returnerer studentens fødselsdato.
   * 
   * @return birthday
   */
  public String getLastname() {
    return name.getLastname();
  }

  /**
   * getFirstname() returnerer studentens fornavn.
   * 
   * @return
   */
  public String getFirstname() {
    return name.getFirstname();
  }

  /**
   * getFullname() returnerer studentens fullt navn.
   * 
   * @return
   */
  public String getUniqueIdasString() {
    return this.getBirthday().toString() + "-" + this.getLastname() + "-" + this.getFirstname() + "-"
        + this.getGender();
  }

  @Override
  public String toString() {
    return "Student [studentName=" + name + ", postalAddress=" + address + ", birthday=" + birthday
        + ", gender=" + gender + "]";
  }
}