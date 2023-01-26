import java.util.Scanner;

/**
 * File name: Username.java
 * Author: Wai Wai Chan, 041057469
 * Course: CST8284 – Java
 * Assignment: Lab 02
 * Due Date: 29 Jan 2023
 * Professor: David Houtman
 * Purpose: This program is to show the number of patient across 7 provinces in Canada
 * who have recovered from COVID-19 between Feb and Sept 2020.
 */

/**
 * This class contains a 2D integer array to store the number of patient who
 * have recovered from COVID-19 between Feb to Sept 2020 across 7 provinces in
 * Canada, a 1D String array to store the name of provinces in Canada. Also
 * using two nested for-loop to represent the number of recovered persons for
 * each month and each provinces as well as compute the sum for each month.
 *
 * A 1D integer array to store the sum of recovered patient for each province throughout 8 months,
 * finally prompt user to key in the province number and then show the sum of recovered patient for that province in 8 months.
 * in the province number to show the 
 * @author Wai Wai Chan
 * 
 */
public class CovidStatistics {
	/**
	 * Main method, program starts from here.
	 * 
	 * @param args it is a String[] arguments not being used
	 */
	public static void main(String[] args) {
		final int ROWS = 7;
		final int COLUMNS = 8;
		Scanner keyboard = new Scanner(System.in);
		int provinceNum = 1;
		int[] rowSum = new int[7];

		// 2D array to store the number of recovered persons for each month and each
		// provinces
		int[][] patients = { 
				{ 2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
				{ 5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
				{ 1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 },
				{ 1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 }, 
				{ 1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
				{ 1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 }, 
				{ 1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }

		};

		// 1D array to store the name of province in Canada
		String[] provinces = { "Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia",
				"Prince Edward Island" };

		System.out.println("ProvinceNum       Month    Feb     March   April   May     June    July    Aug     Sept");
		System.out.println();

		/**
		 * A nested for-loop to show the corresponding number of recovered persons in
		 * each month for each province.
		 * 
		 * i is the outer loop control variable, to control outer loop to return the
		 * name of provinces. j is the inner loop control variable, to control inner
		 * loop to return the number of recovered patient for each month.
		 */
		int provinceSum = 0;
		for (int i = 0; i < ROWS; i++) {
			provinceSum = 0; // reset provinceSum to zero when start new outer-loop
			System.out.print(provinceNum + i);
			System.out.printf("%22s", provinces[i]);
			for (int j = 0; j < COLUMNS; j++) {
				System.out.printf("%8d", patients[i][j]);
				provinceSum += patients[i][j];
			}
			rowSum[i] = provinceSum;
			System.out.println();
		}

		/**
		 * A nested for-loop to compute the total sum of recovered people in each month.
		 */
		System.out.println();
		System.out.print("    Recovered Patients  ");

		for (int colNum = 0; colNum < COLUMNS; colNum++) {
			int sum = 0; // reset sum to zero when start new outer-loop
			for (int rowNum = 0; rowNum < ROWS; rowNum++) {
				sum += patients[rowNum][colNum];
			}
			System.out.printf("%8d", sum);
		}

		System.out.println();
		System.out.println();
		System.out.println("               Vaccinate and maintain good health practices!");
		System.out.println();

		System.out.println("Please enter the province number to show the total sum of "
				+ "recovered patient from Feb to Sept 2020. (number 1 - 7)");
		int userinput = keyboard.nextInt();

		System.out.printf(
				"The total number of recovered patient of the " + 
				"province between Feb and Sept 2020 is %,d.", rowSum[(userinput - 1)]);
		keyboard.close();
	}
}
