package w23lab5;


/**
 * File name: SalesSupervisor.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 17 Mar 2023
 * Modified: 16 Mar 2023
 * Description: 23W CST8284 Lab 5
 * This class shows a Sales Supervisor inherits the data members 
 * from Sales Agent and its own new location property.
 * 
 * 
 * @author Wai Wai Chan
 * @version 1.0
 */
public class SalesSupervisor extends SalesAgent{
	private String location;
	
	/**
	 * Parameterized constructor to construct a Sales Supervisor object with passed name,passed age, and passed location.
	 * 
	 * @param name the name of the Sales Supervisor
	 * @param age the age of the Sales Supervisor
	 * @param location the location of the Sales Supervisor
	 */
	public SalesSupervisor(String name, int age, String location) {
		super(name, age);
		setLocation(location);
	}
	
	/**
	 * Returns the location of Sales Supervisor. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return location of Sales Supervisor
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * Sets the location for Sales Supervisor. The setter doesn't validated if
	 * user input is the expected result which should be a String without special characters
	 * and should not be something other than that, for example: a whole number or a double.
	 * 
	 * @param location the location for this Sales Supervisor
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Returns the string representation of the object showing its name, age, and location.
	 * 
	 * @return a string representation of the object showing its name, age, and location
	 */
	public String toString() {
		return "Sales Supervisor [super=" + super.toString() + ",location=" + location + "]";
	}
	
	/**
	 * Checks if two Sales Supervisors are the same person. Returns true if two Sales Supervisor have the same name, the same age and the same location, otherwise returns false.
	 */
	@Override
	public boolean equals(Object obj) { // Correct; use this method as your guide
		if (!(obj instanceof SalesSupervisor))
			return false; // return false if different object types used from 'this'
		SalesSupervisor salesSupervisor = (SalesSupervisor) obj; // otherwise okay to cast obj as SalesAgent
		return (super.equals(obj) && (this.location).equals(salesSupervisor.getLocation()));
	}

}
