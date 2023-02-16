package w23lab4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;

   @Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(2.0);
		double result = aPurchase.getPurchase();
		double expected = 2.0;
		Assert.assertEquals(expected, result, EPSILON);
   }	
   
// YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 

  
     
   }

