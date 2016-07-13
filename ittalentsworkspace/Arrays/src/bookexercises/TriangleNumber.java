package bookexercises;

import java.util.Scanner;

public class TriangleNumber {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number:");
		number = input.nextInt();
		
		int count = 1;
		int resultNum = 0;
		
		while(resultNum < number){
			resultNum += count;
			count++;
		}
		
		if(resultNum == number){
			System.out.println("The number is triangle.\n");
			for (int row = 1; row < count; row++) {
				for (int col = 1; col <= row; col++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else{
			System.out.println("The entered number isn't triangle.");
		}
		
		input.close();

	}

}
