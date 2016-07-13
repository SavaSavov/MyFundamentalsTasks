package homework;

import java.util.Scanner;

public class Exercise10 {

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
		
		double sumOfEls = 0;
		
		for (int index = 0; index < arr.length; index++) {
			sumOfEls += arr[index];
		}
		
		double average = sumOfEls/(arr.length);
		
		double[] substrArr = new double[arr.length];
		
		for (int index = 0; index < substrArr.length; index++) {
			
			double substrTemp = arr[index] - average;

			double absValue = substrTemp < 0 ? (-(substrTemp)) : substrTemp;
			
			substrArr[index] = absValue;
		}
		
		int newIndex = 0;
		double minValue = Double.MAX_VALUE;
		
		for (int index = 0; index < substrArr.length; index++) {
			if(substrArr[index] < minValue){
				minValue = substrArr[index];
				newIndex = index;
			}
		}
		
		System.out.println("The closest value is: " + arr[newIndex]);
			
		input.close();
	}

}
