package homework;

import java.util.Scanner;

public class Exersice2 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int sum = 0;
		int difference = 0;
		int product = 1;
		int division = 1;
		int reminderFromDiv = 1;
		
		System.out.println("Please enter the first integer number: ");
		a = input.nextInt();
		
		System.out.println("Please enter the second integer number: ");
		b = input.nextInt();
		
		sum = a + b;
		difference = a - b;
		product = a * b;
		division = a / b;
		reminderFromDiv = a % b;
		
		System.out.printf("The sum of the two integer numbers is: %d \n"
				+ "The difference  is: %d \n"
				+ "The product is: %d \n"
				+ "The division is:  %d \n"
				+ "The reminder from division is: %d \n",sum,difference,product,division,reminderFromDiv);
		
		double c;
		double d;
		
		System.out.println("Please enter the first floating point number: ");
		c = input.nextDouble();
		
		System.out.println("Please enter the second floating point number: ");
		d = input.nextDouble();
		
		double doubleSum = 0.0;
		double doubleDifference = 0.0;
		double doubleProduct = 1.0;
		double doubleDivision = 1.0;
		double remDiv = 1.0;
		
		doubleSum = c + d;
		doubleDifference = c - d;
		doubleProduct = c * d;
		doubleDivision = c / d;
		remDiv = c % d;
		
		System.out.printf("The sum of the two floating point numbers is: %.2f \n"
				+ "The difference  is: %.2f \n"
				+ "The product is: %.2f \n"
				+ "The division is:  %.2f \n"
				+ "The reminder from division is: %.2f ",
				doubleSum,doubleDifference,doubleProduct,doubleDivision,remDiv);
		
		input.close();

	}

}
