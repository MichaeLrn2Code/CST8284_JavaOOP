/**
 * File name: FishHandler.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Assignment 3
 * Due Date: 9 Apr 2023
 * Professor: David Houtman
 * Description: 
 * This is a test class to show the re-throwing of an exception from easterEnding method 
 * all the way up to Main method.
 * @author Wai Wai Chan
 *
 */
public class FishHandler {
	
	/**
	 * This method throws an initial exception back to easterStarting method
	 * @throws Exception Initial Exception throws from easterEnding method
	 */
	public static void easterEnding() throws Exception{
		System.out.println("easterEnding method throws Exception back to easterStarting method");
		throw new Exception("Initial Exception thrown from easterEnding.");
	}
	
	/**
	 * This method catches the exception thrown from easterEnding method and re-throws to main level
	 * @throws Exception Re-throw the Exception thrown from easterEnding method
	 */
	public static void easterStarting() throws Exception{
		try {
			System.out.println("easterStarting method called easterEnding method");
			easterEnding();
		}catch (Exception eEnd) { // exception thrown from easterEnding()
			System.err.println("easterStarting method caught Exception thrown from easterEnding method and rethrow it.");
			throw eEnd;
		}
	}

	/**
	 * This method runs the program.
	 * Catches the re-thrown exception from easterStarting method, and handles the exception in main level by
	 * print out the exception message to the standard error stream.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Main level called easterStarting method");
			easterStarting(); 
		}catch (Exception exception) { // exception thrown from easterStarting()
			System.err.println("Rethrown Exception finally caught in Main level.");
			System.err.printf("%s%n%n", exception.getMessage());
			exception.printStackTrace();
		}
	}

}
