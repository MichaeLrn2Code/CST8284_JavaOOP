/**
 * File name: HourlyProgrammer.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class provides methods to print out a hourly programmer's information and calculate their payment due and income tax amount.
 * 
 * @author Wai Wai Chan
 */
public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

/**
 * Parameterized constructor to construct a Hourly Programmer with passed first name, last name, social security number, wage, and hours.
 * 
 * @param firstName the first name for this Hourly Programmer
 * @param lastName the last name for this Hourly Programmer
 * @param socialSecurityNumber the social security number for this Hourly Programmer
 * @param wage the wage for this Hourly Programmer
 * @param hours the hours for this Hourly Programmer
 * @throws IllegalArgumentException if the hourly wage is smaller than zero
 * @throws IllegalArgumentException if hours is smaller than zero or greater than 168
 */
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber,double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/**
 * Sets the wage for the Hourly Programmer.
 * This method guarantees the input wage must be greater than or equal to zero, otherwise throw exception.
 * However, this method hasn't check if the input wage should be a double and should not be something other than that, for example: a string.
 * 
 * @param wage the wage for this hourly programmer
 * @throws IllegalArgumentException if the hourly wage is smaller than zero
 */
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/**
 * Returns the wage of Hourly Programmer. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return wage the wage of the hourly programmer
 */
public double getWage() {
return wage;
} 


/**
 * Sets the Hours for this hourly programmer. The setter guarantees the input hours must be between 0 and 168, otherwise throw exception.
 * However, the setter hasn't check if the input wage should be a double and should not be something other than that, for example: a string.
 * 
 * @param hours the hours for hourly programmer
 * @throws IllegalArgumentException if hours is smaller than zero or greater than 168
 */
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/**
 * Returns hours worked of Hourly Programmer.The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return hours the hours worked of the hourly programmer
 */
public double getHours() {
return hours;
} 

/**
 * This method calculates and returns the payment due amount of this hourly programmer, by multiplying hourly wage by worked hours.
 * If worked hours exceed 40 hours, the part of worked hours which exceeds 40 hours will get 50% extra pay.
 * 
 * @return the payment due amount of hourly programmer
 */
@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

/**
 * Returns a string representation for the first name, last name, social security number, hourly wage, and worked hours of hourly Programmer.
 * 
 * @return a string representation showing first name, last name, social security number, hourly wage, and worked hours
 */
@Override                                                             
public String toString() {
	return String.format("%s: %shourly wage: $%.2f; hours worked: %.2f",getClass().getSimpleName(),super.toString(),getWage(), getHours());
}


/**
 * Returns the income tax amount of hourly programmer by multiply payment due amount by 30%.
 * 
 * @return a double representing income tax amount which is 30% of the payment due amount
 */
@Override
public double display() {
	return getPaymentAmount()*0.3;
}



                     
}

