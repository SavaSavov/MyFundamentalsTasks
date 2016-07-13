package classwork;

import java.util.Random;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int size;
		
		System.out.println("Enter size for the matrix:");
		size = input.nextInt();
		
		int[][] matrix =  new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = rand.nextInt(50);
			}
		}
		
		System.out.println("The matrix is:\n");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		int sum = 0;
		
		for (int row = 1; row < matrix.length; row++) {
			for (int col = 0; col < row; col++) {
				sum += matrix[row][col];
			}
		}
		
		System.out.println("The sum of the elements under main diagonal is: " + sum);
		
		input.close();

	}

}
