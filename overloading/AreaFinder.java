package overloading;

public class AreaFinder {

	void calcArea(int side) {
		System.out.println("Area of Square= " + side * side);
	}

	void calcArea(int base, int height) {
		System.out.println("Area of Triangle= " + base * height * 0.5f);
	}

	void calcArea(float radius) {
		System.out.println("Area of Circle= " + 3.14f * radius * radius);
	}

}
