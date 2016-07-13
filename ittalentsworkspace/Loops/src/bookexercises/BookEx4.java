package bookexercises;

import java.util.Scanner;

public class BookEx4 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number: ");
		number = input.nextInt();
		
		int count = 0;
		int temp = 0;
		
		while (number != 0) {
			
			temp = number % 2;
			count++;
			if(count == 5){
				System.out.println("The fifth bit is: " + temp);
			}
			number = number / 2;
			
		}
		input.close();

	}

}
