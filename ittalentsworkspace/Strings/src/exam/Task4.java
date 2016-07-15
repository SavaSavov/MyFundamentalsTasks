package exam;

public class Task4 {

	public static void main(String[] args) {
		

		char[][] matrix = { {'W', ' ', 'W', 'W', 'W', ' '},
							{'W', ' ', 'W', ' ', 'W', ' '},
							{'W', ' ', 'W', ' ', ' ', 'W'},
							{'W', 'W', 'W', ' ', 'W', 'W'},
							{'W', ' ', 'W', ' ', 'W', 'W'},
							{'W', ' ', 'W', 'W', 'W', 'W'}
				
															};
		
		fill(matrix, 2, 3, 0);
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}

	}
	
	static void fill(char[][] arr, int row, int col, int count) {

		if ((((row == 0) && (row + col < arr.length)) || ((col == 0) && (row + col < arr.length))
				|| ((row == arr.length - 1) && (row + col > arr.length))
				|| ((col == arr.length - 1) && (row + col > arr.length))) && (arr[row][col] == ' ')) {

			System.out.println(count);
			return;

		}else{
			count = -1;
			System.out.println(count);
		}

			if (arr[row][col] == ' ') {
				arr[row][col] = 'W';
				count++;

			
			}
			
			fill(arr, row + 1, col, count);
			fill(arr, row - 1, col, count);
			fill(arr, row, col + 1, count);
			fill(arr, row, col - 1, count);

	}

}
