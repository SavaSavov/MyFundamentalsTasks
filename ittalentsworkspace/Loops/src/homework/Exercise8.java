package homework;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int n;
		
		System.out.println("Enter number: ");
		n = input.nextInt();
		int count = n-1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(count);
			}
			count += 2;
			System.out.println();
		}
		
		input.close();

	}

}
