package w23assignment2;

/**
 * File name: ClockDemo.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: Assignment 2
 * Due Date: 24 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class contains a main method that runs the program. This class creates a Clock, a WorldClock and an AlarmClock object and 
 * display their corresponding current time.
 * 
 * @author Wai Wai Chan
 */
public class ClocksDemo {

	private static final int MAXCLOCKNUM = 3; //variable for testing, set Clock Array with length of 3
	private static final int OFFSETHOURS = 12; //variable for testing, set offsetHours as +12, HongKong is 12 hours ahead of Ottawa Time
	private static final int ALARMHOURS = 7;  //variable for testing, set alarm on 7:30
	private static final int ALARMMINUTES = 30; //variable for testing, set alarm on 7:30
	
	/**
	 * This method runs the program.
	 * Display the current time of a Clock, a WorldClock, and an alarmClock with its alarm status.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {

	      Clock[] clockArray = new Clock[MAXCLOCKNUM];
	      clockArray[0] = new Clock();
	      clockArray[1] = new WorldClock(OFFSETHOURS);
	      clockArray[2] = new AlarmClock(ALARMHOURS,ALARMMINUTES);
	      
	      /**
	       * Loop through the clock array to ask each clock its current time and clock name.
	       */
	      for (int i = 0; i<clockArray.length;i++) {
	    	  System.out.println(clockArray[i].getClass().getSimpleName() + " " + clockArray[i].getTime());
	      }
	}

}
