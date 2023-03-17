package w23lab5;

/**
 * File name: SalesAgentTest2.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 17 Mar 2023
 * Modified: 16 Mar 2023
 * Description: 23W CST8284 Lab 5
 * This class shows a Sales Chief inherits the data members from a Sales Supervisor 
 * and with its own new department property.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 */
public class SalesChief extends SalesSupervisor{
	private String department;
	
	/**
	 * Parameterized constructor to construct a SalesChief object with passed name, 
	 * passed age, and passed department.
	 * 
	 * @param name the name of the Sales Chief
	 * @param age the age of the Sales Chief
	 * @param location the location of the Sales Chief
	 * @param department the department of the Sales Chief
	 */
	public SalesChief(String name, int age, String location,String department ) {
		super(name, age, location);
		setDepartment(department);
	}
	
	/**
	 * Returns the department of Sales Chief. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return department of Sales Chief
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department for Sales Chief. The setter hasn't checked if
	 * user input is the expected result which should be a String without special characters
	 * and should not be something other than that, for example: a whole number or a double.
	 * 
	 * @param department the department for this Sales Chief
	 */
	public void setDepartment(String department) {
		this.department = department;
	}


	/**
	 * Returns the string representation of the object showing its name, age and department.
	 * 
	 * @return a string representation of the object showing its name, age and department
	 */
	public String toString() {
		return "Sales Chief [super="+ super.toString()+ ", department=" + department + "]";
	}
	
	/**
	 * Checks if two Sales Chiefs are the same person. Returns true if two Sales Chiefs have the same name, the same age and the same department, otherwise returns false.
	 */
	@Override
	public boolean equals(Object obj) { // Correct; use this method as your guide
		if (!(obj instanceof SalesChief))
			return false; // return false if different object types used from 'this'
		SalesChief salesChief = (SalesChief) obj; // otherwise okay to cast obj as SalesAgent
		return (super.equals(obj) && (this.department).equals(salesChief.getDepartment()));
	}
	
}
