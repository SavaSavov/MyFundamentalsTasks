package homework;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size for the array: ");
		int size = input.nextInt();

		double[] arr = new double[size];
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter "+ (index + 1) +" element: ");
			arr[index] = input.nextDouble();
		}
		
		System.out.println("Elements of the array that you've entered are: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
		
		double sum = 0.0;
		double maxSum = Double.MIN_VALUE;
		double[] elsFormingHighestSum = new double[3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					
					double currElI = arr[i];
					double currElJ = arr[j];
					double currElK = arr[k];
					
					sum = (((currElI < 0) ? (currElI*(-1)) : currElI) 
							+ ((currElJ < 0) ? (currElJ*(-1)) : currElJ) 
							+ ((currElK < 0) ? (currElK*(-1)) : currElK));

					if (sum > maxSum) {
						maxSum = sum;
					
						elsFormingHighestSum[0] = currElI;
						elsFormingHighestSum[1] = currElJ;
						elsFormingHighestSum[2] = currElK;
					}
				}
			}
		}
		
		System.out.println("Elements that are forming the highest sum of absolute values are: ");
		for (int index = 0; index < elsFormingHighestSum.length; index++) {
			System.out.print(elsFormingHighestSum[index] + " ");
		}
		
		input.close();

	}

}
