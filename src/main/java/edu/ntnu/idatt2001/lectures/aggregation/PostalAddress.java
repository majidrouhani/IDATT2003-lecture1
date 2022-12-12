package edu.ntnu.idatt2001.lectures.aggregation;
/**
 * 
 *  
*/

public class PostalAddress {
  private final int postalCode;
  private final String postalAddress;

  public PostalAddress(int postalCode, String postalAddress) {
    this.postalCode = postalCode;
    this.postalAddress = postalAddress;
  }

  public int getPostalCode() {
    return postalCode;
  }

  public String getPostalAddress() {
    return postalAddress;
  }

  @Override
  public String toString() {
    return "PostalAddress [postalCode=" + postalCode + ", postalAddress=" + postalAddress + "]";
  }
}