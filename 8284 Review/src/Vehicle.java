
public abstract class Vehicle {
	private String name;

	public void show() {
		System.out.println("Vehicle show");
	}

	public abstract void start();

	public abstract void stop();
}
