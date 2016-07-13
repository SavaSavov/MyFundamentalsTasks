package homework;

import java.util.Scanner;

public class Exersice5 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int c;
		
		System.out.println("Please enter the first integer number: ");
		a = input.nextInt();

		System.out.println("Please enter the second integer number: ");
		b = input.nextInt();
		
		System.out.println("Please enter the third integer number: ");
		c = input.nextInt();

		if ((a > b) && (b > c)) {
			System.out.printf("Numbers in descending order are: %d %d %d.", a, b, c);
		}
		if ((a > c) && (c > b)) {
			System.out.printf("Numbers in descending order are: %d %d %d.", a, c, b);
		}
			
		if ((b > a) && (a > c)) {
			System.out.printf("Numbers in descending order are: %d %d %d.", b, a, c);
		}
		if ((b > c) && (c > a)) {
			System.out.printf("Numbers in descending order are: %d %d %d.", b, c, a);
		}
		
		if ((c > a) && (a > b)) {

			System.out.printf("Numbers in descending order are: %d %d %d.", c, a, b);
		}
		if ((c > b) && (b > a)) {
			System.out.printf("Numbers in descending order are: %d %d %d.", c, b, a);
		}
		
		input.close();

	}

}
