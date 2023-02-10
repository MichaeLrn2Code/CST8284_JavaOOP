/**
 * File name: EventSchedule.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 03
 * Due Date: 10 Feb 2023
 * Professor: David Houtman
 * Purpose: This program performs constructor chaining to provide five different ways for user 
 * to construct an event schedule, based on the amount of data or parameters user known.
 */

package reverseConstructor;

import java.time.LocalDate;

/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Wai Wai Chan.
 */
public class EventSchedule {

	private int year;
	private int month;
	private int day;
	private static String eventName = "unlisted event";

	/**
	 * No-arg constructor calling 1-arg constructor and set year to the default
	 * current year. Constructs a new EventSchedule with the current year.
	 */
	public EventSchedule() {
		setYear(LocalDate.now().getYear());
		setMonth(LocalDate.now().getMonthValue());
		setDay(LocalDate.now().getDayOfMonth());
		setEventName(eventName);
		System.out.println("EventSchedule() was called");
	}

	/**  
	 * 1-arg constructor calling 2-arg constructor and set year as passed value, set
	 * month to the default current month. Constructs a new EventSchedule with the
	 * passed year value and the default current month.
	 * 
	 * @param year the year of the EventSchedule.
	 */
	public EventSchedule(int year) {
		this();
		setYear(year);
		System.out.println("EventSchedule(int) was called");
	}

	/**
	 * 2-arg constructor calling 3-arg constructor and set year as passed, month as
	 * passed, and set day to the default current day. Constructs a new
	 * EventSchedule with the specific year and month as passed and the default
	 * current day.
	 * 
	 * @param year  year of the EventSchedule.
	 * @param month numerical month value of the EventSchedule.
	 */
	public EventSchedule(int year, int month) {
		this(year);
		setMonth(month);
		System.out.println("EventSchedule(int, int) was called");
	}

	/**
	 * 3-arg constructor calling 4-arg constructor to construct a new EventSchedule
	 * with the specified year as passed, month as passed, day as passed, and the
	 * default event name 'unlisted event'.
	 * 
	 * @param year  year of the EventSchedule.
	 * @param month numerical month value of the EventSchedule.
	 * @param day   day of the EventSchedule.
	 */
	public EventSchedule(int year, int month, int day) {
		this(year, month);
		setDay(day);
		System.out.println("EventSchedule(int, int, int) was called");
	}

	/**
	 * 4-arg constructor to construct a new EventSchedule with the specified year,
	 * month, day, and event name as passed. It has not been checked for invalid
	 * input such as special characters, non-numeric input or invalid input for
	 * year, month or day, since there is no protection in setter to validate the
	 * input.
	 * 
	 * @param year      the year of the event
	 * @param month     the numerical month value of the event
	 * @param day       the day of the event
	 * @param eventName name of the event
	 */
	public EventSchedule(int year, int month, int day, String eventName) {
		this(year, month, day);
		setEventName(eventName);
		System.out.println("EventSchedule(int, int, int, String) was called");
	}
	
	/**
	 * This method returns the year of EvenSchedule. It has not been checked for
	 * invalid year input.
	 * 
	 * @return year the year of this EventSchedule.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year for this EventSchedule. It has not been checked for invalid
	 * characters.
	 * 
	 * @param year the specific year user entered, the value of year is a 4 digit
	 *             number which is greater than or equal to the current year.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * This method returns the numeric value of month. It has not been checked for
	 * invalid month input.
	 * 
	 * @return month the month of this EventSchedule.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Sets the month for the EventSchedule. The value of month should between 1 and
	 * 12. It has not been checked for invalid month input.
	 * 
	 * @param month this is the month to set for EventSchedule, the value of Month
	 *              is a 1 digit or 2 digit number between 1 and 12.
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * This method returns the numeric value of day. It has not been checked for
	 * invalid day input, such as Feb 31 or decimal number.
	 * 
	 * @return day the day of this EventSchedule.
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Sets the day of the EventSchedule. It has not been checked for invalid day
	 * input, such as Feb 31 or decimal number.
	 * 
	 * @param day the specific day user entered, the value of day is a 1 digit or 2
	 *            digit number between 1 and 31.
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * This method returns the event name of the EventSchedule. It has not been
	 * checked for invalid input, such as special characters.
	 * 
	 * @return eventName the name of event of this EventSchedule.
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * Sets the event name for the EventSchedule. It has not been checked for
	 * invalid input.
	 * 
	 * @param eventName the specific name of event user entered.
	 */
	public void setEventName(String eventName) {
		EventSchedule.eventName = eventName;
	}

	/**
	 * This method to show the event year, month, day, event name of the
	 * EventSchedule instance.
	 * 
	 * @return A String representation of this EventSchedule, each field is
	 *         separated by a comma in the order of year, month, day, event name.
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d, Event Name: %s%n", getYear(),
				getMonth(), getDay(), getEventName());
	}
}
