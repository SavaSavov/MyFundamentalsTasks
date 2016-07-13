package classwork;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter the size of the matrix:");
		
		size = input.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Enter element for " + row + " row and " + col + "col");
				matrix[row][col] = input.nextInt();
			}
		}
		
		System.out.println("The matrix that you've entered is:\n");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		int currRowSum = 0;
		int bestRowSum = Integer.MIN_VALUE;
		int bestRow = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				
				currRowSum += matrix[row][col];
				
				if(currRowSum > bestRowSum){
					bestRowSum = currRowSum;
					bestRow = row;
				}
			}
			currRowSum = 0;
		}
		
		System.out.println("The row with the biggest sum is: " + bestRow + " with sum of it's els " + bestRowSum);
		input.close();

	}

}
