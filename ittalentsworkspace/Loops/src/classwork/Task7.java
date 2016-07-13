package classwork;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		short a = input.nextShort();

		System.out.println("Enter number in range 1 to 7 to invert bits of the first number: ");
		short b = input.nextShort();
		
		System.out.println("Enter number in range 1 to 7 to invert bits of the first number: ");
		short c = input.nextShort();
		
		a = (short) (a^(1<<(b-1)));
		a = (short) (a^(1<<(c-1)));
		
		System.out.println(a);
		
		input.close();
		
	}

}
