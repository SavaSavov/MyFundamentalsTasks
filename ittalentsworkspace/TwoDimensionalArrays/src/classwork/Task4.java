package classwork;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		int count = 0;
		
		System.out.println("Fill the array with 0 and 1");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter " + (index+1) + " element:");
			arr[index] = input.nextInt();
		}
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] == 0){
				count++;
			}
		}
		
		for (int index = 0; index < arr.length; index++) {
			if(index < count){
				arr[index] = 0;
			}else{
				arr[index] = 1;
			}
		}
		
		System.out.println("The sorted arr is:\n");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		input.close();

	}

}
