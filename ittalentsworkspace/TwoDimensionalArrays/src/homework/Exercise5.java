package homework;

public class Exercise5 {

	public static void main(String[] args) {
		

		int[][] arr = { {1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}, 
				{13,14,15,16} };
		
		int bestSumOfRows = Integer.MIN_VALUE;
		int currSum = 0;
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				
				currSum += arr[row][col];
				
				if(currSum > bestSumOfRows){
					bestSumOfRows = currSum;
				}
			}
			currSum = 0;
		}
		
		int bestSumOfCols = Integer.MIN_VALUE;
		currSum = 0;
		
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr[col].length; row++) {
				
				currSum += arr[row][col];
				
				if(currSum > bestSumOfCols){
					bestSumOfCols = currSum;
				}
			}
			currSum = 0;
		}
		
		System.out.println("The best sum of rows is: " + bestSumOfRows);

		System.out.println("\nThe best sum of columns is: " + bestSumOfCols);

		if (bestSumOfRows > bestSumOfCols) {
			System.out.println("\nThe best sum of rows is > from best sum of columns.");
		} else {			
			if (bestSumOfRows < bestSumOfCols) {
				System.out.println("\nThe best sum of columns is > from best sum of rows.");
			} else {
				System.out.println("\nThe best sum of rows is = to best sum of columns.");
			}
		}

	}

}
