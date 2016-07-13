package homework;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Enter the first number: ");
		number1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		number2 = input.nextInt();
		
		int min;
		int max;
		
		if(number1 < number2){
			min = number1;
			max = number2;
		}else{
			min = number2;
			max = number1;
		}
		
		while(min <= max){
			System.out.print(min + " ");
			min++;
		}
		
		input.close();

	}

}
