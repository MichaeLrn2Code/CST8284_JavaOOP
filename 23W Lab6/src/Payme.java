/**
 * File name: Payme.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This is a interface contains a method for calculating payment and income tax amount.
 * 
 * @author Wai Wai Chan
 */
public interface Payme{
	
	/**
	 * This abstract method provides a common method implementation to all subclasses for calculating payment amount.
	 * @return a double representing payment amount
	 */
	double getPaymentAmount();
	
	/**
	 * This abstract method provides a common method implementation to all subclasses for calculating income tax amount.
	 * @return a double representing income tax amount
	 */
	double display();

}
