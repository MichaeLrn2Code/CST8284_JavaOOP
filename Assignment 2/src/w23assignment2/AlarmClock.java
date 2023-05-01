package w23assignment2;

/**
 * File name: AlarmClock.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: Assignment 2
 * Due Date: 24 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class provides methods to set the hour and minute for the alarm, and show the current time along with alarm status.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 */
public class AlarmClock extends Clock{
	
	private int alarmHours;
	private int alarmMinutes;
	private boolean alarmOn;
	
	/**
	 * Parameterized constructor to construct a AlarmClock object with passed hours and minutes.
	 * @param hours The hours set for this AlarmClock
	 * @param minutes The minutes set for this AlarmClock
	 */
	public AlarmClock(int hours, int minutes) {
		setAlarm(hours,minutes);
	}
	
	/**
	 * Sets the hours and minutes for this AlarmClock. The setter hasn't checked if
	 * user input is the expected result that hours should be a whole number from 0 to 23, minutes should be a whole number from 0 to 59.
	 * Hours and minutes should not be something else, for example: a double or a string.
	 * 
	 * @param hours The hour for this AlarmClock
	 * @param minutes The minute for this AlarmClock
	 */
	public void setAlarm(int hours, int minutes) {
		this.alarmHours = hours;
		this.alarmMinutes = minutes;
	}

	/**
	 * Returns the current time and alarm status with on or off for this AlarmClock. If the current time is less than the alarm time, alarm is on, otherwise it's off.
	 * 
	 * @return A String representing the current time and the alarm status for this AlarmClock
	 */
	@Override
	public String getTime() {
		String alarmSta;
		if(this.alarmHours > Integer.parseInt(super.getHours()) || (this.alarmHours == Integer.parseInt(super.getHours()) && this.alarmMinutes > Integer.parseInt(super.getMinutes())))
			alarmOn = true;
		
		else{
			alarmOn = false;
			setAlarm(0,0);
		}
		if(alarmOn)
			alarmSta="(Alarm is ON.)";
		else
			alarmSta="(Alarm is OFF.)";
		
		return ("Current Time: " + super.getTime() + " " + alarmSta);
	}
	
	

}
