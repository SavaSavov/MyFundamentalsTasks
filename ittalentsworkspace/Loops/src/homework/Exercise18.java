package homework;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int multiplier;
		
		System.out.println("Enter number in range from 1 to 9 to let program show you"
				+ " multiplication table: ");
		number = input.nextInt();
		
		System.out.println("Enter number in range from 1 to 9 for multiplier: ");
		multiplier = input.nextInt();
		
		for (int indexI = 1; indexI <= number; indexI++) {
			for (int indexJ = 1; indexJ <= multiplier; indexJ++) {
				int product = indexI * indexJ;
				System.out.println(indexI + "*" + indexJ + "=" + product);
			}
		}
		input.close();

	}

}
