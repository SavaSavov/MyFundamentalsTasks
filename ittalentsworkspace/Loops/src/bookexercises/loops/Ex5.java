package bookexercises.loops;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int p = input.nextInt();
		
		System.out.println("Enter second number: ");
		int q = input.nextInt();
		
		for (int i = 1; i <= p; i++) {
			for (int j = 1; j <= q; j++) {
				System.out.printf("%d%d ", i, j);
			}
			System.out.println();
		}
		
		input.close();

	}

}
