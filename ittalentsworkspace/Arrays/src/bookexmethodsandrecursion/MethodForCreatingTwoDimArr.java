package bookexmethodsandrecursion;

import java.util.Scanner;

public class MethodForCreatingTwoDimArr {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Enter number for the rows: ");
		x = input.nextInt();
		
		System.out.println("Enter number for the columns: ");
		y = input.nextInt();
		
		int[][] arr = createArr(x, y);
		
		System.out.println("The two dimensional array with values set to 0 is:\n");
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		input.close();

	}
	
	public static int[][] createArr(int x, int y){
		
		int[][] arr = new int[x][y];
		
		return arr;
	}

}
