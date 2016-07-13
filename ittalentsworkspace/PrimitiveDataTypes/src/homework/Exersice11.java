package homework;

import java.util.Scanner;

public class Exersice11 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		int number;
		int a;
		int b;
		int c;

		System.out.println("Please enter three integers that aren't zero number: ");
		number = input.nextInt();
		int temp = number;
		
		a = temp/100%10;
		b = temp/10%10;
		c = temp%10;
		
		if(number % a == 0 && number % b == 0 && number % c == 0){
			System.out.println("The number could be divided by it's integers.");
		}else{
			System.out.println("The number couldn't be divided by it's integers.");
		}
		
		input.close();

	}

}
