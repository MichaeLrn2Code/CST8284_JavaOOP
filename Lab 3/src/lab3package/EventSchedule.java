package lab3package;

import java.time.LocalDate;

/**
 * File name: EventSchedule.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 03
 * Due Date: 10 Feb 2023
 * Professor: David Houtman
 * Description: This class shows Overloaded constructor calls and linear constructor chaining using keyword 'this'. It allows user to 
 * to construct an event schedule object with different amount of parameters.In this code, the simpler constructors all call the
 * more complex one, from the no-arg constructor to the 4-arg constructor,
 * thereby chaining the calls 'UPWARDS'.
 * 
 * <p>
 * Part B: The benefit of linear constructor chaining provides flexibility for
 * user to create object with varying amount of data (parameters/properties). It
 * can be used to reuse code, reduce code duplication by creating separate
 * constructors for performing each task and building chain among them, as a
 * result enhancing the readability and maintainability of code. The chain of
 * constructors makes it easy to maintain and modify the code when new
 * properties or parameters are added or default values are changed, as one
 * constructor is changed, the chain will follow the flow. When calling a more
 * complex constructor from another simpler constructor, default values are set,
 * it ensure the objects are created in a correct, consistent and controlled
 * state.
 * </P>
 * <p>
 * If chained each class directly to the new 'base constructor', it is
 * complicated to add a new property to the EventSchedule class, since each of
 * the constructor need to be modify for adding a new property, it causes code
 * duplication and the constructor signature in each of the constructor more
 * complex. This could be prone to errors, such as forget to add the new
 * property or initialize the new property in one of the constructors, as well
 * as the entered parameter might not pass to the constructor properly, which
 * makes the objects created in a inconsistent and uncontrolled state.
 * </p>
 * <p>
 * A non-linear chain is difficult to updated when new features are added to
 * class, since each of the constructor need to be updated with new features,
 * there is no interconnection between each constructor, except the connection
 * to the base constructor. Each constructor may become more complicated as more
 * new features added to the class, making the code difficult to maintain and
 * modify. On the other hand, if the new features requires a specific value to
 * be set during initialization, all the existing object instance in driver
 * class need to be updated to pass this value to the constructor, which is
 * time-consuming and could result in errors if not all instances are updated.
 * As result of these difficulties, it is difficult to update the code for
 * adding new features to a class with non-linear constructor chain.
 * </p>
 * @see java.time.LocalDate
 * @author Wai Wai Chan
 * @version 2.0
 */
public class EventSchedule {

	/**
	 * year component of EventSchedule.
	 */
	private int year;

	/**
	 * month component of EventSchedule.
	 */
	private int month;

	/**
	 * day component of EventSchedule.
	 */
	private int day;

	/**
	 * event name of EventSchedule, default set to 'unlisted event' if user doesn't
	 * specify the event name.
	 */
	private static String eventName = "unlisted event";

	/**
	 * No-arg constructor calling 1-arg constructor and set year to the default
	 * current year. Constructs a new EventSchedule with the current year.
	 */
	public EventSchedule() {
		this(LocalDate.now().getYear());
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
		this(year, LocalDate.now().getMonthValue());
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
		this(year, month, LocalDate.now().getDayOfMonth());
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
		this(year, month, day, eventName);
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
		setYear(year);
		setMonth(month);
		setDay(day);
		setEventName(eventName);
		System.out.println("EventSchedule(int, int, int, String) was called");
	}

	/**
	 * This method returns the year of EvenSchedule. If object doesn't have specific input year value,
	 * this method returns default current year. 
	 * It has not been checked for invalid year input.
	 * 
	 * @return year the year of this EventSchedule.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year for this EventSchedule. the value of year is a 4 digit
	 * number which is greater than or equal to the current year.
	 * It has no protection for checking invalid characters or invalid year value, 
	 * such as year 9999 or 99999.
	 * 
	 * @param year the specific year user entered set for EventSchedule
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * This method returns the numeric value of month. If object doesn't have specific input month value,
	 * this method returns default current month. 
	 * It has not been checked for invalid month input.
	 * 
	 * @return month the month of this EventSchedule.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Sets the month for the EventSchedule. The value of month should be between 1 and
	 * 12. It has not been checked for invalid month input.
	 * 
	 * @param month the specific month user entered set for EventSchedule
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * This method returns the numeric value of day. If object doesn't have specific input day value,
	 * this method returns default current day. 
	 * It has not been checked for invalid day input, such as Feb 31 or decimal number.
	 * 
	 * @return day the day of this EventSchedule.
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Sets the day of the EventSchedule. The value of day is a 1 digit or 2 digit number between 1 and 31.
	 * It has not been checked for invalid day input, such as Feb 31 or decimal number.
	 * 
	 * @param day the specific day user entered set for EventSchedule
	 *            
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * This method returns the event name of the EventSchedule. If object doesn't have specific input event name value,
	 * this method returns default "unlisted event".
	 * It has not been checked for invalid input, such as special characters.
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
	 * @return A String display the year, month, day, and event name of the EventSchedule.
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d, Event Name: %s%n", getYear(),
				getMonth(), getDay(), getEventName());
	}
}
