package classwork;

public class Task9 {

	public static void main(String[] args) {


		int[][] matrix = { {45, 78, -56, 24, 23},
							{13, -67, -12, 45, 15},
							{10, 7, -12, 4, 8},
							{124, 3, -5, 9,34},
							{1, -7, 6, 14, 98} };
		
		int bestSum = Integer.MIN_VALUE;
		
		for (int row = 0; row < (matrix.length - 1); row++) {
			for (int col = 0; col < (matrix[row].length - 1); col++) {
				int currSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col +1];
				
				if(currSum > bestSum){
					bestSum = currSum;
				}
			}
		}
		
		System.out.println("The maximal sum is: " + bestSum);

	}

}
