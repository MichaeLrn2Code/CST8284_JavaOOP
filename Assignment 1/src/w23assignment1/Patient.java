package w23assignment1;

import java.time.LocalDate;

//23W CST8284
//Assignment 1: Patient.java

//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!

//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.
public class Patient {
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private double height; // in inches unit
	private double weight; // in pounds unit
//START CODE
//END CODE

// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE

	public Patient() {

	}

	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
			double height, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}

//END CODE

//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!

	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	}

// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
	public int getAge() {
		return (LocalDate.now().getYear() - getBirthYear());
	}

	public int getMaxHeartRate() {
		return (220 - getAge());
	}

	public double getMinTargetHeartRate() {
		return (0.5 * getMaxHeartRate());
	}

	public double getMaxTargetHeartRate() {
		return (0.85 * getMaxHeartRate());
	}

	public void displayMyHealthData() {

//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.

// START CODE
		System.out.printf(
				"First name: %s , Last name: %s , Gender: %s%n"
						+ "Year of birth: %d, month of birth: %d , day of birth: %d, Age: %d%n"
						+ "Height: %.1f , Weight: %.1f , BMI: %.1f%n"
						+ "Max. heart rate: %d , Tartget heart rate range: %.1f and %.1f%n%n",
				getFirstName(), getLastName(), getGender(), getBirthYear(), getBirthMonth(), getBirthDay(), getAge(),
				getHeight(), getWeight(), getBMI(), getMaxHeartRate(), getMinTargetHeartRate(),
				getMaxTargetHeartRate());

//END CODE

//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

} // end class Patient
