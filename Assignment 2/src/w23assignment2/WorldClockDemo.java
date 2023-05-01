package w23assignment2;

/**
 * File name: WorldClockDemo.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: Assignment 2
 * Due Date: 24 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class tests the Clock and WorldClock Classes. 
 * Displays the current time of a WorldClock object after counting the passed time offset.
 * 
 * @author Wai Wai Chan
 */
public class WorldClockDemo
{
	
	/**
	 * This method runs the program.
	 * Print out the current time of a World Clock with the passed time offset.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
   public static void main(String[] args)
   {
      //test WorldClock
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = -3; // Vancouver is 3 hours behind of Ottawa time
      System.out.println("Offset: " + offset);
      WorldClock wclock = new WorldClock(offset);
      System.out.println("Hours: " + wclock.getHours());
      System.out.println("Minutes: " + wclock.getMinutes());
      System.out.println("Time: " + wclock.getTime());
   }
}
