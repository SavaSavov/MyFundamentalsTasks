package homework;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number to represent it in binary format: ");
		number = input.nextInt();
		
		int count = 0;
		int temp = number;
		
		while(temp != 0){
			temp = temp / 2;
			count++;
		}
		
		int[] arr = new int[count];
		
		for (int index = arr.length - 1; index >= 0; index--) {
			temp =  number % 2;
			arr[index] = temp;
			number = number/2;
		}
		
		System.out.println("The binary representation of the number you've entered is: ");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		input.close();

	}

}
