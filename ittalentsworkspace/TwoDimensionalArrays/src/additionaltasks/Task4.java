package additionaltasks;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		

		Random rand = new Random();
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter size of the rows in range [3...10]:");
		int n = input.nextInt();
		
		while(n < 3 || n > 10){
			System.out.println("Invalid input! The size of the rows has to be in range [3...10]:");
			System.out.println("Enter size for the rows again:");
			n = input.nextInt();
		}
		
		System.out.println("Enter size of the columns in range [3...10]:");
		int k = input.nextInt();
		
		while(k < 3 || k > 10){
			System.out.println("Invalid input! The size of the columns has to be in range [3...10]:");
			System.out.println("Enter size for the columns again:");
			k = input.nextInt();
		}
		
		int[][] arr = new int[n][k];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = rand.nextInt(30) + 1;
			}
		}
		
		System.out.println("The two dimensional array is:\n");

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		int size = (n > k) ? n : k;

		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				matrix[row][col] = arr[row][col];
			}
		}
		
		System.out.println("\nThe result matrix is:\n");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}

}
