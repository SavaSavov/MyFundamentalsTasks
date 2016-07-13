package homework;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number;
		long factoriel = 1L;
		
		System.out.println("Enter the number of which you want to find factoriel : ");
		number = input.nextInt();
		int temp = number;
		
		do{
			
			factoriel *= temp;
			temp--;
			
		} while (temp > 0);

		System.out.println("Factoriel of " + number + " is = " + factoriel);

		input.close();

	}

}
