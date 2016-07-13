package homework;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter number in the range of 2 to 27: ");
		n = input.nextInt();
		
		int number = 100;
		int sum = 0;
		if (n >= 2 && n <= 27) {
			while (number < 1000) {
				int temp = number;

				int numberOfHundreds = temp / 100 % 10;
				int numberOfTens = temp / 10 % 10;
				int numberOfUnits = temp % 10;

				sum = numberOfHundreds + numberOfTens + numberOfUnits;

				if (sum == n) {
					System.out.print(temp + ", ");
				}
				number++;
			}
		}else{
			System.out.println("Invalid number.");
		}
		input.close();

	}

}
