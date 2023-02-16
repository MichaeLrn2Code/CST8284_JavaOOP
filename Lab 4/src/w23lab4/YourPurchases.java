package w23lab4;


/**
 * File name: YourPurchases.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284, Java
 * Assignment: Lab 04
 * Due Date: 24 Feb 2023
 * Professor: David Houtman
 * <p>Description: This class provides methods to record the purchase amount, received payment, 
 * and calculate change due for a purchase.
 * </p>
 * @author Wai Wai Chan
 * @version 1.0
*/
public class YourPurchases
{
	/**
	 * The value of a quarter is {@value #QUARTER_VALUE}
	 */
   public static final double QUARTER_VALUE = 0.25;
   /**
    * The value of a dime is {@value #DIME_VALUE}
    */
   public static final double DIME_VALUE = 0.1;
   /**
    * The value of a nickel is {@value #NICKEL_VALUE}
    */
   public static final double NICKEL_VALUE = 0.05;
   /**
    * The value of a penny is {@value #PENNY_VALUE}
    */
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;

   /**
      Constructs a YourPurchases object with purchase and payment values set to 0.
   */
   public YourPurchases()
   {
      purchase = 0;
      payment = 0;
   }

   
   /**
   Returns the amount of purchases.
   It has not been checked for valid purchase price, i.e. may return a negative purchased price.
   
   @return amount of purchases
	*/
	public double getPurchase()
	{
	   return purchase;
	  
	}

	
	/**
	Returns the amount of payment.
	It has not been checked for valid payment amount, i.e. may return a negative payment amount.
	
	@return amount of payments
	*/
	public double getPayment()
	{
	return payment;
	
	}

   /**
      Records the purchase price of an item. 
      The price of the purchased item should be a floating number equal to or greater than zero, 
      however it is not checked for valid input i.e. it may contain a negative number.
      Input non-numeric values will cause the program to crash.
      
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
     
   }
   
   /**
      Enters the payment received from the customer.
      The number of the received coins should be an integer equal to or greater than zero, 
      however it is not checked for valid input i.e. it may contain a negative number.
      Input non-numeric value or a floating number will cause the program to crash.
      
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
      Computes and returns the change due. This is done with some errors in the calculations.
      Since it has not been checked for valid input of payment and purchase, it may return an invalid change value, 
      i.e. may return a negative change value.
      
      @return the change due to the customer
   */
   public double CalculateChange()
   {
      double change = payment + purchase;
      
      return change;
   }

/**
      Computes the change due and resets the machine for the next customer.
      Since it has not been checked for valid input of payment and purchase, it may return an invalid change value, 
      i.e. may return a negative change value.
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

