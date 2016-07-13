package bookexercises;

import java.util.Random;
import java.util.Scanner;

public class PrintingMatrixDiagonals {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter size for the matrix: ");	
		int size = input.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = rand.nextInt(100);
			}
		}
		
		System.out.println("The elements of the matrix are:");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nElements on the main diagonal are: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (row == col) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
		
		System.out.println("\nElements on the secondary diagonal are: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (row + col == (matrix.length - 1)) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
		
		input.close();

	}

}
