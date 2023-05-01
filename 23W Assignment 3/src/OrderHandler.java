import java.io.IOException;

/**
 * File name: OrderHandler.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Assignment 3
 * Due Date: 9 Apr 2023
 * Professor: David Houtman
 * Description: 
 * This is a test class to show the order of the catch blocks of superclass or subclass exception type is essential, 
 * that the subclass exception declaration must be ahead of the superclass declaration.
 * 
 * @author Wai Wai Chan
 * @see java.io.IOException
 */
public class OrderHandler {

	/**
	 * This method runs the program. Throw a IOException and then caught in a catch block of type IOException, 
	 * followed by a catch block of type Exception.
	 * 
	 * Fixed the original code by swapping the IOException declaration ahead of Exception declaration. 
	 * 
	 * Below original code in comment prompts compilation error of "Unreachable catch block of IOException". 
	 * Since if put the superclass exception declaration at first, all exception subclasses will be caught by the superclass, 
	 * hence the subclass declaration behind the superclass declaration can't be reached.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
/*		try {
 * 			throw new Exception();
 * 			}
 * 		catch (Exception exception) {
 * 			}
 * 		catch (IOException ioexp) {
 * }
 */		
		try {
			System.out.println("Throws an IOException");
			throw new IOException();
		}
		catch (IOException ioexp) {
			System.err.println("IOException caught in catch block of type IOException.");
		}
		catch (Exception exception) {
			System.err.println("IOException caught in catch block of type Exception.");
		}
		
	}

}
