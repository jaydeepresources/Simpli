package inheritance;

public class Car extends Vehicle{

	public Car() {
		super(); // call nearest base class constructor
	
		System.out.println("Car");
	}
	
	public void print() {
		System.out.println("Print from Car");
	}

}
