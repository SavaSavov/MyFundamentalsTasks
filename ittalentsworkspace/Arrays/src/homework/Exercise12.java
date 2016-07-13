package homework;

public class Exercise12 {

	public static void main(String[] args) {
		

		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("First array looks like this:");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		System.out.println();
		
//		replacing values of els on index 0 and 1 using temporary variable
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

//		replacing values of els on index 2 and 3 using addition
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		
//		replacing values of els on index 4 and 5 using multiplication
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		
		System.out.println("\nAfter swapping the values array looks like this:");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}

	}

}
