package homework;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n;

		System.out.println("Enter number to find the sum of all numbers from 1 to it: ");
		n = input.nextInt();

		int count = 1;
		int sum = 0;

		do {

			sum += count;
			count++;

		} while (count <= n);

		System.out.printf("The sum of the numbers from 1 to " + n + " is " + sum);

		input.close();

	}

}
