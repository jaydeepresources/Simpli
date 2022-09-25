package array;

import java.util.Scanner;

public class RangeSumArray {

	public static void main(String[] args) {

		int[] arr = { 22, 12, 54, 3, 41 };
		int min = 0;
		int max = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the min and max range");
		min = s.nextInt();
		max = s.nextInt();

		System.out.println("Finding sum of array elements in the range");

		int sum = 0;
		
		for (int i = min; i <= max; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum=" + sum);

	}

}
