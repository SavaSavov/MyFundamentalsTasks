package bookexercises.loops;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		boolean isPrime = true;
		int divider = 2;
		int maxDiv = (int) Math.sqrt(number);
		
		while(isPrime && divider <= maxDiv){
			if(number % divider == 0){
				isPrime = false;
			}
			divider++;
		}
		System.out.println("The number is prime ---> " + isPrime);
		
		input.close();

	}
}
