package w23lab5;

/**
 * File name: SalesAgentTest2.java
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
public class SalesAgentTest2
{  
	//  Maximum number of agent
	private static final int maxAgentNum = 4; 
	 
	/**
	 * This method runs the program. 
	 * Display the information of the two sales agents, one sales supervisor and one sales chief,
	 * including their name, age, location and department.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
   public static void main(String[] args)
   {
	   SalesAgent[] agentList = new SalesAgent[maxAgentNum];
	   agentList[0]= new SalesAgent("Peter",56);
	   agentList[1]= new SalesAgent("John",48);
	   agentList[2]= new SalesSupervisor("Ifeoma",53, "Toronto");
	   agentList[3]= new SalesChief("Wai Wai Chan",30, "Ottawa", "Sales");
   
		  for (int i =0;i<agentList.length;i++) {
			  System.out.println(agentList[i]);
		  }
	   
   }
}  