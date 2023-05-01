package w23assignment2;

/**
 * File name: WorldClock.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: Assignment 2
 * Due Date: 24 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class returns the current time of a World Clock at a certain time zone based on the provided time offset.
 * 
 * @author Wai Wai Chan
 * 
 */
public class WorldClock extends Clock{
	private int offsetHours;

	/**
	 * Parameterized constructor to construct a WorldClock object with passed offset hours.
	 * @param offsetHours The difference in hours between a WorldClock time zone and local time zone.
	 */
	public WorldClock(int offsetHours) {
		setOffsetHours(offsetHours);
	}

	/**
	 * Sets the offset hour for this WorldClock. The setter hasn't checked if
	 * user input is the expected result which should be a whole number between -24 and +24,
	 * and should not be something other than that, for example: a double or a string.
	 * 
	 * @param offsetHours The offset hours for this WorldClock
	 */
	public void setOffsetHours(int offsetHours) {
		this.offsetHours=offsetHours;
	}
	
	
	/**
	 * Returns the current time with hour from 00 to 23, and minute from 00 to 59 for this WorldClock, 
	 * by offset the difference in hours between a certain time zone and user's local time.
	 * 
	 * @return A String representing the current time for this WorldClock
	 */
	@Override
	public String getTime() {
		int worldHours = (Integer.parseInt(super.getHours()) + this.offsetHours + 24) % 24;
		int worldMinutes = Integer.parseInt(super.getMinutes());
		return String.format("%02d:%02d", worldHours, worldMinutes);
	}
	
	
}
