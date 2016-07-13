package homework;

public class Exercise4 {

	public static void main(String[] args) {
		

		int[][] arr = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}, 
						{13,14,15,16} };
		
		System.out.println("First array looks like this:\n");
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("After reversing to 90 degrees array looks like this:\n");
		
		for (int col = 0; col < arr.length; col++) {
			for (int row = arr[col].length - 1 ; row >= 0; row--) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

}
