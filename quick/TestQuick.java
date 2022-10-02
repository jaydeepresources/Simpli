package quick;

import java.util.Arrays;

public class TestQuick {

	public static void main(String args[]) {

		int[] data = { 8, 7, 2, 1, 0, 9, 6 };
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(data));

		int size = data.length;

	
		Quicksort.quickSort(data, 0, size - 1);

		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}

}
