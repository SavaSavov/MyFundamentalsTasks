package additionaltasks;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter size of the matrix:");
		size = input.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Enter element in range [1...20] for " + row + " row and " + col + " column:");
				matrix[row][col] = input.nextInt();
				
				while(matrix[row][col] < 1 || matrix[row][col] > 20){
					System.out.println("Invalid input! The elements has to be in range [1...20]:");
					System.out.println("Enter element again:");
					matrix[row][col] = input.nextInt();
				}
			}
		}
		
		System.out.println("\nThe matrix that you've entered is:\n");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

		int currSum = 0;
		int sum = 0;
		boolean isMagic = true;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				currSum += matrix[row][col];
			}

			if (sum == 0) {
				sum = currSum;
			}

			if (sum != currSum) {
				isMagic = false;
				break;
			} else {
				currSum = 0;
			}
		}

		currSum = 0;

		if (isMagic) {

			for (int col = 0; col < matrix.length; col++) {
				for (int row = 0; row < matrix[col].length; row++) {
					currSum += matrix[row][col];
				}

				if (sum != currSum) {
					isMagic = false;
					break;
				} else {
					currSum = 0;
				}
			}
		}

		currSum = 0;

		if (isMagic) {

			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					if (row == col) {
						currSum += matrix[row][col];
					}
				}
			}
			
			if (sum != currSum) {
				isMagic = false;
			}
		}

		currSum = 0;

		if (isMagic) {

			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					if ((row + col) == (matrix.length - 1)) {
						currSum += matrix[row][col];
					}
				}
			}
			
			if (sum != currSum) {
				isMagic = false;
			}
		}

		if (isMagic) {
			System.out.println("\nThe matrix forms magic square.");
		} else {
			System.out.println("\nThe matrix doesn't form magic square.");
		}
		
		input.close();

	}

}
