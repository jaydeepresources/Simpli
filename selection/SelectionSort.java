package selection;

public class SelectionSort {

	public static void main(String args[]) {
		int[] array = { 2, 13, 30, 99, 9 };

		int size = array.length;

		for (int step = 0; step < size - 1; step++) {
			int min_idx = step;

			for (int i = step + 1; i < size; i++) {

				if (array[i] < array[min_idx]) {
					min_idx = i;
				}
			}

			int temp = array[step];
			array[step] = array[min_idx];
			array[min_idx] = temp;

		}
		System.out.println("Sorted Array in Ascending Order: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
