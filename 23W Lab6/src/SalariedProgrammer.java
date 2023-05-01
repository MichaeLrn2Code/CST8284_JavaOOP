
/**
 * File name: SalariedProgrammer.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This concrete class provides methods to print out a weekly salaried programmer's information and calculate their payment due and income tax amount.
 * 
 * @author Wai Wai Chan
 */
public class SalariedProgrammer extends Programmer  {
private double weeklySalary;

/**
 * Parameterized constructor to construct a salaried Programmer with passed first name, last name, social security number and weekly salary.
 * 
 * @param firstName the first name for this salaried Programmer
 * @param lastName the last name for this salaried Programmer
 * @param socialSecurityNumber the social security number for this salaried Programmer
 * @param weeklySalary the weekly salary for this salaried Programmer
 * @throws IllegalArgumentException if the weekly salary is smaller than zero
 */
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}
this.weeklySalary = weeklySalary;
} 

/**
 * Sets the weekly salary for salaried Programmer. 
 * The setter guarantees the input weekly salary must be greater than or equal to zero, otherwise throw exception.
 * However, setter hasn't checked if the input weekly salary should be a double and should not be something other than that, for example: a string.
 * 
 * @param weeklySalary the weekly salary for this salaried Programmer
 * @throws IllegalArgumentException if the weekly salary is smaller than zero
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}
this.weeklySalary = weeklySalary;
} 

/**
 * Returns the weekly salary of salaried Programmer. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return weeklySalary the weekly salary of salaried Programmer
 */
public double getWeeklySalary() {
return weeklySalary;
} 

/**
 * Returns the payment due amount of the salaried Programmer. The payment due amount is same as the weekly salary.
 * 
 * @return a double representing the payment due amount of the salaried Programmer
 */
@Override                                                           
public double getPaymentAmount() {                                          
return getWeeklySalary();                                        
}                                             

/**
 * Returns a string representation for the first name, last name, social security number, and the weekly salary of the salaried Programmer.
 * 
 * @return a string representation showing the first name, last name, social security number, and the weekly salary
 */
@Override 
public String toString() {
	return String.format("%s: %sweekly salary: $%.2f",getClass().getSimpleName(), super.toString(), getWeeklySalary());
}


/**
 * Returns the income tax amount of salaried programmer by multiply payment due amount by 30%.
 * 
 * @return a double of income tax amount which is 30% of the payment due amount
 */
@Override
public double display() {
	return getPaymentAmount()*0.3;
}
                                            
}

