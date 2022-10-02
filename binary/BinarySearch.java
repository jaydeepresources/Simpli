package binary;

public class BinarySearch {

	int binarySearch(int array[], int element, int low, int high) {

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (array[mid] == element)
				return mid;

			if (array[mid] < element)
				low = mid + 1;

			else
				high = mid - 1;
		}

		return -1;
	}

}
