package edu.ntnu.idatt2001.lectures.aggregation;
/**
 * 
 */

public class StudentName {
  private String firstname;
  private String lastname;

  public StudentName(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String toString() {
    return firstname + " " + lastname;
  }
}