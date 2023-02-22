package w23lab4;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * File name: YourPurchasesTest3.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284, Java
 * Assignment: Lab 04
 * Due Date: 24 Feb 2023
 * Professor: David Houtman
 * <p>Description: This is a Test-class for testing class members of the YourPurchases class.  
 * Assumption:
 * - Price of an purchased item must be a non-negative floating number.
 * - The number of coins received in payment must be a non-negative whole number.
 * - No invalid input value such as special characters.
 * </p>
 * @author Wai Wai Chan
 * @version 1.0
 * @see org.junit.Assert
 */
public class YourPurchasesTest3 {
	
	/**
	 * Set EPSILON as a tolerance used to compare two floating number
	 */
	private static final double EPSILON = 1E-12;

	/**
	 * This test case is used to test the getPayment() of the YourPurchases class.
	 * Check if the returned value of getPayment() match with the expected result within tolerance which is 1E-12.
	 * <p>Pre-Condition: YourPurchases object has been created, 
	 * loaded 10 dollars, 1 quarter and 1 dimes using receivePayment().</p>
	 * <p>Post-Condition: Returned value should be 10.35. </p>
	 * Post-Condition actual results: Matches
	 */
	@Test
	public void testGetPayment2() {
		YourPurchases aPurchase = new YourPurchases();
		// Set a 10 dollar, a quarter and a dimes are received in the payment
		aPurchase.receivePayment(10, 1, 1, 0, 0);
		double result = aPurchase.getPayment();
		double expected = 10.35;
		Assert.assertEquals(expected, result, EPSILON);
		
		// tear down resources, make the testing object available for Garbage Collector
		aPurchase = null;
		
	}

}
