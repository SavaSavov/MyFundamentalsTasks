package homework;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number;
		int divider = 2;
		
		System.out.println("Enter number to let the program evaluate if it's prime number: ");
		number = input.nextInt();
		
		int maxDiv = (int) Math.sqrt(number);		
		boolean prime = true;
		
		while (prime && (divider <= maxDiv)) {
			if (number % divider == 0) {
				prime = false;
				break;
			}
			divider++;
		}
		System.out.println("The entered number is prime? " + prime);

		input.close();

	}

}
