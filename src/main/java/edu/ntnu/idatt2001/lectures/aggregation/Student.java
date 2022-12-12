package edu.ntnu.idatt2001.lectures.aggregation;

/**
 * Student.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * Fra programliste 11.5 side 361.
 *
 * Komposisjon: Navneobjektet er gjemt inne i studentobjektet.
 * Klienten forholder seg ikke til klassen Navn i det hele tatt.
 */

public class Student {
  private StudentName studentName;
  private PostalAddress postalAddress;

  public Student(StudentName studentName, PostalAddress postalAddress) {
    this.studentName = studentName;
    this.postalAddress = postalAddress;
  }

  public String getLastname() {
    return studentName.getLastname();
  }

  public String getFirstname() {
    return studentName.getFirstname();
  }

  public void setFirstname(String firstname) {
    studentName.setFirstname(firstname);
  }

  public void setLastname(String lastname) {
    studentName.setLastname(lastname);
  }

  @Override
  public String toString() {
    return "Student [studentName=" + studentName + ", postalAddress=" + postalAddress + "]";
  }
}