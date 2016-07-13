package homework;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		int size = input.nextInt();
		boolean isSymetric = true;
		
		int[] arr = new int[size];
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter "+ (index + 1) +" element: ");
			arr[index] = input.nextInt();
		}
		
		System.out.println("The array that you've entered is: ");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		for (int index = 0; index < ((arr.length / 2)+1); index++) {
			if(arr[index] != arr[(arr.length-index-1)]){
				isSymetric = false;
				break;
			}
		}
		
		if(isSymetric){
			System.out.println("\nThe array is symetric.");
		}else{
			System.out.println("\nThe array isn't symetric.");
		}
		
		input.close();

	}

}
