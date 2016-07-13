package homework;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		int size = 7;
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
		
		int count = 0;
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] % 5 == 0 && arr[index] > 5){
				count++;
				System.out.print(arr[index] + " ");
			}
		}
		
		if (count > 0) {
			if (count != 1) {
				System.out.println(count + " numbers could be divided by and are greater than 5.");
			} else {
				System.out.println(" - is the only number that could be divided by and is greater than 5.");
			}
		} else {
			System.out.println("\nThere aren't numbers that could be divided by and are greater by 5.");
		}
		
		input.close();

	}

}
