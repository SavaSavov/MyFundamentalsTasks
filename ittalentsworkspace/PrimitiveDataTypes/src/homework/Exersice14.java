package homework;

import java.util.Scanner;

public class Exersice14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;
		int y;
		int firstSum = 0;
		int secondSum = 0;

		System.out.println("Enter first integer number in the range of 1 to 8 inclusive: ");
		x = input.nextInt();
		
		System.out.println("Enter second integer number in the range of 1 to 8 inclusive: ");
		y = input.nextInt();
		
		firstSum = (x + y);
		
		System.out.println("Enter third integer number in the range of 1 to 8 inclusive: ");
		x = input.nextInt();
		
		System.out.println("Enter forth integer number in the range of 1 to 8 inclusive: ");
		y = input.nextInt();
		
		secondSum = (x + y);
		
		if(firstSum%2 == 0 && secondSum%2 == 0){
			System.out.println("The positions with inputted coordinates are with the same colour.");
		}else if(firstSum%2 != 0 && secondSum%2 != 0){
			System.out.println("The positions with inputted coordinates are with the same colour.");
		}else{
			System.out.println("The positions with inputted coordinates are with different colour.");
		}
		
		input.close();

	}

}
