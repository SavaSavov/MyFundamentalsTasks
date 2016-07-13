package homework;

import java.util.Scanner;

public class Exersice6 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int a1;
		int a2;
		int a3;
		int temp = 0;
		
		System.out.println("Please enter the first integer number: ");
		a1 = input.nextInt();

		System.out.println("Please enter the second integer number: ");
		a2 = input.nextInt();
		
		System.out.println("Please enter the third integer number: ");
		a3 = input.nextInt();
		
		System.out.println("Before swap number a1 is: " + a1);
		System.out.println("Before swap number a2 is: " + a2);
		System.out.println("Before swap number a3 is: " + a3);
		
		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println();
		
		System.out.println("After swap number a1 is: " + a1);
		System.out.println("After swap number a2 is: " + a2);
		System.out.println("After swap number a3 is: " + a3);
		
		input.close();

	}

}
