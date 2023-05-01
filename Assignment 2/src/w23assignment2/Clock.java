package w23assignment2;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * File name: Clock.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: Assignment 2
 * Due Date: 24 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class returns the local current hour, minutes and time as string at user's location.
 * 
 * @author Wai Wai Chan
 * @see java.time.Instant
 * @see java.time.LocalDateTime
 * @see java.time.ZoneId
 */
public class Clock {

	
	// Retrieve the current local time as String by using class LocalTime
	String timeString = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();
	
	/**
	 * Returns the current local hour of day, from 00 to 23.
	 * 
	 * @return hours The current local hour of day for this Clock
	 */
	public String getHours() {
		String hours = timeString.substring(11,13);
		return hours;
	}
	
	/**
	 * Returns the current local minute of hour as String, from 00 to 59.
	 * 
	 * @return minutes The current local minute of hour for this Clock
	 */
	public String getMinutes() {
		String minutes = timeString.substring(14,16);
		return minutes;
	}
	
	/**
	 * Returns the local current time with hour and minute.
	 * 
	 * @return A String representing the current local time with hours and minutes for this Clock
	 */
	public String getTime() {
		return String.format("%s:%s", getHours(), getMinutes());
	}
	
	
	

   











}
