package homework;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;

		do {

			System.out.println("Enter integer number to let the program find factorial from it:");
			number = input.nextInt();

		} while (validateInput(number));

		System.out.println("Findig factorial iteractively is: " + findFactorial(number));

		System.out.println("\nFinding factorial using recursion is: " + findFactorialWithRecursion(number));

		input.close();

	}

	static long findFactorial(int num) {

		long factoriel = 1L;
		int count = 1;

		while (count <= num) {
			factoriel *= count;
			count++;
		}

		return factoriel;

	}

	static long findFactorialWithRecursion(int num) {

		if (num == 0) {
			return 1;
		}

		return findFactorialWithRecursion(num - 1) * num;
	}
	
	static boolean validateInput(int num) {

		if (num < 0) {
			System.out.println("Incorrect input!!! We can't find factorial of negative numbers.");
			return true;
		} else {
			return false;
		}
	}

}
