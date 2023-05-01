package midterm_23W;
import static java.lang.Math.*;

public class Checker {
	
	public static int count =0;
	public int number = 0;

	public Checker()
	{
	count++;
	number = count;
	}
	
	public int getCount() { return count; }
	public int getNumber() { return number; }
	
	public static void main(String[] args) {
		Checker one = new Checker();
		Checker two = new Checker();
		System.out.println(one.getCount() + " " + two.getCount());
		System.out.println(one.getNumber() + " " + two.getNumber());
	}
	double degrees;
	double result = Math.tan(Math.toRadians(degrees));
	

}
