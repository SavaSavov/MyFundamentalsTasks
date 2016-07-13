package homework;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int number;
		int count = 1;
		int sum = 0;

		System.out.println("Enter integer number: ");
		number = input.nextInt();
		
		while(count <= number){
			sum += count;
			count++;
		}
		System.out.printf("The sum of the numbers between 1 and %d is %d", number, sum);
		
		input.close();

	}

}
