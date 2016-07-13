package classwork;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int number = input.nextInt();
		
		for (int i = 0; i < number; i++) {
			for (int j = 1; j < (2*number); j++) {
				if(number-i<=j&&number+i>=j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		input.close();
	}

}
