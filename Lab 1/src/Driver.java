
/**
 * File name: Driver.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 01
 * Due Date: 27 Jan 2023
 * Professor: David Houtman
 * Purpose: This program is to prompt user to 
 * input their first name, last name and student number, 
 * and show these information in final.
 */

import java.util.Scanner;

/**
 * This Driver class contain main method to execute the program which prompt
 * input their first name, last name and student number, and show these
 * information as a string in final.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 * @see java.lang.String , java.util.Scanner
 * @since JavaSE-17
 */
public class Driver {
	/**
	 * Main method, program starts from here.
	 * 
	 * @param args it is a String[] arguments not being used
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
//		String firstName; // the first name of user
//		String lastName; //	the last name of user
//		long studentNum; // the student number of user

		Username user1 = new Username();

		// Prompt user to input first name
		System.out.println("Please enter your First Name: ");

		/**
		 * A Setter to set the user's first name
		 * 
		 * @param String firstName, the first name of user which is a String input by
		 *               user
		 */
		user1.setFirstName(keyboard.nextLine());

		// Prompt user to input last name
		System.out.println("Please enter your Last Name: ");
		// lastName = ;

		/**
		 * A Setter to set the user's last name
		 * 
		 * @param String lastName, the last name of user which is a String input by user
		 */
		user1.setLastName(keyboard.nextLine());

		// Prompt user to input student number
		System.out.println("Please enter your Student#: ");
		// studentNum = ;

		/**
		 * A Setter to set the user's student number
		 * 
		 * @param long studentNum, student number of user which is a long integer value
		 *             input by user
		 */
		user1.setStudentNum(keyboard.nextLong());

		keyboard.close();

		/**
		 * Calling createUsername method to generate username and then display in
		 * console
		 */
		System.out.println(user1.generateUsername(user1.getFirstName(), user1.getLastName(), user1.getStudentNum()));

	}

}
