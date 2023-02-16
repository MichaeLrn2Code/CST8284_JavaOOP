package w23lab4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

/**
 * File name: YourPurchasesTest.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284, Java
 * Assignment: Lab 04
 * Due Date: 24 Feb 2023
 * Professor: David Houtman
 * <p>Description: This is a Test-class for testing the getPurchase() of the YourPurchases class. 
 * Assumption:
 * - Price of an purchased item must be a floating number equal to or greater than zero.
 * - The number of coins received in payment must be a integer equal to or greater than zero
 * - No invalid input value such as special characters.
 * </p>
 * @author Wai Wai Chan
 * @version 1.0
 */
public class YourPurchasesTest {
	/**
	 * Set EPSILON = 1E-12 as a tolerance used to compare two floating number.
	 */
	private static final double EPSILON = 1E-12;

	/**
	 * This test case is used to test the getPurchase() of the YourPurchases class.
	 * Check if the returned value of getPurchase() match with the expected result within tolerance.
	 * Pre-Condition: YourPurchases object has been created, price of purchased item 
	 * was changed to 2.0 using recordPurchase.
	 * Post-Condition: Returned value should be 2.0
	 * Post-Condition actual results: Matches
	 */
	@Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		// set the price of purchased item equal to 2.0
		aPurchase.recordPurchase(2.0);
		double result = aPurchase.getPurchase();
		double expected = 2.0;
		Assert.assertEquals(expected, result, EPSILON);
		
	}

}
