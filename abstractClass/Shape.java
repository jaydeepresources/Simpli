package abstractClass;

public abstract class Shape {

	float area;

	protected abstract void findArea();

	public void print() {
		System.out.println("Area=" + area);
	}

}