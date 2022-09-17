package inheritance;

public class Vehicle {

	protected String color;
	protected String name;
	protected float speed;

	public Vehicle() {
		System.out.println("Vehicle");
	}

	protected void print() {
		System.out.println("Print from Vehicle");
	}

}
