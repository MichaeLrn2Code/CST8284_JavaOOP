package lab3package;

/**
 * File name: TestDemo.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 03
 * Due Date: 10 Feb 2023
 * Professor: David Houtman
 * Description: This is the driver class for testing the EventSchedule class. 
 * It creates instances of the EventSchedule class with different constructors
 * with different amount of parameters, and display the name of constructor being 
 * called, and the year, month, day, and event name of each instance.
 * 
 * @author Wai Wai Chan
 * @version 2.0
 */
public class TestDemo {

	/**
	 * Main method that runs the program. Five instances of the EventSchdeule class
	 * are created with different constructors and display the corresponding year,
	 * month, day and event name of each instance.
	 * 
	 * @param args allows for String input arguments to be entered at the Command line; 
	 * this feature has not been used in this program.
	 */
	public static void main(String[] args) {

		/**
		 * Instantiate an EventSchedule1 object with lack of information of event year,
		 * month, day, and event name. Construct a new EventSchedule with default
		 * current year, month, day, and 'unlisted event'.
		 * 
		 */
		System.out.println("EventSchedule1");
		EventSchedule EventSchedule1 = new EventSchedule();
		System.out.println(EventSchedule1.createReport());

		/**
		 * Instantiate an EventSchedule2 object with only the value of year. Construct a
		 * new EventSchedule with specific value of year as passed, while month, day and
		 * event name default sets to current month, current day, and 'unlisted event'.
		 */
		System.out.println("EventSchedule2");
		EventSchedule EventSchedule2 = new EventSchedule(2024);
		System.out.println(EventSchedule2.createReport());

		/**
		 * Instantiate an EventSchedule3 object with the value of year and month.
		 * Construct a new EventSchedule with specific value of year, month as passed,
		 * while day and event name default sets to current day, and 'unlisted event'.
		 */
		System.out.println("EventSchedule3");
		EventSchedule EventSchedule3 = new EventSchedule(2024, 12);
		System.out.println(EventSchedule3.createReport());

		/**
		 * Instantiate an EventSchedule4 object with the specific value of year, month,
		 * and day. Construct a new EventSchedule with specific value of year, month,
		 * day as passed and event name default sets to 'unlisted event'.
		 */
		System.out.println("EventSchedule4");
		EventSchedule EventSchedule4 = new EventSchedule(2024, 12, 15);
		System.out.println(EventSchedule4.createReport());

		/**
		 * Instantiate an EventSchedule5 object with the specific value of year, month,
		 * day and event name. Construct a new EventSchedule with specific value of
		 * year, month, day and event name as passed.
		 */
		System.out.println("EventSchedule5");
		EventSchedule EventSchedule5 = new EventSchedule(2024, 12, 15,"lab 3");
		System.out.println(EventSchedule5.createReport());

	}

}
