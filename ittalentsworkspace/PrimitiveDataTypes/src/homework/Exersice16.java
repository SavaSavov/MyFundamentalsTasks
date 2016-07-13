package homework;

import java.util.Scanner;

public class Exersice16 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int number;
		int a;
		int b;
		int c;
		
		System.out.println("Enter three digit number: ");
		number = input.nextInt();
		
		a = number/100%10;
		b = number/10%10;
		c = number%10;
		
		if(a == b && b == c){
			System.out.println("The digits of the number are equal.");
		}else if(a > b && b > c){
			System.out.println("The digits of the number are in descending order.");
		}else if(a < b && b < c){
			System.out.println("The digits of the number are in ascending order.");
		}else{
			System.out.println("The digits of the number aren't ordered.");
		}
		
		input.close();

	}

}
