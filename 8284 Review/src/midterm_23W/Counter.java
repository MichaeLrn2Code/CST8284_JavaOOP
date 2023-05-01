package midterm_23W;

public class Counter {

	public int count = 0;
	public int getCount()
	{
	return count;
	}
	public void increment()
	{
	count++;
	}
	
	public static void main(String[] args) {
		Counter num1 = new Counter();
		Counter num2 = new Counter();
		
		System.out.println(num1.equals(num2));
		
		System.out.println(num2.equals(num1));
	}

}
