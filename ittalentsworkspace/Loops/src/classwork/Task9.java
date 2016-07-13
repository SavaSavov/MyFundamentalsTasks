package classwork;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numer to write triangle: ");
		int number = input.nextInt();
		
		for (int i = 0; i < number; i++) {
			for (int j = 1; j < 2*number; j++) {
				if (i == number-1 || number-i==j || number+i==j) {
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		input.close();
	}

}
