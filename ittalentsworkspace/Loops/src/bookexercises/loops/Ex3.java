package bookexercises.loops;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			sum += i;			
		}
		System.out.println("The sum of the numbers is: " + sum);
		
		input.close();

	}

}
