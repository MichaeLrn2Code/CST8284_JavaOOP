
/**
 * File name: CommissionProgrammer.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class provides methods to print out a commission programmer's information and calculate their payment due and income tax amount.
 * 
 * @author Wai Wai Chan
 */
public class CommissionProgrammer extends Programmer { 

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage

/**
 * Parameterized constructor to initialize a Commission Programmer object with 
 * passed first name, last name, social security number, gross sales, and commission rate.
 * 
 * @param firstName the first name for this commission programmer
 * @param lastName the last name for this commission programmer
 * @param socialSecurityNumber the social security number for this commission programmer
 * @param grossSales the gross sales for this commission programmer
 * @param commissionRate the commission rate for this commission programmer
 * @throws IllegalArgumentException if the gross sales is smaller than zero
 * @throws IllegalArgumentException if the commission rate is smaller than or equal to 0.0 or greater than or equal to 1.0
 */
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/**
 * Sets the gross sales for commission programmer. 
 * The setter guarantees the input gross sales is greater than or equal to zero, otherwise throw exception.
 * However, setter hasn't checked if the input gross sales should be a double and should not be something other than that, for example: a string.
 * 
 * @param grossSales the gross sales for this commission programmer
 * @throws IllegalArgumentException if the gross sales is smaller than zero
 */
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

/**
 * Returns the gross sales of commission programmer. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return grossSales the gross sales of the commission programmer
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * Sets the commission rate for the commission programmer. The setter guarantees the input commission rate must be greater than 0.0 and smaller than 1.0 , otherwise throw exception.
 * However, this method hasn't check if the input wage should be a double and should not be something other than that, for example: a string.
 * 
 * @param commissionRate the commission rate for the commission programmer
 * @throws IllegalArgumentException if the commission rate is smaller than or equal to 0.0 or greater than or equal to 1.0
 */
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/**
 * Returns the commission rate of the commission programmer.The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return commissionRate the commission rate of the commission programmer
 */
public double getCommissionRate() {
return commissionRate;
} 

/**
 * Returns the payment due amount of the Commission Programmer, by multiply commission rate by gross sales.
 * 
 * @return a double representing the payment due amount of the Commission Programmer
 */
@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

/**
 * Returns a string representation for the first name, last name, social security number, gross sales, and commission rate of the commission programmer.
 * 
 * @return a string representation showing the first name, last name, social security number, gross sales, and commission rate
 */
@Override      
public String toString() {
	return String.format("%s: %sgross sales: $%.2f; commission rate: %.2f",getClass().getSimpleName(),super.toString(),getGrossSales(), getCommissionRate());
}

/**
 * Returns the income tax amount of commission programmer by multiply payment due amount by 30%.
 * 
 * @return a double of income tax amount which is 30% of the payment due amount
 */
@Override
public double display() {
return getPaymentAmount()*0.3;
}                                        

}

