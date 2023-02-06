/**
 * File name: TestDemo.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 03
 * Due Date: 3 Feb 2023
 * Professor: David Houtman
 * Purpose: This program adopts constructor chaining to provide four different ways for user 
 * to create an event schedule, based on the piece of event date information user have.
 */

package lab3package;

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Wai Wai Chan
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {

		/**
		 * Instantiate an EventSchedule1 object with lack of information 
		 * of event year, month, day. Constructor sets year, month, and day 
		 * default to current year, current month, and current day.
		 */ 
		System.out.println("EventSchedule1");
		EventSchedule EventSchedule1 = new EventSchedule();
		System.out.println(EventSchedule1.createReport());
		
		/**
		 * Instantiate an EventSchedule2 object with only the value of year. 
		 * Constructor sets the year value as passed, while object's month, 
		 * and day default sets to current month, and current day.
		 */ 
		System.out.println("EventSchedule2");
		EventSchedule EventSchedule2 = new EventSchedule(2024);
		System.out.println(EventSchedule2.createReport());
		
		/**
		 * Instantiate an EventSchedule3 object with the value of year and month. 
		 * Constructor sets the year and month value as passed, 
		 * while object's day default sets to current day.
		 */ 
		System.out.println("EventSchedule3");
		EventSchedule EventSchedule3 = new EventSchedule(2024,12);
		System.out.println(EventSchedule3.createReport());
		
		/**
		 * Instantiate an EventSchedule4 object with the value of year, month, and day. 
		 * Constructor sets the value of year, month and day to as passed.
		 */ 
		System.out.println("EventSchedule4");
		EventSchedule EventSchedule4 = new EventSchedule(2024, 12 , 15);
		System.out.println(EventSchedule4.createReport());
		

	}

}
