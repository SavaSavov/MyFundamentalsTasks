package homework;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int rowSize = 6;
		int colSize = 5;
		
		int[][] arr = new int[rowSize][colSize];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = rand.nextInt(100);
			}
		}
		
		System.out.println("The two dimensional array looks like this:\n");
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		int minEl = Integer.MAX_VALUE;
		int maxEl = Integer.MIN_VALUE;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] < minEl){
					minEl = arr[row][col];
				}
			}
		}
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] > maxEl){
					maxEl = arr[row][col];
				}
			}
		}
		
		System.out.println("\nThe smallest element in the array is: " + minEl);
		System.out.println("\nThe greatest element in the array is: " + maxEl);
		
	}

}
