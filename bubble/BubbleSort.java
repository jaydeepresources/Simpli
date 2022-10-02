package bubble;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 2, 13, 30, 99, 9 };

		int size = array.length;

		for (int i = 0; i < size - 1; i++)

			for (int j = 0; j < size - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		System.out.println("Sorted Array in Ascending Order:");

		for (int i : array)
			System.out.print(i + " ");

	}
}
