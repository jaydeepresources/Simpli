package array;

public class ArrayReversal {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] revArr = { 0, 0, 0, 0, 0 };
		System.out.println("Array before reversal");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Array after reversal");

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			revArr[j] = arr[i];
			System.out.println(revArr[j]);
		}
	}

}
