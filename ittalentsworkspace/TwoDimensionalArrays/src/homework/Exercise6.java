package homework;

public class Exercise6 {

	public static void main(String[] args) {
	

		int[][] matrix =  { { 11, 12, 13, 14, 15, 16 },
							{ 21, 22, 23, 24, 25, 26 }, 
							{ 31, 32, 33, 34, 35, 36 },
							{ 41, 42, 43, 44, 45, 46 }, 
							{ 51, 52, 53, 54, 55, 56 }, 
							{ 61, 62, 63, 64, 65, 66 } };
		
		int sumOfAllEvenRows = 0;
		int sumOfCurrRow = 0;
		
		for (int row = 1; row < matrix.length; row += 2) {
			for (int col = 0; col < matrix[row].length; col++) {
				sumOfCurrRow += matrix[row][col];
			}
			System.out.println("Sum of the elements on " + (row + 1) + " row is: " + sumOfCurrRow + "\n");
			sumOfAllEvenRows += sumOfCurrRow;
			sumOfCurrRow = 0;
		}
		
		System.out.println("Sum of the elements on all even rows is: " + sumOfAllEvenRows);

	}

}
