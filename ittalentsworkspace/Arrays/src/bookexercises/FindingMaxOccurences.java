package bookexercises;

import java.util.Scanner;

public class FindingMaxOccurences {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of the matrix: ");
		int size = input.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Enter el for " + row + " row and " + col + " col: ");
				matrix[row][col] = input.nextInt();
			}
		}
		
		int mostPopular = matrix[0][0];
		int temp = 0;
		int count = 1;
		int tempCount = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				temp = matrix[row][col];
				tempCount = 0;
				for (int innerRow = 0; innerRow < matrix.length; innerRow++) {
					for (int innerCol = 1; innerCol < matrix.length; innerCol++) {
						if (temp == matrix[innerRow][innerCol]) {
							tempCount++;
						}
						if (tempCount > count) {
							mostPopular = temp;
							count = tempCount;
						}
					}
				}

			}
		}
		
		System.out.println("The element which has the most occurrences " + count + " is ---> " + mostPopular);
		input.close();

	}

}
