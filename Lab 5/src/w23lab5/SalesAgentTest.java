package w23lab5;


/**
 * File name: SalesAgentTest.java
 * Student Name: Wai Wai Chan
 * Lab Professor: David Houtman
 * Due Date: 17 Mar 2023
 * Modified: 16 Mar 2023
 * Description: 23W CST8284 Lab 5
 * This class contains a main method that runs the program to conduct 
 * the first test for the SalesAgent class including the subclass. 
 * The toString() in subclasses chained up to its superclass, 
 * and showing its own implementation with a specialized new property when calling toString() method.
 * 
 * @author Wai Wai Chan
 * @version 1.0
 * 
 */ 
public class SalesAgentTest{  
	
	/**
	 * This method runs the program. 
	 * Display the information of the two sales agents, one sales supervisor and one sales chief,
	 * including their name, age, location and department.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
   public static void main(String[] args)
   {

	   SalesAgent salesAgent = new SalesAgent("Peter",56);
	   SalesAgent salesAgent2 = new SalesAgent("John",48);
	   SalesSupervisor salesSupervisor = new SalesSupervisor("Ifeoma",53, "Toronto");
	   SalesChief salesChief = new SalesChief("Wai Wai Chan",30, "Ottawa", "Sales");
	   
	   System.out.printf("%s%n%s%n%s%n%s%n", salesAgent.toString(), salesAgent2.toString(),salesSupervisor.toString(),salesChief.toString() );
	   
   }
}  