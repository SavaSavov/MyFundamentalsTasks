package homework;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter the number of card in range 1 to 52: ");
		number = input.nextInt();
		
		while(number < 1 && number > 52){
			System.out.println("Invalid input deck of cards has range from 1 to 52.\n"
					+ "Please enter number of card again.");
			number = input.nextInt();
		}
		
		String result = "";
		int card = 1;
		
		int suit = number % 4;
		
		if( suit == 0){
			suit = 4;
		}		
		if(number == 1 || number == 2 || number == 3){
			card = 1;
		}
		if(number % 4 == 0){
			card = number / 4;
		}else{
			card = (number / 4) + 1;
		}
		
		while(card <= 13){
			while (suit <= 4) {

				switch (card) {
				case 1: result += "2 ";					
					break;
				case 2: result += "3 ";					
				break;
				case 3: result += "4 ";					
				break;
				case 4: result += "5 ";					
				break;
				case 5: result += "6 ";					
				break;
				case 6: result += "7 ";					
				break;
				case 7: result += "8 ";					
				break;
				case 8: result += "9 ";					
				break;
				case 9: result += "10 ";					
				break;
				case 10: result += "J ";					
				break;
				case 11: result += "Q ";					
				break;
				case 12: result += "K ";					
				break;
				case 13: result += "A ";					
				break;
				
				default: System.out.println("There isn't such case.");
					break;
				}
				
					switch (suit) {
					case 1: result += "club, ";					
						break;
					case 2: result += "diamond, ";					
					break;
					case 3: result += "heart, ";					
					break;
					case 4: result += "spade, ";					
					break;
					
					default: System.out.println("There isn't such case.");
						break;
					}
					suit++;
			}
			card++;
			suit = 1;
			
		}
		System.out.println(result);
		input.close();

	}

}
