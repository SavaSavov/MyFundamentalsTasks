package homework;

import java.util.Scanner;

public class Exercise13 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int size;
		
		do {
			
			System.out.println("Enter size of the first arr:");
			size = input.nextInt();
			
		} while (validateSize(size));
		
		int[] arrA = fillArr(size);
		
		System.out.println("First array that you've entered is:");
		printArr(arrA);
		
		do {

			System.out.println("\n\nEnter size of the second arr:");
			size = input.nextInt();

		} while (validateSize(size));
		
		
		int[] arrB = fillArr(size);
		
		System.out.println("\nSecond array that you've entered is:");
		printArr(arrB);
		
		
		int[] resultArr = createResultArr(arrA, arrB);
		
		System.out.println("\n\nThe result array is:");	
		printArr(resultArr);
		

	}
	
	static int[] fillArr(int num){
		
		int[] arr = new int[num];
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter " + (index + 1) + " number:");
			arr[index] = input.nextInt();
		}
		
		return arr;
	}
	
	static int[] createResultArr(int[] arrA, int[] arrB){
		
		int size = arrA.length + arrB.length;
		
		int[] resultArr = new int[size];
		
		int indexA = 0;
		
		for (indexA = 0; indexA < arrA.length; indexA++) {
			resultArr[indexA] = arrA[indexA];
		}
		
		for (int indexB = 0; indexB < arrB.length; indexB++) {
			resultArr[indexA++] = arrB[indexB];
		}
		
		return resultArr;

	}
	
	static void printArr(int[] arr){
		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}
	
	static boolean validateSize(int num){
		
		if(num < 0){
			System.out.println("Incorrect input!!! Size of the array has to be positive.");
			return true;
		}else{
			return false;
		}
	}

}
