package w23lab4;


/**
 * File name: TestDemo.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 03
 * Due Date: 10 Feb 2023
 * Professor: David Houtman
 * Description: 
 * 
 * @author Wai Wai Chan
 * @version 1.0
   
   You were at Walmart near your home to make some purchases last weekend. 
   You had so much coins including nickels, dimes, etc and wanted to just use them all for your purchases. 
   A cash register sums up the sales and then computes the change due to you.
*/
public class YourPurchases
{
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;

   /**
      Constructs a cash register - your purchases- with no money in it.
   */
   public YourPurchases()
   {
      purchase = 0;
      payment = 0;
   }

   
   /**
   Returns the amount of purchases.
   @return amount of purchases
	*/
	public double getPurchase()
	{
	   return purchase;
	  
	}

	
	/**
	Returns the amount of payment.
	@return amount of payments
	*/
	public double getPayment()
	{
	return payment;
	
	}

   /**
      Records the purchase price of an item. 
      The price of the purchased item should be a floating number equal to or greater than zero, 
      however it is not checked for valid input i.e. it may contain negative number.
      Input non-numeric value will cause the program crashed.
      
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
     
   }
   
   /**
      Enters the payment received from the customer.
      The number of the received coins should be a integer equal to or greater than zero, 
      however it is not checked for valid input i.e. it may contain negative number.
      Input non-numeric value or floating number will cause the program crashed.
      
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
      Computes and returns the change due. This is done with some error in the calculations
      @return the change due to the customer
   */
   public double CalculateChange()
   {
      double change = payment + purchase;
      
      return change;
   }

/**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
}

