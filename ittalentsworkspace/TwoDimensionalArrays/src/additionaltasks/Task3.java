package additionaltasks;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		

		Random rand = new Random();

		int size = 4;
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = rand.nextInt(100);
			}
		}
		
		System.out.println("The matrix is:\n");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		int bestRowSum = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			int currRowSum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				currRowSum += matrix[row][col];
				
				if(currRowSum > bestRowSum){
					bestRowSum = currRowSum;
				}
			}
		}
		
		System.out.println("\nThe highest sum by rows is: " + bestRowSum);
		
		int bestColSum = 0;
		
		for (int col = 0; col < matrix.length; col++) {
			int currColSum = 0;
			for (int row = 0; row < matrix[col].length; row++) {
				currColSum += matrix[row][col];
				
				if(currColSum > bestColSum){
					bestColSum = currColSum;
				}
			}
		}
		
		System.out.println("\nThe highest sum by columns is: " + bestColSum);
		
		if(bestRowSum > bestColSum){
			System.out.println("\nThe best sum of rows is > from best sum of columns.");
		}else{
			if(bestRowSum == bestColSum){
				System.out.println("\nThe best sum of rows is = to best sum of columns.");
			}else{
				System.out.println("\nThe best sum of columns is > from best sum of rows.");
			}
		}

	}

}
