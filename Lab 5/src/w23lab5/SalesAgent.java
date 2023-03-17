package w23lab5;

/**
 * File name: SalesAgent.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 17 Mar 2023
 * Modified: 16 Mar 2023
 * Description: 23W CST8284 Lab 5
 * This class shows a Sales Agent with a name and age.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 */
public class SalesAgent {
	private String name;
	private int age;

	/**
	 * Parameterized constructor to construct a SalesAgent object with passed name and passed age.
	 * 
	 * @param name the name of the Sales Agent
	 * @param age the age of the Sales Agent
	 */
	public SalesAgent(String name, int age) {
		setName(name);
		setAge(age);
	}

	/**
	 * Returns the name of Sales Agent. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return amount of Sales Agent
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name for Sale Agent. The setter doesn't validated if
	 * user input is the expected result which should be a String without special characters
	 * and should not be something other than that, for example: a whole number or a double.
	 * 
	 * @param name the name for this Sales Agent
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the age of Sales Agent. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return age of Sales Agent
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age for this Sales Agent. The setter doesn't validated if
	 * user input is the expected result which should be a whole number
	 * and should not be something other than that, for example: a floating number or a String.
	 * 
	 * @param age the age for this Sales Agent
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Returns the string representation of the object showing its name and age.
	 * 
	 * @return a string representation of the object showing its name and age
	 */
	public String toString() {
		return "Sales Agent [name=" + name + ",age=" + age + "]";
	}

	/**
	 * Checks if two sales agent are the same person. Returns true if two sales agent have the same name and the same age, otherwise returns false.
	 */
	@Override
	public boolean equals(Object obj) { // Correct; use this method as your guide
		if (!(obj instanceof SalesAgent))
			return false; // return false if different object types used from 'this'
		SalesAgent salesAgent = (SalesAgent) obj; // otherwise okay to cast obj as SalesAgent
		return (this.age == salesAgent.getAge()) && (this.name).equals(salesAgent.getName());
	}

}