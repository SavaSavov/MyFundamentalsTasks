package bookexmethodsandrecursion;

import java.util.Scanner;

public class MethodFindingSum {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		
		System.out.println("Enter first number: ");
		firstNum = input.nextInt();

		System.out.println("Enter second number: ");
		secondNum = input.nextInt();
		
		findSum(firstNum, secondNum);
		
		input.close();
		
	}
	
	public static void findSum(int x, int y) {

		int sum = x + y;
		
		System.out.println("The sum of the two numbers is: " + sum);
	}

}
