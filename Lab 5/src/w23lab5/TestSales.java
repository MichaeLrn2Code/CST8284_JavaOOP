package w23lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * File name: TestSales.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 17 Mar 2023
 * Modified: 16 Mar 2023
 * Description: 23W CST8284 Lab 5
 * This is a Test-class for testing class members of the SalesVP class.
 * 
 * @author Wai
 * @version 1.0
 * @see org.junit.jupiter.api.Assertions
 *
 */
class TestSales {

	/**
	 * This JUnit test case is used to check if two Sales VP objects are the same object, 
	 * regarding the same name, age, location, department and same bonus.
	 * <p>Pre-Condition: Two Sales VP object has been created, , both loaded same name "Zhang", same age 23, same location "Ottawa", same department "Sales", but different bonus,
	 * one is 37027.812, another is 37027.818.</p>
	 * <p>Post-Condition expected Result: Returned value should be fail, two object are not equal</P>
	 * Actual results: Matches, the test fails with red bar
	 */
	@Test
	public void testAssertEquals(){
	   SalesVP vp1 = new SalesVP("Zhang", 23, "Ottawa", "Sales", 37027.812);            
	   SalesVP vp2 = new SalesVP("Zhang", 23, "Ottawa", "Sales", 37027.818);        
	   assertEquals(vp1,vp2);
	   System.out.println("assertEquals test completed");
	}
}
