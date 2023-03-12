package w23assignment1;

import java.util.Scanner;

/**
 * File name: MyHealthDataTest.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 26 Feb 2023
 * Modified: 25 Feb 2023
 * Description: 23W CST8284 Assignment 1
 * This class contains a main method that runs the program.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 * @see java.util.Scanner
 * 
 */ 
public class MyHealthDataTest {
	/**
	 * This method runs the program. 
	 * Ask user for first name, last name, gender, birth date, height and weight, then
	 * report all health information for a patient, including age, BMI value, maximum heart rate, 
	 * and target heart rate range.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int birthMonth;
		int birthDay;
		double height; // in inches
		double weight; // in pounds
		
		System.out.println("Enter first name:");
		firstName = keyboard.nextLine();
		
		System.out.println("Enter last name:");
		lastName = keyboard.nextLine();
		
		System.out.println("Enter gender:");
		gender = keyboard.nextLine();
		
		System.out.println("Enter birth year (in 4 digit whole number):");
		birthYear = keyboard.nextInt();
		
		System.out.println("Enter birth month (in 1 or 2 digit whole number from month 1 to 12):");
		birthMonth = keyboard.nextInt();
		
		System.out.println("Enter birth day (in 1 or 2 digit whole number from day 1 to 31):");
		birthDay = keyboard.nextInt();
		
		System.out.println("Enter height (in inches):");
		height = keyboard.nextDouble();
		
		System.out.println("Enter weight (in pounds):");
		weight = keyboard.nextDouble();
		
		Patient patient = new Patient(firstName,lastName,gender,birthYear, birthMonth,birthDay,height,weight);
		
		patient.displayMyHealthData();
		
		
	}

}
