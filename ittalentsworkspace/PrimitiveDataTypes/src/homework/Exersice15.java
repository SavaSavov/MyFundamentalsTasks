package homework;

import java.util.Scanner;

public class Exersice15 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		byte hour;

		System.out.println("Enter hour in the range of 0 to 24 inclusive\n"
				+ "to let the program evaluate which period from the day is: ");
		hour = input.nextByte();
		
		if (hour >= 0 && hour <= 24) {
			
			if (hour >= 4 && hour < 9) {
				System.out.println("Good morning!");
			} else if (hour >= 9 && hour < 18) {
				System.out.println("Good afternoon!");
			} else {
				System.out.println("Good evening!");
			}
		}else{
			System.out.println("You've entered invalid hour! The hour has to be in the range of 0 to 24!");
		}
		
		input.close();

	}

}
