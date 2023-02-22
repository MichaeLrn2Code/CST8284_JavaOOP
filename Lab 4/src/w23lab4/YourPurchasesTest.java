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
 * <p>Description: This is a Test-class for testing class members of the YourPurchases class. 
 * Assumption:
 * - Price of an purchased item must be a non-negative floating number.
 * - The number of coins received in payment must be a non-negative integer.
 * - No invalid input value such as special characters.
 * </p>
 * @author Wai Wai Chan
 * @version 1.0
 * @see org.junit.Assert
 */
public class YourPurchasesTest {
	/**
	 * Set EPSILON as a tolerance used to compare two floating number
	 */
	private static final double EPSILON = 1E-12;

	/**
	 * This JUnit test case is used to test the getPurchase() of the YourPurchases class.
	 * Check if the returned purchase amount matches with the expected result within tolerance which is 1E-12.
	 * <p>Pre-Condition: YourPurchases object has been created, price of purchased item 
	 * was changed to 2.0 using recordPurchase().</p>
	 * <p>Post-Condition expected Result: Returned value should be 2.0</P>
	 * Actual results: Matches
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
	
	/**
	 * This JUnit test case is used to test the receivePayment(). Check if the 
	 * computed payment received of two Purchase Object are equivalent.
	 * <p>Pre-Condition: Two YourPurchases objects have been created, 
	 * loaded 1 dime in the first object, and load 1 nickel and 5 pennies in the second object using receivePayment().</p>
	 * <p>Post-Condition expected Result: The payment received in two Purchase Object should be equivalent.</p>
	 * Actual Results: Matches
	 * */
	@Test
	public void testComparePurchases1() {
		YourPurchases aPurchase = new YourPurchases();
		YourPurchases bPurchase = new YourPurchases();
		
		aPurchase.receivePayment(0, 0, 1, 0, 0); // received 1 dime
		
		bPurchase.receivePayment(0, 0, 0, 1, 5); //received 1 nickel and 5 pennies
	
		Assert.assertTrue(aPurchase.getPayment()==bPurchase.getPayment());
	}
	
	/**
	 * This JUnit test case is used to test the receivePayment(). Check if the 
	 * computed payment received of two Purchase Object are equivalent.
	 * <p>Pre-Condition: Two YourPurchases objects have been created, 
	 * loaded 7 dime in the first object, and load 6 dimes, 1 nickel and 5 pennies in the second object using receivePayment().</p>
	 * <p>Post-Condition expected Result: The payment received in two Purchase Object should be equivalent.</P>
	 * Actual Results: Fail, payment received in two Purchase Object are not equivalent
	 */
	@Test
	public void testComparePurchases2() {
		YourPurchases aPurchase = new YourPurchases();
		YourPurchases bPurchase = new YourPurchases();
		
		aPurchase.receivePayment(0, 0, 7, 0, 0); // received 7 dimes
		
		bPurchase.receivePayment(0, 0, 6, 1, 5); //received 6 dimes, 1 nickel and 5 pennies
	
		Assert.assertTrue(aPurchase.getPayment()==bPurchase.getPayment());
	}

}
