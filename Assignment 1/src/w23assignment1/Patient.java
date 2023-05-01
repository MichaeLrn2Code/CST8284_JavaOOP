package w23assignment1;

import java.time.LocalDate;


/**
 * File name: Patient.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 26 Feb 2023
 * Modified: 25 Feb 2023
 * Description: 23W CST8284 Assignment 1
 * This class maintains important health information about a patient, 
 * calculates BMI value, maximum heart rate and target heart rate range for a patient,
 * and then show all health information in a summary report.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 * @see java.time.LocalDate
 * 
 */ 
public class Patient {
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private double height; // in inches unit
	private double weight; // in pounds unit

	/**
	 * Default constructor to initialize a Patient Object with all the String data members set to null, 
	 * all int data members set to 0, and all double data members set to 0.0
	 */
	public Patient() {

	}
	
	/**
	 * Overloaded constructor to initialize a Patient Object with first name as passed, last name as passed, gender as passed, 
	 * birth year as passed, birth month as passed, birth day as passed, height as passed, and weight as passed.
	 * 
	 * @param firstName The first name of the patient
	 * @param lastName	The last name of the patient
	 * @param gender	The gender of the patient
	 * @param birthYear	The birth year of the patient
	 * @param birthMonth The birth month of the patient
	 * @param birthDay	The birth day of the patient
	 * @param height	The height of the patient
	 * @param weight	The weight of the patient
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
			double height, double weight) {
		setLastName(lastName);
		setFirstName(firstName);
		setGender(gender);
		setBirthYear(birthYear);
		setBirthMonth(birthMonth);
		setBirthDay(birthDay);
		setHeight(height);
		setWeight(weight);
	}

	/**
	 * Returns the first name for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return The first name for this Patient
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a String without special characters
	 * and should not be something other than that, for example: a whole number or a double.
	 * 
	 * @param firstName The first name for this Patient; should be a String without special characters
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Returns the last name for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return The last name for this Patient
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a String without special characters
	 * and should not be something other than that, for example: a whole number or a double.
	 * 
	 * @param lastName The last name for this Patient; should be a String without special characters
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Returns the gender for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return The gender for this Patient
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the last name for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a String without special characters
	 * and should not be something other than that, for example: a whole number or a double.
	 * It does not guarantee user to input a reasonable String.
	 * 
	 * @param gender The gender for this Patient; should be a String without special characters
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Returns the birth year for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the birth year for this Patient
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	/**
	 * Sets the birth year for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a four digit whole number between 1900 and the current year of LocalDate package (inclusively)
	 * and should not be something other than that, for example: a String, a floating-number, or a special character.
	 * It does not guarantee user to input a reasonable year, for example: a year value beyond the range of 1900 and he current year of LocalDate package, or a negative year value.
	 * 
	 * @param birthYear birth year for this Patient; should be a four digit whole number between 1900 and the current year of LocalDate package (inclusively)
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Returns the birth month for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the birth month for this Patient
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * Sets the birth month for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a one or two digit whole number between 1 and 12 (ie. January is month 1)
	 * and should not be something other than that, for example: a String, a floating-number, or a special character.
	 * It does not guarantee user to input a valid month, such as month beyond the range of month 1 and month 12, or a negative month.
	 * 
	 * @param birthMonth birth month for this Patient; should be a one or two digit whole number between 1 and 12
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * Returns the birth day for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the birth day for this Patient
	 */
	public int getBirthDay() {
		return birthDay;
	}

	/**
	 * Sets the birth day for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a one or two digit whole number between 1 and 31
	 * and should not be something other than that, for example: a String, a floating-number, or a special character.
	 * It does not guarantee user to input a valid day, such as month beyond the range of day 1 and day 31, or a negative day.
	 * 
	 * @param birthDay The birth day for this Patient; should be a one or two digit whole number between 1 and 31
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * Returns the height for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the height for this Patient
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a whole number or a floating number with 2 decimal places
	 * and should not be something other than that, for example: a String, or a special character.
	 * It does not guarantee user to input the height in inches unit or input a reasonable height value.
	 * 
	 * @param height height for this Patient; should be a whole number or a floating number with 2 decimal places
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Returns the weight for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the weight for this Patient
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Sets the weight for this Patient. The setter hasn't checked if
	 * user input is the expected result which should be a whole number or a floating number with 2 decimal places
	 * and should not be something other than that, for example: a String, or a special character.
	 * It does not guarantee user to input the height in pounds unit or input a reasonable weight value.
	 * 
	 * @param weight weight for this Patient; should be a whole number or a floating number with 2 decimal places
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Computes and returns the BMI (which is calculated by inches in height and pounds in weight)
	 * for this Patient. The result hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the BMI for this Patient
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	}
	
	/**
	 * Computes and returns the BMI for this Patient.
	 * This is done with some error in the calculations which weight divided by height only once.
	 * The result hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the BMI for this Patient
	 */
	public double getBMIErr() {
		return (getWeight() * 703) / (getHeight());
	}

	/**
	 * Returns the age for this Patient. The result of 
	 * the getter hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return The age for this Patient
	 */
	public int getAge() {
		return (LocalDate.now().getYear() - getBirthYear());
	}

	/**
	 * Computes and returns the maximum heart rate for this Patient. 
	 * The result hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the maximum heart rate for this Patient
	 */
	public double getMaxHeartRate() {
		return (220 - getAge());
	}
	
	/**
	 * Computes and returns the minimum target heart rate for this Patient. 
	 * The result hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return the minimum target heart rate for this Patient
	 */
	
	public double getMinTargetHeartRate() {
		return (0.5 * getMaxHeartRate());
	}

	/**
	 * Returns the maximum target heart rate for this Patient. The result
	 * hasn't been checked for valid input, having the
	 * possibility of returning the unexpected result.
	 * 
	 * @return The maximum target heart rate for this Patient
	 */
	public double getMaxTargetHeartRate() {
		return (0.85 * getMaxHeartRate());
	}

	/**
	 * Display all health information for this Patient, and a table of BMI categories.
	 */
	public void displayMyHealthData() {
		System.out.printf(
				"First name: %s %nLast name: %s %nGender: %s%n"
						+ "Birth Year: %d, Birth Month: %d, Birth Day: %d, Age: %d%n"
						+ "Height: %.2f (inches)%nWeight: %.2f (lbs)%nBMI: %.1f%n"
						+ "Maximum heart rate: %.2f%nTarget heart rate range: %.2f and %.2f%n%n",
				getFirstName(), getLastName(), getGender(), getBirthYear(), getBirthMonth(), getBirthDay(), getAge(),
				getHeight(), getWeight(), getBMI(), getMaxHeartRate(), getMinTargetHeartRate(),
				getMaxTargetHeartRate());


		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

}
