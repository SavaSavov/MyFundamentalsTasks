package homework;

import java.util.Scanner;

public class Exercise17 {

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
		
		boolean isZigzag = true;

		for (int index = 1; index < arr.length - 1; index += 2) {
			if (!(arr[index] > arr[index - 1] && arr[index] > arr[index + 1])) {
				isZigzag = false;
				break;
			}
		}
		
		if(isZigzag){
			System.out.println("The series of numbers fulfil the requirement for zigzag up row.");
		}else{
			System.out.println("The series of numbers don't fulfil the requirement for zigzag up row.");
		}
		
		input.close();

	}

}
