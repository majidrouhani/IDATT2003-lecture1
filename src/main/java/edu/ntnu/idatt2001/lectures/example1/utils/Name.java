package edu.ntnu.idatt2001.lectures.example1.utils;

/**
 * 
 */

public class Name {
  private static final String WHITESPACE = " ";
  private final String firstname;
  private final String lastname;
  private final String name;

  public Name(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.name = firstname.concat(WHITESPACE).concat(lastname);
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Name [firstname=" + firstname + ", lastname=" + lastname + ", name=" + name + "]";
  }
}