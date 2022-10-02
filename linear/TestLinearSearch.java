package linear;

public class TestLinearSearch {

	public static void main(String args[]) {

		LinearSearch ls = new LinearSearch();

		int array[] = { 2, 4, 0, 1, 9 };
		int x = 1;

		int result = ls.linearSearch(array, x);

		if (result == -1)
			System.out.print("Element not found");
		else
			System.out.print("Element found at index: " + result);
	}

}
