package w23assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * File name: MyHealthDataTest2.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 26 Feb 2023
 * Modified: 25 Feb 2023
 * Description: 23W CST8284 Assignment 1
 * This is a Test-class for testing class members of the Patient class.
 * Assumption: The value of weight and height must be a whole number or a floating number with 2 decimal places.
 * 
 * @author Wai
 * @version 1.0
 * @see org.junit.Assert
 *
 */
public class MyHealthDataTest2 {
	
	/**
	 * Set EPSILON = 1E-12 as a tolerance used to compare two floating number.
	 */
	private static final double EPSILON = 1E-12;

	/**
	 * This JUnit test case is used to test the getBMI().
	 * Check if the returned BMI value matches with the expected result within tolerance which is 1E-12.
	 * <p>Pre-Condition: Patient object has been created, weight was changed to 125 using setWeight(), 
	 * height was changed to 68 using setHeight().</p>
	 * <p>Post-Condition expected Result: Returned value should be 19.004108996540</P>
	 * Actual results: Matches
	 */
	@Test
	public void testGetBMI() {
		//set up the test
		Patient patient = new Patient();
		patient.setWeight(125);
		patient.setHeight(68);
		
		//expected value or result
		double actualBMI = patient.getBMI();
		final double expectedBMI = 19.004108996540;
		
		
		assertEquals("getBMI() return value does not match expectations",
				expectedBMI,actualBMI,EPSILON);

		//tear down resources i.e. make avail for Garbage Collector
		patient = null;
	}
	
	/**
	 * This JUnit test case is used to test the getBMIErr().
	 * Check if the returned BMI value matches with the expected result within tolerance which is 1E-12.
	 * <p>Pre-Condition: Patient object has been created, weight was changed to 199.81 using setWeight(), 
	 * height was changed to 69.12 using setHeight().</p>
	 * <p>Post-Condition expected Result: Returned value should be 19.004108996540</P>
	 * Actual results: Fail, the actualBMI returned is 2032.2110821759256
	 */
	@Test
	public void testGetBMIErr() {
		Patient patient = new Patient();
		patient.setWeight(199.81);
		patient.setHeight(69.12);
		
		//expected value or result
		final double expectedBMI = 29.401201999073;
		double actualBMI = patient.getBMIErr();
		
		assertEquals("getBMIErr() return value does not match expectations",
				expectedBMI,actualBMI,EPSILON);

		//tear down resources i.e. make avail for Garbage Collector
		patient = null;
	}
	
	
	


}
