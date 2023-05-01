/**
 * File name: CatHandler.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Assignment 3
 * Due Date: 9 Apr 2023
 * Professor: David Houtman
 * Description: 
 * This is a test class for throwing Exception subclasses of type ExceptionBeta and ExceptionGammer, 
 * and then caught in the catch block of superclass exception type ExceptionAlpha.
 * 
 * @author Wai Wai Chan
 */
public class CatHandler {
	
	/**
	 * This a inner class inherits from Exception class and contains no code.
	 * @author Wai Wai Chan
	 */
	public static class ExceptionAlpha extends Exception{}
	
	/**
	 * This a inner class inherits from ExceptionAlpha class and contains no code.
	 * @author Wai Wai Chan
	 */
	public static class ExceptionBeta extends ExceptionAlpha{}
	
	/**
	 * This a inner class inherits from ExceptionAlpha class and contains no code.
	 * @author Wai Wai Chan
	 */
	public static class ExceptionGammer extends ExceptionAlpha{}
	
	/**
	 * This method runs the program.
	 * Catch the exception type of ExceptionBeta and ExceptionGammer in catch block of type ExceptionAlpha and print out their 
	 * error message.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args){
		try {
			System.out.println("Throw Exception from ExceptionBeta.");
			throw new ExceptionBeta();
		}
		catch (ExceptionAlpha exceptionBeta){
			exceptionBeta.printStackTrace();
			System.err.println("Caught exceptionBeta in catch block of type ExceptionAlpha.");
		}
		try {
			System.out.println("Throw Exception from ExceptionGammer.");
			throw new ExceptionGammer();
		}
		catch (ExceptionAlpha exceptionGammer) {
			exceptionGammer.printStackTrace();
			System.err.println("Caught exceptionGammer in catch block of type ExceptionAlpha.");
		}
	}

}
