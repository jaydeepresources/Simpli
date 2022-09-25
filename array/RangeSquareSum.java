package array;

import java.util.Scanner;

public class RangeSquareSum {

	public static void main(String[] args) {

		int[] arr = { 22, 3, 5, 2, 41 };
		int min = 0;
		int max = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the min and max range");
		min = s.nextInt();
		max = s.nextInt();

		int[] resArr = new int[max - min + 1];

		for (int i = 0; i < resArr.length; i++)
			resArr[i] = 0;

		System.out.println("Finding sum of squares of array elements in the range");

		int sum = 0;

		for (int i = min, j = 0; i <= max; i++, j++) {
			resArr[j] = arr[i] * arr[i];
			System.out.println(resArr[j]);
			sum += resArr[j];
		}

		System.out.println("Sum=" + sum);

	}

}
