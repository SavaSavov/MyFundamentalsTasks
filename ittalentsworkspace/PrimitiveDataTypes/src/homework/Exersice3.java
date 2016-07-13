package homework;

import java.util.Scanner;

public class Exersice3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int temp = 0;
		
		System.out.println("Please enter the first integer number a: ");
		a = input.nextInt();
		
		System.out.println("Please enter the second integer number b: ");
		b = input.nextInt();
		
		System.out.println("Before swap number a is: " + a);
		System.out.println("Before swap number b is: " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println();
		System.out.println("After swap number a is: " + a);
		System.out.println("After swap number b is: " + b);
		
		input.close();

	}

}
