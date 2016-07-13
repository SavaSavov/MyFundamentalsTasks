package homework;

import java.util.Scanner;

public class Exercise8 {

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
		
		int count = 1;
		int maxOccurrences = 0;
		int element = 0;
		int secElement = 0;
		int secElMaxOcc = 0;
		
		if (arr.length > 1) {

			for (int index = 0; index < arr.length - 1; index++) {

				if (arr[index] == arr[index + 1]) {
					count++;
				} else {
					count = 1;
				}
				if (maxOccurrences < count) {
					maxOccurrences = count;
					element = arr[index];
				}else{
					if(maxOccurrences == count){
						secElMaxOcc = count;
						secElement = element;
						element = arr[index];
					}
				}
			}
			
			if (secElMaxOcc == maxOccurrences) {
				System.out.println("There are two elements with " + maxOccurrences + " occurrences: ");
				System.out.println();
				for (int index = 0; index < maxOccurrences; index++) {
					System.out.print(element + " ");
				}
				
				System.out.println();
				for (int index = 0; index < maxOccurrences; index++) {
					System.out.print(secElement + " ");
				}
			} else {
				System.out.println("The element with " + maxOccurrences + " occurrences is: ");
				System.out.println();
				for (int index = 0; index < maxOccurrences; index++) {
					System.out.print(element + " ");
				}
			}
			
		} else {
			System.out.println("Array must have more than 1 element.");
		}

		input.close();

	}

}
