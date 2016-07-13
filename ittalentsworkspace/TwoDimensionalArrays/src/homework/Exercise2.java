package homework;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter the size of the matrix: ");
		size = input.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Enter el on row " + row + " and colomn " + col);
				matrix[row][col] = input.nextInt();
			}
		}
		
		System.out.println("The matrix is:\n");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nThe elements on the main diagonal are:\n");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if(row == col){
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
		
		System.out.println("\nThe elements on the secondary diagonal are:\n");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if(row + col == (matrix.length - 1)){
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
		
		input.close();

	}

}
