package w23assignment1;

/*
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Assignment 1
 * Due Date: 24 Feb 2023
 * Professor: David Houtman
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class MyHealthDataTest2 {
	
	/**
	 * Set EPSILON = 1E-12 as a tolerance used to compare two floating number.
	 */
	private static final double EPSILON = 1E-12;

	/**
	 * 
	 */
	@Test
	public void testGetBMI1() {
		//set up the test
		Patient patient1 = new Patient();
		patient1.setWeight(125);
		patient1.setHeight(68);
		
		//expected value or result
		double actualBMI = patient1.getBMI();
		final double expectedBMI = 19.004108996540;
		
		
		assertEquals("getBMI() return value does not match expectations",
				expectedBMI,actualBMI,EPSILON);

		//tear down resources i.e. make avail for Garbage Collector
		patient1 = null;
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetBMIErr() {
		//set up the test
		Patient patient2 = new Patient();
		patient2.setWeight(130);
		patient2.setHeight(65.3);
		
		//expected value or result
		final double expectedBMI = 21.432474455277;
		double actualBMI = patient2.getBMIErr();
		
		assertEquals("getBMIErr() return value does not match expectations",
				expectedBMI,actualBMI,EPSILON);

		//tear down resources i.e. make avail for Garbage Collector
		patient2 = null;
	}
	
	
	


}
