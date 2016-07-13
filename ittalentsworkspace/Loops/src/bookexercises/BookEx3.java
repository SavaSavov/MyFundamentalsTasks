package bookexercises;

import java.util.Scanner;

public class BookEx3 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number: ");
		number = input.nextInt();
		
		int count = 0;
		int temp = 0;
		
		while (number != 0) {
			
			temp = number % 2;

			if (temp == 1) {
				count++;
			}
			number = number / 2;
		}
		
		System.out.println("Bits that are 1 are: " + count);
		input.close();

	}

}
