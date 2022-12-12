package edu.ntnu.idatt2001.lectures.aggregation;
/**
 * 
 *  
*/

public class PostalAddress {
  private final int code;
  private final String address;

  public PostalAddress(int postalCode, String postalAddress) {
    this.code = postalCode;
    this.address = postalAddress;
  }

  public int getCode() {
    return code;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "PostalAddress [postalCode=" + code + ", postalAddress=" + address + "]";
  }
}