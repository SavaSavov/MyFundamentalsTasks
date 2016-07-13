package homework;

import java.util.Scanner;

public class Exersice9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int  product = 1;
		int num = 1;

		System.out.println("Please enter first number in between 10 and 99: ");
		a = input.nextByte();

		System.out.println("Please enter second number in between 10 and 99: ");
		b = input.nextByte();
		
		if(a >= 10 && a < 100 && b >= 10 && b < 100){
			product = a * b;
			num = product%10;
			if (num != 0) {
				if (num % 2 == 0) {
					System.out.println("The product of the two integers is: " + product);
					System.out.println("The last number from the product is even: " + num);
				} else {
					System.out.println("The product of the two integers is: " + product);
					System.out.println("The last number from the product is odd: " + num);
				}
			}else{
				System.out.println("The product of the two integers is: " + product);
				System.out.println("The last number from the product is zero: " + num);
			}
			
		}else{
			System.out.println("You've entered invalid number. The number has to be in the mentioned interval!");
		}
		
		input.close();

	}

}
