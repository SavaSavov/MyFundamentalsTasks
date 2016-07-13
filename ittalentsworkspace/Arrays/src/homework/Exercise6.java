package homework;

import java.util.Scanner;

public class Exercise6 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size for the first array: ");
		int size = input.nextInt();

		int[] arrA = new int[size];

		System.out.println("Enter the size for the second array: ");
		size = input.nextInt();

		int[] arrB = new int[size];

		if (arrA.length == arrB.length) {

			System.out.println("Enter els for the first arr: ");
			fillArr(arrA);

			System.out.println("Elements of the first array that you've entered are: ");

			printArr(arrA);

			System.out.println("Enter els for the second arr: ");
			fillArr(arrB);

			System.out.println("Elements of the second array that you've entered are: ");

			printArr(arrB);

			boolean checkArr = checkEquality(arrA, arrB);

			if (checkArr) {
				System.out.println("The arrays are equal.");
			} else {
				System.out.println("The arrays aren't equal.");
			}
		} else {
			System.out.println("The arrays aren't equal.");
		}

	}

	private static void printArr(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
	}

	private static void fillArr(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter "+ (index + 1) +" element: ");
			arr[index] = input.nextInt();
		}
	}

	private static boolean checkEquality(int[] arrA, int[] arrB) {

		boolean areEqual = true;

		for (int index = 0; index < arrA.length; index++) {
			if (arrA[index] != arrB[index]) {
				areEqual = false;
				break;
			}
		}

		return areEqual;
	}

}
