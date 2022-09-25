package array;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int matrix[][] = new int[3][3];

		System.out.println("Enter data for matrix row wise");

		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 3; j++) 
				matrix[i][j] = s.nextInt();
			
		

		System.out.println("Printing Matrix");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
