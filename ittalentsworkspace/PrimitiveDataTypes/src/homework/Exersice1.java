package homework;

import java.util.Scanner;

public class Exersice1 {

	public static void main(String[] args) {


		
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Please enter the first number: ");
		a = input.nextDouble();
		
		System.out.println("Please enter the second number: ");
		b = input.nextDouble();
		
		System.out.println("Please enter the third number to check if it's between first and second number: ");
		c = input.nextDouble();
		
		System.out.println("The first number you've entered is: " + a);
		System.out.println("The second number you've entered is: " + b);
		System.out.println("The third number you've entered is: " + c);
		
		if( c > a && c < b ){
			System.out.println("The third number is between first and second number.");
		}else{
			System.out.println("The third number isn't between first and second number.");
		}
		
		input.close();

	}

}
