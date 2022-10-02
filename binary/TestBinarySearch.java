package binary;

import java.util.Scanner;

public class TestBinarySearch {

	public static void main(String args[]) {

		BinarySearch b = new BinarySearch();

		int[] array = { 3, 4, 5, 6, 7, 8, 9 };
		int n = array.length;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter element to be searched:");

		int element = input.nextInt();
		input.close();

		int result = b.binarySearch(array, element, 0, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);
	}

}
