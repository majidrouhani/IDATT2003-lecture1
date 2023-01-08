package edu.ntnu.idatt2001.lectures.example1.utils;
/**
 * 
 */

public class Name {
  private final String firstname;
  private final String lastname;

  public Name(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  @Override
  public String toString() {
    return "Name [firstname=" + firstname + ", lastname=" + lastname + "]";
  }
}