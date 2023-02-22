package w23lab4;

/**
 * File name: YourPurchases.java Author: Wai Wai Chan, 041057469 Course:
 * CST8284, Java Assignment: Lab 04 Due Date: 24 Feb 2023 Professor: David
 * Houtman
 * <p>
 * Description: This class provides methods to record the purchase amount,
 * received payment, and calculate change due for a purchase.
 * </p>
 * 
 * @author Wai Wai Chan
 * @version 1.0
 */
public class YourPurchases {
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
	 * Constructs a cash register - your purchases- with 0 money and 0 purchase amount in it.
	 */
	public YourPurchases() {
		purchase = 0;
		payment = 0;
	}

	/**
	 * Returns the amount of purchases. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return amount of purchases
	 */
	public double getPurchase() {
		return purchase;

	}

	/**
	 * Returns the amount of payment. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return amount of payments
	 */
	public double getPayment() {
		return payment;

	}

	/**
	 * Records the purchase price of an item. The method hasn't checked if
	 * user input is the expected result which should be a should be a non-negative whole number or double, 
	 * and should not be something other than that, for example: a String, or a special character.
	 * 
	 * @param amount the price of the purchased item
	 */
	public void recordPurchase(double amount) {
		purchase = purchase + amount;

	}

	/**
	 * Enters the payment received from the customer. The method hasn't checked 
	 * if user input is the expected result which should be a non-negative whole number, 
	 * and should not be something other than that, for example: a String, a floating number or a special character.
	 * 
	 * @param dollars  the number of dollars in the payment
	 * @param quarters the number of quarters in the payment
	 * @param dimes    the number of dimes in the payment
	 * @param nickels  the number of nickels in the payment
	 * @param pennies  the number of pennies in the payment
	 */
	public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE
				+ pennies * PENNY_VALUE;
	}

	/**
	 * Computes and returns the change due. The result hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the change due to the customer
	 */
	public double calculateChange() {
		double change = payment + purchase;

		return change;
	}

	/**
	 * Computes the change due and resets the machine for the next customer. 
	 * The result hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the change due to the customer
	 */
	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}
