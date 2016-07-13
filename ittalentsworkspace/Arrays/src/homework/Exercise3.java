package homework;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int size = 10;
		int[] arr = new int[size];
		
		for (int index = 0; index < arr.length; index++) {
			if (index < 2) {
				arr[index] = number;
			} else {
				arr[index] = (arr[index - 1] + arr[index - 2]);
			}
		}
		
		System.out.println("The array is: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		input.close();

	}

}
