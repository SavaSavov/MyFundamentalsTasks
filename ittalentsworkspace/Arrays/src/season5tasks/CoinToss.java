package season5tasks;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		String side;
		int sideCount = 0;

		while (true) {
			System.out.println("Enter side of a coin: ");
			side = input.next();

			if (!side.equalsIgnoreCase("Heads")) {
				sideCount = 0;
			} else {
				sideCount++;
			}
			if (sideCount == 5) {
				break;
			}
		}
		input.close();

	}

}
