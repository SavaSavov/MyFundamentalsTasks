package classwork;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size for the array:");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter " + (index + 1) + " element:");
			arr[index] = input.nextInt();
		}
		
		System.out.println("\nThe array that you've entered is:");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		int count = 0;
		int mostPopular = 0;
		
		for (int indexI = 0; indexI < (arr.length - 1); indexI++) {
			int currCount = 1;
			for (int indexJ = indexI + 1; indexJ < arr.length; indexJ++) {
				if(arr[indexI] == arr[indexJ]){
					currCount++;
				}
				if(currCount > count){
					count = currCount;
					mostPopular = arr[indexI];
				}
			}
		}
		
		System.out.println("\nThe most popular element in the array is: "+ mostPopular + " ---> " + count + " times.");
		
		input.close();

	}

}
