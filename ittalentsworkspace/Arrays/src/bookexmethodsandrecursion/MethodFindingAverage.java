package bookexmethodsandrecursion;

import java.util.Scanner;

public class MethodFindingAverage {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		
		System.out.println("Enter first number: ");
		firstNum = input.nextInt();

		System.out.println("Enter second number: ");
		secondNum = input.nextInt();
		
		double average = findAvg(firstNum, secondNum);
		
		System.out.println("The average of the entered numbers is: " + average);
		
		input.close();
		
	}
	
	public static double findAvg(int x, int y) {

		double avg = (double) (x + y) / 2;
		
		return avg;
	}

}
