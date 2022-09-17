package overloading;

public class TestOverloading {

	public static void main(String[] args) {
		
		AreaFinder a = new AreaFinder();
		
		a.calcArea(12);
		a.calcArea(10,5);
		a.calcArea(12.5f);
		
	}

}