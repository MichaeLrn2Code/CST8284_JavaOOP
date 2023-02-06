/**
 * File name: Username.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 01
 * Due Date: 27 Jan 2023
 * Professor: David Houtman
 * Purpose: This Username class contain the data members of a user
 * including first name, last name, and student number, 
 * also a worker method to represent data members as a report.
 */

/**
 * This class contains a no-arg constructor, a 3-arg constructor, the data
 * members of a user including first name, last name, and student number. Also a
 * toString method to convert these data members to a string for representation.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 * @since JavaSE-17
 */

/*
 * *****************************************************************************
 * * Overall Feedback Lab 1 Feedback] Demo (5/5) Followed instructions (1/1)
 * Documentation (1/2) Part B (1.5/2) Total (8.5/10) 3. Documentation: Your
 * comments (mostly) don't explain anything that isn't already obvious. You need
 * to document each method completely. Does the username always contain two
 * digits, or is one digit allowed? How is the string data protected from bad
 * input (if it is?), e.g. non-alphabetic data, or spaces in the input? How many
 * digits can the student number hold?, etc.
 * 
 * *****************************************************************************
 * *
 */

public class Username {
	// private data members
	private String firstName;
	private String lastName;
	private long studentNum;

	/**
	 * No-argument constructor initializes firstName to Null, lastName to Null,
	 * studentNum to 0L. This ensure that Username objects start in a consistent
	 * state
	 */
	public Username() {
		this(null, null, 0L);
	}

	/**
	 * 3-arguments constructor, including firstName, lastName, and studentNum
	 * 
	 * @param firstName  the first name of user
	 * @param lastName   the last name of user
	 * @param studentNum the student number of user
	 */
	public Username(String firstName, String lastName, long studentNum) {
		/*
		 * setFirstName(firstName); setLastName(lastName); setStudentNum(studentNum);
		 */
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNum = studentNum;
	}

	/**
	 * This method is to get the first name of user. firstName has not been checked
	 * for non-alphabetic data input. The space in the firstName will be handled in
	 * the setter to trim the spaces.
	 * 
	 * @return a string specifying the first name of user
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method is to set the first name of user. replaceAll() method is used to
	 * trim off the spaces in the firstName. firstname has not been protected from
	 * non-alphabetic data input.
	 * 
	 * @param firstName a string specifying the first name of user, the value is
	 *                  coming from user's input in main method
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName.replaceAll("\\s", "").replaceAll("-", "");
	}

	/**
	 * This method is to get the last name of user lastName has not been checked for
	 * non-alphabetic data input. The space in the lastName will be handled in the
	 * setter to trim the spaces.
	 * 
	 * @return a string specifying the last name of user
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This method is to set the last name of user
	 * 
	 * @param lastName a string specifying the last name of user, the value is
	 *                 coming from user's input in main method
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName.replaceAll("\\s", "").replaceAll("-", "");
	}

	/**
	 * This method is to get the student number of user. Student number should be a
	 * 9 digit number. It has not been checked for non-numeric data input, or
	 * decimal number input
	 * 
	 * @return a long integer value specifying the student number of user
	 */
	public long getStudentNum() {
		return studentNum;
	}

	/**
	 * This method is to set the student name of user. Student number should be a 9
	 * digit number. It has not been checked for non-numeric data input, or decimal
	 * number input
	 * 
	 * @param studentNum a long integer number specifying the student number of
	 *                   user, the value is coming from user's input in main method
	 */
	public void setStudentNum(long studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * This method is to generate a Username by combining last three characters of
	 * First name and the result of last two digits of Student number modulus 17 and
	 * the first character of the Last name. Using padding in string.format() method
	 * to represent the result of last two digits of Student number modulus 17 by
	 * two characters.
	 * 
	 * This method doesn't handle invalid input including firstName less than 3
	 * characters, null input in firstname, null input in lastname, and null input
	 * in studentNum
	 * 
	 * 
	 * @param firstName  the First name of user, must at least 3 characters
	 * @param lastName   the Last name of user, must at least 1 characters
	 * @param studentNum the Student number of user, should be a 9 digit number
	 * @return a String representing the Username of user. Username is generated by
	 *         the combination of last three characters of First name and the result
	 *         of last two digits of Student number modulus 17 and the first
	 *         character of the Last name. Username always contain 4 characters and
	 *         2 whole number.
	 */
	public String generateUsername(String firstName, String lastName, long studentNum) {
		int size = firstName.length();
		String useridFirst = firstName.substring(size - 3, size);
		String useridLast = lastName.substring(0, 1);
		long useridNum = (studentNum % 100) % 17;

		/*
		 * From Professor's comment: generateUsername() should return ONLY the username,
		 * ready for use. It should not include "Username is…"…this has nothing to do
		 * with what generateUsername() DOES. Put this in a toString(); but not here
		 */
		return String.format("%s%02d%s", useridFirst, useridNum, useridLast);
	}
}
