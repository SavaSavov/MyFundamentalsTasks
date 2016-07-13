package homework;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size for the array: ");
		int size = input.nextInt();

		int[] arr = new int[size];
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter "+ (index + 1) +" element: ");
			arr[index] = input.nextInt();
		}
		
		System.out.println("Elements of the array that you've entered are: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
		
		//using new array
		
		int[] reverseArr = new int[size];
		
		for (int index = 0; index < reverseArr.length; index++) {
			reverseArr[index] = arr[arr.length - index - 1];
		}
		
		System.out.println("Elements of the reversed array are: ");
		for (int index = 0; index < reverseArr.length; index++) {
			System.out.print(reverseArr[index] + " ");
		}
		
		//without new array
		
		System.out.println();
		
		System.out.println("Elements of the array backwards without new array are: ");
		for (int index = arr.length - 1; index >= 0; index--) {
			System.out.print(arr[index] + " ");
		}
		
		input.close();

	}

}
