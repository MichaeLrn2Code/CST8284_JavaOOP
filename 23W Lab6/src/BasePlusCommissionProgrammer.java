
/**
 * File name: BasePlusCommissionProgrammer.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class provides methods to print out a base salary plus commission programmer's information and calculate their payment due and income tax amount.
 * 
 * @author Wai Wai Chan
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week

/**
 * Parameterized constructor to initialize a Base Plus Commission Programmer object with 
 * passed first name, last name, social security number, gross sales, commission rate and base salary
 * 
 * @param firstName the first name for this Base Plus commission programmer
 * @param lastName the last name for this Base Plus commission programmer
 * @param socialSecurityNumber the social security number for this Base Plus commission programmer
 * @param grossSales the gross sales for this Base Plus commission programmer
 * @param commissionRate the commission rate for this Base Plus commission programmer
 * @param baseSalary the base salary for this Base Plus commission programmer
 * @throws IllegalArgumentException if the base salary is smaller than zero
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;
}

/**
 * Sets the base salary for base plus commission programmer. 
 * The setter guarantees the input base salary is greater than or equal to zero, otherwise throw exception.
 * However, setter hasn't checked if the input gross sales should be a double and should not be something other than that, for example: a string.
 * 
 * @param baseSalary the base salary for this base plus commission programmer
 * @throws IllegalArgumentException if the base salary is smaller than zero
 */
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/**
 * Returns the base salary of base plus commission programmer. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return baseSalary the base salary of the base plus commission programmer
 */
public double getBaseSalary() {
return baseSalary;
}

/**
 * Returns the payment due amount of the base plus Commission Programmer, by adding base salary to payment due amount. 
 * Payment due amount is calculated by multiplying commission rate by gross sales.
 * 
 * @return a double representing the payment due amount of the Base Plus Commission Programmer
 */
@Override                                                            
public double getPaymentAmount() {                                             
return getBaseSalary() + super.getPaymentAmount();                        
} 


/**
 * Returns a string representation for the first name, last name, social security number, gross sales, commission rate, and base salary of the Base-Plus Commission Programmer.
 * 
 * @return a string representation showing the first name, last name, social security number, gross sales, commission rate, and base salary 
 */
@Override     
public String toString() {
	return String.format("%s; base salary: $%,.2f", super.toString(),getBaseSalary());
}                                                   

}



