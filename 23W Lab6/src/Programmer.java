/**
 * File name: Programmer.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This abstract superclass implements the Payme interface, providing methods to print out programmer's personal information and calculate their payment due and income tax amount.
 * 
 * @author Wai Wai Chan
 */
public abstract class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;

/**
 * Parameterized constructor to construct a Programmer object with
 * passed first name, last name and social security number.
 * 
 * @param firstName the first name for the programmer
 * @param lastName the last name for the programmer
 * @param socialSecurityNumber the social security number for the programmer
 */
public Programmer(String firstName, String lastName, String socialSecurityNumber) {
 this.firstName = firstName;
 this.lastName = lastName;
 this.socialSecurityNumber = socialSecurityNumber;
}

/**
 * Returns the first name of Programmer. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return firstName the first name of this Programmer
 */
public String getFirstName() {
	return firstName;
}

/**
 * Returns the last name of Programmer. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return lastName the last name of this Programmer
 */
public String getLastName() {
	return lastName;
}

/**
 * Returns the social security number of Programmer. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return socialSecurityNumber the social security number of this Programmer
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * Returns a string representation for the first name, last name and social security number of Programmer.
 * 
 * @return a string representation showing first name, last name and social security number.
 */
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n", 
  getFirstName(), getLastName(), "social security number", getSocialSecurityNumber());
} 


/**
 * Abstract method provides a common method implementation to all subclasses for calculating payment amount.
 * @return a double representing payment amount
 */
public abstract double getPaymentAmount();


/**
 * Abstract method provides a common method implementation to all subclasses for calculating income tax amount.
 * @return a double representing income tax amount
 */
public abstract double display();


}