package homework;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter the number from which to start: ");
		number = input.nextInt();
		
		int count = 1;
		
		while (count <= 10 && number >= 1 && number <= 999) {

			if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
				System.out.println(count + ":" + number + " ");
				count++;
				number++;
			}else{
				number++;
			}
			
		}
		
		input.close();

	}

}
