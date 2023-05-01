package w23assignment2;


/**
 * File name: ClockDemo.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: Assignment 2
 * Due Date: 24 Mar 2023
 * Lab Professor: David Houtman
 * Description: 
 * This class tests the Clock class and display the local current hours, minutes and time.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 */
public class ClockDemo
{

	/**
	 * This method runs the program.
	 * It creates a clock objects and display its local current hours, minutes and time.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
   public static void main(String[] args)
   {
	   	//test Clock
		System.out.println("Testing Clock class");
		Clock clock = new Clock();
		System.out.println("Hours: " + clock.getHours());
		System.out.println("Minutes: " + clock.getMinutes());
		System.out.println("Time: " + clock.getTime());
   }
}
