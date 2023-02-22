package w23lab4;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * File name: YourPurchasesTest2.java
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
 * </P>
 * @author Wai Wai Chan
 * @version 1.0
 * @see org.junit.Assert
 * 
 */
public class YourPurchasesTest2 {
	
	/**
	 * Set EPSILON as a tolerance used to compare two floating number
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * This test case is used to test the CalculateChange() of the YourPurchases class.
	 * Check if CalculateChange() calculates the change due correctly and the returned value match with the expected result within tolerance which is 1E-12.
	 * <p>Pre-Condition: YourPurchases object has been created, price of purchased item 
	 * was changed to 1.5 using recordPurchase(), loaded 5 dollars using receivePayment().</p>
	 * <p>Post-Condition: Returned value should be 3.5</P>
	 * Actual results: Fail, the returned change not match with the expected value within tolerance.
	 */
	@Test
	public void testcalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		// set the price of purchased item equal to 1.5
		aPurchase.recordPurchase(1.5);
		// a 5 dollar is received
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.calculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
	}
	
	/**
	 * This test case is used to test the giveChange() of the YourPurchases class.
	 * Check if giveChange() calculates the change due correctly and the returned value match with the expected result within tolerance which is 1E-12.
	 * <p>Pre-Condition: YourPurchases object has been created, price of purchased item 
	 * was changed to 5 using recordPurchase(), loaded 5 dollars and 1 quarter using receivePayment().</p>
	 * <p>Post-Condition: Returned value should be 0.25 </p>
	 * Post-Condition actual results: Matches
	 */
	@Test
	public void testGiveChange() {
		YourPurchases aPurchase2 = new YourPurchases();
		// set the price of purchased item equal to 5
		aPurchase2.recordPurchase(5);
		// a 5 dollar and 1 quarter are received in the payment
		aPurchase2.receivePayment(5, 1, 0, 0, 0);
		double changeResult = aPurchase2.giveChange();
		double expected = 0.25;
	    Assert.assertEquals(expected, changeResult, EPSILON);
	}
}
