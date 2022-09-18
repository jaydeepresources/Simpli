package abstractClass;

public class Circle extends Shape {

	private float radius;

	public Circle() {

	}

	public Circle(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void findArea() {
		area = 3.14f * radius * radius;
	}

	@Override
	public void print() {
		System.out.println("Radius=" + radius);
		super.print();
	}

}
