package linear;

public class LinearSearch {
	
	public int linearSearch(int array[], int x) {
		int n = array.length;

		for (int i = 0; i < n; i++) {
			if (array[i] == x)
				return i;
		}
		return -1;
	}

	
}