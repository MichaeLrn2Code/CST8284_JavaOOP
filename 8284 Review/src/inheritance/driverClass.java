package inheritance;

public class driverClass {

	public static void main(String[] args) {
		Programmer h1 = new HourlyProgrammer();
		int result = h1.increaseSalary(3000);
		
		System.out.println(result);

	}

}
