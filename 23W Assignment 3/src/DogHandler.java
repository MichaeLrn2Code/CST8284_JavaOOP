import java.io.IOException;

/**
 * File name: DogHandler.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Assignment 3
 * Due Date: 9 Apr 2023
 * Professor: David Houtman
 * Description: 
 * This is a test class for showing four Exception subclasses of type: ExceptionDog, ExceptionPuppy, NullPointerException, and IOException, 
 * have been caught by superclass Exception.
 * 
 * @author Wai Wai Chan
 * @see java.io.IOException
 */
public class DogHandler {

	/**
	 * This a inner class inherits from Exception class and contains no code.
	 * @author Wai Wai Chan
	 */
	public static class ExceptionDog extends Exception {
	}

	/**
	 * This a inner class inherits from ExceptionDog class and contains no code.
	 * @author Wai Wai Chan
	 */
	public static class ExceptionPuppy extends ExceptionDog {
	}

	/**
	 * This method runs the program.
	 * Throws four Exception objects of type ExceptionDog, ExceptionPuppy, NullPointerException, and IOException, then caught by superclass type Exception
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {

		try {
			System.out.println("Exception thrown from ExceptionDog.");
			throw new ExceptionDog();
		} catch (Exception expDog) {
			System.err.println("Caught ExceptionDog in catch block of type Exception.");
			expDog.printStackTrace();
		}

		try {
			System.out.println("Exception thrown from ExceptionPuppy.");
			throw new ExceptionPuppy();
		} catch (Exception expPuppy) {
			System.err.println("Caught ExceptionPuppy in catch block of type Exception.");
			expPuppy.printStackTrace();
		}
		
		try {
			System.out.println("Exception thrown From NullPointerException.");
			throw new NullPointerException();
		}catch(Exception npExp) {
			System.err.println("Caught NullPointerException in catch block of type Exception.");
			npExp.printStackTrace();
		}
		
		try {
			System.out.println("Exception thrown from IOException.");
			throw new IOException();
		}catch(Exception ioExp) {
			System.err.println("Caught IOException in catch block of type Exception.");
			ioExp.printStackTrace();
		}
	}

}
