
/**
 * File name: PaymeInterfaceTest.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This test class contains a main method that runs the program. This class creates two Invoices, , one
 * HourlyProgrammer , one CommissionProgrammerCommissionProgrammer, one SalariedProgrammer , and one
 * BasePlusCommissionProgrammer, then print out their information, payment due and income tax amount.
 * 
 * @author Wai Wai Chan
 */
public class PaymeInterfaceTest  {

	/**
	 * This method runs the program.
	 * Display the information of two Invoices, one HourlyProgrammer, one CommissionProgrammerCommissionProgrammer, 
	 * one SalariedProgrammer , and one BasePlusCommissionProgrammer with their payment due and income tax amount.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
public static void main(String[] args) {
	
	Payme[] paymeObjects = new Payme[6]; // create a new array of type Payme with length of 6

	//Populate the array with two Invoices, one HourlyProgrammer, one CommissionProgrammerCommissionProgrammer, one SalariedProgrammer , and one BasePlusCommissionProgrammer object
	paymeObjects[0] = new Invoice("22776","brakes",3,300);
	paymeObjects[1] = new Invoice("33442","gear",5,90.99);
	paymeObjects[2] = new SalariedProgrammer("Chioma","Chidimma", "345-67-0001",320.00);
	paymeObjects[3] = new HourlyProgrammer("Amara","Chukwu", "234-56-7770",18.95,40.00);
	paymeObjects[4] = new CommissionProgrammer("Peter","Goodman", "123-45-6999",16500.00,0.44);
	paymeObjects[5] = new BasePlusCommissionProgrammer("Wai Wai","Chan", "123-88-6999",1200.00,0.04, 720.00);


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 /**
  * Loop through the paymeObjects array to ask each paymeObjects its current time and clock name.
  */
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to BasePlusCommissioProgrammer reference
    	BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf("new base salary with 10%% increase is: $%,.2f\n",programmer.getBaseSalary());
    } 

    System.out.printf("%s: $%,.2f%n", "payment due",currentPayme.getPaymentAmount());
    System.out.printf("%s: $%,.2f%n%n", "income tax",currentPayme.display());

 }
}
}


