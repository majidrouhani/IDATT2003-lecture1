package edu.ntnu.idatt2001.lectures.example1.utils;
/**
 * 
 *  
*/

public class Address {
  private final int zipCode;
  private final String city;
  private final String state;

  public Address(int zipCode, String city, String state) {
    this.zipCode = zipCode;
    this.city = city;
    this.state = state;
  }

  public int getZipCode() {
    return zipCode;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  @Override
  public String toString() {
    return "Address [zipCode=" + zipCode + ", city=" + city + ", state=" + state + "]";
  }
}