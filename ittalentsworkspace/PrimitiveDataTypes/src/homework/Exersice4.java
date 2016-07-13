package homework;

import java.util.Scanner;

public class Exersice4 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Please enter the first integer number: ");
		a = input.nextInt();

		System.out.println("Please enter the second integer number: ");
		b = input.nextInt();

		if (a < b) {
			System.out.printf("Numbers in ascending order are: %d %d", a, b);
		} else {
			System.out.printf("Numbers in ascending order are: %d %d", b, a);
		}
		input.close();

	}

}
