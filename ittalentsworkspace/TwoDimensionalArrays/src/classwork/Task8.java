package classwork;

public class Task8 {

	public static void main(String[] args) {


		boolean[][] matrix = { {false, false, false, false},
								{false, true, true, false},
								{false, false, false, true},
								{true, true, false, false} };
		
		boolean allElAreFalse = true;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; (row + col) < matrix[row].length - 1; col++) {
				if(matrix[row][col]){
					allElAreFalse = false;
					break;
				}
			}
		}
		
		if(allElAreFalse){
			System.out.println("All elements over the second diagonal are false.");
		}else{
			System.out.println("There is at least one element over the second diagonal that is true.");
		}

	}

}
