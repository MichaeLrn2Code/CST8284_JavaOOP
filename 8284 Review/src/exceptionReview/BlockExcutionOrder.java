package exceptionReview;

public class BlockExcutionOrder {

	public static void main(String[] args) {
		try {
		    double x = 0.0 / 0.0;
		    System.out.println(x);
		} catch (ArithmeticException e) {
		    System.out.println("Exception caught!");}
//		} finally {
////			int x = 12/3;
//		    System.out.println("Finally block executed!"+x);
//		}
	}

}
