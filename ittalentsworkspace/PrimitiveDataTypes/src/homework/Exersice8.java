package homework;

import java.util.Scanner;

public class Exersice8 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int number;
		int a;
		int b;
		int c;
		int d;
		int firstNumber = 0;
		int secondNumber  = 0;

		System.out.println("Please enter number in between 1000 and 9999: ");
		number = input.nextInt();
		
		if(number >= 1000 && number < 10000){
			
			a = number/1000%10;
			b = number/100%10;
			c = number/10%10;
			d = number%10;
			
			firstNumber = (a * 10) + d;
			secondNumber = (b * 10) + c;
			
			if(firstNumber < secondNumber){
				System.out.printf("First number %d < than second number %d ",firstNumber,secondNumber);
			}else if(firstNumber > secondNumber){
				System.out.printf("First number %d > than second number %d ",firstNumber,secondNumber);
			}else{
				System.out.printf("First number %d == second number %d ",firstNumber,secondNumber);
			}
			
		}else{
			System.out.println("You've entered invalid number. The number has to be in the mentioned interval!");
		}
		input.close();

	}

}
