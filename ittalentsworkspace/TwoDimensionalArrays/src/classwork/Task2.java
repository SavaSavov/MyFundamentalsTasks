package classwork;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter size of the array: ");
		size = input.nextInt();
		
		int[] arr = new int[size];
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter " + (index +1) + " element of the array:");
			arr[index] = input.nextInt();
		}
		
		boolean isJagged = true;
		
		for (int index = 1; index < arr.length - 1; index++) {
			if (!(arr[index] > arr[index - 1] && arr[index] > arr[index + 1] || arr[index] < arr[index - 1] && arr[index] < arr[index + 1])) {
				isJagged = false;
				break;
			} 
		}
		
		if(isJagged){
			System.out.println("The array is jagged.");
		}else{
			System.out.println("The array isn't jagged.");
		}
		
		input.close();
	}

}
