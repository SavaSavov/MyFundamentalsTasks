package additionaltasks;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {


		Random rand = new Random();

		int size = 4;
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = rand.nextInt(100);
			}
		}
		
		System.out.println("The matrix is:\n");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nThe matrix after reversing to 90 degrees is:\n");

		for (int col = 0; col < matrix.length; col++) {
			for (int row = (matrix[col].length - 1); row >= 0 ; row--) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}		

	}

}
