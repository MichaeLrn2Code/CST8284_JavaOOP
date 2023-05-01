package test;

public class TestSubClass {

	public static void main(String[] args) {

			MySubClass msc = new MySubClass();
			int Y = getX()/2;
			msc.setX(Y);
			
			System.out.println(msc.getX());
	}

}
