package bookexercises;

import java.util.Scanner;

public class FindingSumOfEls {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int size = 10;
		
		float[] arr = new float[size];
		float sum = 0.0F;
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter " + (index + 1) + " element:");
			arr[index] = input.nextFloat();
		}
		
		for (int index = 0; index < arr.length; index++) {
			sum += arr[index];					
		}
		
		System.out.println("The sum of the elements is " + sum);
		
		input.close();
	}

}
