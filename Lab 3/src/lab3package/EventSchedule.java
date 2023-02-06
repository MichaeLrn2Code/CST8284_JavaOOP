/**
 * File name: EventSchedule.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 03
 * Due Date: 3 Feb 2023
 * Professor: David Houtman
 * Purpose: This program adopts constructor chaining to provide four different ways for user 
 * to create an event schedule, based on the piece of event date information user have.
 */

package lab3package;
import java.time.LocalDate;

/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Wai Wai Chan.
 */

/**
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * @see  java.time.LocalDate
 * @author Wai Wai Chan
 * @version 1.0
 */
public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of EventSchedule.
	 */
	private int month;
	
	/**
	 * day component of the date of EventSchedule.
	 */
	private int day;
	
	/**
	 * No-arg constructor calling 1-arg constructor to set the default year to current year, 
	 * month to current month, and day to current day.
	 */
	public EventSchedule() {
		this(LocalDate.now().getYear());
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * 1-arg constructor calling 2-arg constructor to set the year as passed, 
	 * month to current month.
	 * @param year The year of this EventSchedule.
	 */
	public EventSchedule(int year) {
		this(year,LocalDate.now().getMonthValue());
		System.out.println("EventSchedule(int) was called");
	}
	
	/**
	 * 2-arg constructor calling 3-arg constructor to set the year as passed, month as passed,
	 * and set day to default current day.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */
	public EventSchedule(int year, int month) {
		this(year,month,LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule(int, int) was called");
	}
	
	
	/**
	 * 3-arg constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */
	public EventSchedule(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
		System.out.println("EventSchedule(int, int, int) was called");
	}
	
	
	/**
	 * This method returns the year of EvenSchedule.
	 * It has not been checked for invalid year.
	 * @return the year for this EventSchedule.
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Sets the year for this EventSchedule.
	 * It has not been checked for invalid characters.
	 * @param year The year for this EventSchedule.
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * This method returns the integer value of month.
	 * @return the month for this EventSchedule.
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	/**
	 * This method returns the integer value of day.
	 * @return day of this EventSchedule.
	 */
	public int getDay() {
		return day;
	}
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * This method to show the event year, month, and day as a report.
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",getYear(), getMonth(), getDay());
	}
}
