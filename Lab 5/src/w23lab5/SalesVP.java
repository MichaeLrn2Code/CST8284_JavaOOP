package w23lab5;

/**
 * File name: SalesVP.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 17 Mar 2023
 * Modified: 16 Mar 2023
 * Description: 23W CST8284 Lab 5
 * This class contains a main method that runs the program to conduct 
 * the second test for the SalesAgent class including the subclasses. 
 * Using Polymorphism to print all sales agents in the array, showing their name, age, location and department.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 */ 
public class SalesVP extends SalesChief{
	private double bonus;

	/**
	 * Parameterized constructor to construct a SalesVP object with passed name, 
	 * passed age, and passed department.
	 * 
	 * @param name the name of the Sales VP
	 * @param age the age of the Sales VP
	 * @param location the location of the Sales VP
	 * @param department the department of Sales VP
	 * @param bonus the bonus of the Sales VP
	 */
	public SalesVP(String name, int age, String location, String department,double bonus) {
		super(name, age, location, department);
		this.bonus = bonus;
	}
	
	/**
	 * Returns the bonus of Sales VP. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return bonus of Sales VP
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * Sets the bonus for Sales VP. The setter hasn't checked if
	 * user input is the expected result which should be a whole number or a floating number
	 * and should not be something other than that, for example: a String.
	 * 
	 * @param bonus the bonus for this Sales VP
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	/**
	 * Returns the string representation of the object showing its name, age, department and bonus.
	 * 
	 * @return a string representation of the object showing its name, age, department and bonus
	 */
	public String toString() {
		return "SalesVP [super="+ super.toString()+ ", bonus=" + bonus + "]";
	}
	
	
	/**
	 * Checks if two Sales Chiefs are the same person. Returns true if two Sales Chiefs have the same name, 
	 * the same age the same department, and the difference between their bonus within tolerance which is 0.005,
	 * , otherwise returns false.
	 * 
	 * By Prof: not only name and age need to be equal, all the attributes from superclass eg. location, department
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SalesVP))
			return false;
		double epslion = 0.005; //Tolerance for comparing two double
		SalesVP salesVP = (SalesVP) obj;
		return super.equals(obj) && (Math.abs((this.bonus)-salesVP.getBonus())<= epslion);
	}

	
}

