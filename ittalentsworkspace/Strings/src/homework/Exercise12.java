package homework;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int number;
		
		do {
			
			System.out.println("Input number to create array from it:");
			number = input.nextInt();
			
		} while (validateInput(number));
		
		int[] arr = createArray(number);
		
		printArr(arr);

		input.close();
		
	}
	
	static int[] createArray(int num){
		int[] arrX = new int[num];
		
		for (int index = 0; index < arrX.length; index++) {
			arrX[index] = (index + 1);
		}
		
		return arrX;
	}
	
	static void printArr(int[] arrX){
		
		for (int index = 0; index < arrX.length; index++) {
			if (index != arrX.length - 1) {
				System.out.print(arrX[index] + ", ");
			} else {
				System.out.print(arrX[index]);
			}
		}
	}
	
	static boolean validateInput(int num){
		
		if(num < 0){
			System.out.println("Incorrect input!!! Size of the array has to be positive.");
			return true;
		}else{
			return false;
		}
	}

}
