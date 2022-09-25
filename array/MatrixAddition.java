package array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int matrix1[][] = new int[3][3];
		int matrix2[][] = new int[3][3];
		int matrixSum[][] = new int[3][3];

		System.out.println("Enter data for matrix1 row wise");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix1[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Enter data for matrix2 row wise");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix2[i][j] = s.nextInt();
			}
		}

		// Matrix Addition

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("Printing Matrix Addition");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrixSum[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
