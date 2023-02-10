package w23assignment1;

import java.util.Scanner;

public class MyHealthDataTest {

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
		
		System.out.println("Enter your first name:");
		firstName = keyboard.nextLine();
		
		System.out.println("Enter your last name:");
		lastName = keyboard.nextLine();
		
		System.out.println("Enter your gender:");
		gender = keyboard.nextLine();
		
		System.out.println("Enter your year of birth:");
		birthYear = keyboard.nextInt();
		
		System.out.println("Enter your month of birth:");
		birthMonth = keyboard.nextInt();
		
		System.out.println("Enter your day of birth:");
		birthDay = keyboard.nextInt();
		
		System.out.println("Enter your height:");
		height = keyboard.nextDouble();
		
		System.out.println("Enter your weight:");
		weight = keyboard.nextDouble();
		
		Patient patient1 = new Patient("firstName","lastName","gender",birthYear, birthMonth,birthDay,height,weight);
		
		patient1.displayMyHealthData();
		
		
		
	}

}
