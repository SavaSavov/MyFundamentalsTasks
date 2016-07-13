package homework;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		int smallestNum = Integer.MAX_VALUE;
		boolean couldBeDiv = false;
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter "+ (index + 1) +" element: ");
			arr[index] = input.nextInt();
		}
		
		System.out.println("The array that you've entered is: ");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		System.out.println();
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] < smallestNum && arr[index] % 3 == 0){
				smallestNum = arr[index];
				couldBeDiv = true;
			}
		}
		
		if(couldBeDiv){
			System.out.println("The smallest element that could be divided by 3 is: " + smallestNum);
		}else{
			System.out.println("There isn't numbers that could be divided by 3!");
		}
		
		input.close();

	}

}
