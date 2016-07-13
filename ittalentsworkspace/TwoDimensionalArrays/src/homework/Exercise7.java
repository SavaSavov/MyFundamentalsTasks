package homework;

public class Exercise7 {

	public static void main(String[] args) {
		

		int[][] matrix =  { { 11, 12, 13, 14, 15, 16 },
				{ 21, 22, 23, 24, 25, 26 }, 
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, 
				{ 51, 52, 53, 54, 55, 56 }, 
				{ 61, 62, 63, 64, 65, 66 } };

		int count = 0;
		int sumOfCurrRow = 0;
		int sumOfAllRows = 0;

		for (int index = 0; index < (matrix.length * matrix.length); index++) {
			
			int row = index / matrix.length;
			int col = index % matrix.length;
			
			if (count % matrix.length == 0) {
				System.out.println("\nElements on the " + ((index / 6) +1) + " row that fulfil requirement are: " );
			}
			
			if ((row + col) % 2 == 0) {
				System.out.print(matrix[row][col] + " ");
				sumOfCurrRow += matrix[row][col];
			}

			count++;

			if (count % matrix.length == 0) {
				sumOfAllRows += sumOfCurrRow;
				System.out.print("\nSum of them is: " + sumOfCurrRow);
				sumOfCurrRow = 0;
				System.out.println();
			}

		}

		System.out.println("\nThe sum of all elements that sum of their row and column is even number is: " + sumOfAllRows);

	}

}
