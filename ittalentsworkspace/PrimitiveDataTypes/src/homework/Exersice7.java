package homework;

import java.util.Scanner;

public class Exersice7 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		byte hour;
		double money;
		boolean healthy;
		
		System.out.println("Please enter what time is now: ");
		hour = input.nextByte();
		
		System.out.println("Enter how much money do you have");
		money = input.nextDouble();
		
		System.out.println("Enter true if you're healthy or false if you're not");
		healthy = input.nextBoolean();
		
		if (hour >= 0 && hour < 24) {
			if (healthy) {

				if (money > 0.0 && money > 10.0) {
					System.out.println("The time now is: " + hour
							+ "I have more than 10 leva and I'll go to cinema with my friends.");
				} else if (money > 0.0 && money < 10.0) {
					System.out.println("The time now is: " + hour + "I have less than 10 leva and I'll go to caffe.");
				}
			} else {
				System.out.println("The time now is: " + hour + "I won't go out.");
				if (money > 0) {
					System.out.println("I'll buy myself medicines.");
				} else {
					System.out.println("I'll stay home and I'll drink tea.");
				}
			}
		}else{
			System.out.println("You've entered invalid hour.");
		}
				
		input.close();

	}

}
