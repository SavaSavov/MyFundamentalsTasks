package homework;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int rowSize;
		int colSize;
		
		System.out.println("Enter size for the rows:");
		rowSize = input.nextInt();
		
		System.out.println("Enter size for the columns:");
		colSize = input.nextInt();
		
		int[][] twoDimArray = new int[rowSize][colSize];
		
		for (int row = 0; row < twoDimArray.length; row++) {
			for (int col = 0; col < twoDimArray[row].length; col++) {
				twoDimArray[row][col] = rand.nextInt(100);
			}
		}
		
		System.out.println("The elements of the array are:\n");
		
		for (int row = 0; row < twoDimArray.length; row++) {
			for (int col = 0; col < twoDimArray[row].length; col++) {
				System.out.print(twoDimArray[row][col] + " ");
			}
			System.out.println();
		}
		
		int sum = 0;
		int numberOfElements = rowSize * colSize;
		
		for (int row = 0; row < twoDimArray.length; row++) {
			for (int col = 0; col < twoDimArray[row].length; col++) {
				sum += twoDimArray[row][col];
			}
		}
		
		double average = (double) sum / numberOfElements;
		
		System.out.println("\nThe sum of the elements is: " + sum);
		
		System.out.println("\nThe average for the array is: " + average);
		
		input.close();

	}
}
