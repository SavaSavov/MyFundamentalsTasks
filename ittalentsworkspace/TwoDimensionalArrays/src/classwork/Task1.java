package classwork;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int rowSize;
		int columnSize;
		
		System.out.println("Enter number of rows:");
		rowSize = input.nextInt();
		
		System.out.println("Enter number of columns:");
		columnSize = input.nextInt();
		
		int[][] arr = new int[rowSize][columnSize];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("Enter element for " + row + " row and " + col  + " column:");
				arr[row][col] = input.nextInt();
			}
		}
		
		boolean arePositive = true;
		
		for (int row = 0; row < rowSize; row++) {
			for (int col = 0; col < columnSize; col++) {
				if(arr[row][col] < 0){
					arePositive = false;
					break;
				}
			}
		}
		
		if(arePositive){
			System.out.println("All elements of the array are nonnegative.");
		}else{
			System.out.println("There are elements in the array that are negative.");
		}
		
		input.close();

	}

}
