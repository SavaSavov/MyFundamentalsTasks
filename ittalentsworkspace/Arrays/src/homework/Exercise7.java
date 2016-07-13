package homework;

import java.util.Scanner;

public class Exercise7 {

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
		
		int[] resultArr = new int[size];
		
		for (int index = 0; index < resultArr.length; index++) {
			if(index == 0 || index == (resultArr.length-1)){
				resultArr[index] = arr[index];
			}else{
				resultArr[index] = (arr[index-1] + arr[index+1]);
			}
		}
		
		System.out.println("Elements of the result array that are: ");
		for (int index = 0; index < resultArr.length; index++) {
			System.out.print(resultArr[index] + " ");
		}
		input.close();
	}

}
