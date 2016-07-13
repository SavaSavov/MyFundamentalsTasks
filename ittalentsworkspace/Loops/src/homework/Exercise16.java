package homework;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int n;
		int m;
		
		System.out.println("Enter first number in range from 10 to 5555 : ");
		n = input.nextInt();
		
		System.out.println("Enter second number in range from 10 to 5555 : ");
		m = input.nextInt();
		

		for (int index = (n < m) ? m : n; index >= ((n < m) ? n : m); index--) {
			if (index % 50 == 0) {
				System.out.print(index + ", ");
			}
		}
	
		input.close();

	}

}
