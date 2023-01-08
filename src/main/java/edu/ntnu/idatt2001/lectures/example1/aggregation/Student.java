package edu.ntnu.idatt2001.lectures.example1.aggregation;

import java.time.LocalDate;

import edu.ntnu.idatt2001.lectures.example1.utils.Address;
import edu.ntnu.idatt2001.lectures.example1.utils.Name;

/**
 *
 */

public class Student {
  private final Name name;
  private final Address address;
  private final LocalDate birthday;
  private final String gender; 

  public Student(Name name, Address address, LocalDate birthday, String gender) {
    this.name = name;
    this.address = address;
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
    return name.getLastname();
  }

  public String getFirstname() {
    return name.getFirstname();
  }

	/**
	 * @return
	 */
	public String getUniqueIdasString() {
		return this.getBirthday().toString() + "-" + this.getLastname()+"-"+this.getFirstname()+"-"+this.getGender();
	}


  @Override
  public String toString() {
    return "Student [studentName=" + name + ", postalAddress=" + address + ", birthday=" + birthday
        + ", gender=" + gender + "]";
  }
}