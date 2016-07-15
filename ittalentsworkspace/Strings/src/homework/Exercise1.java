package homework;

import java.util.Scanner;

public class Exercise1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String firstString;
		String secondString;
		
		do {
			System.out.println("Input letters for the first string containing capital and small letters:");
			firstString = input.next();

		} while (validateInput(firstString));

		do {
			System.out.println("Input letters for the second string containing capital and small letters less than 40:");
			secondString = input.next();

		} while (validateInput(secondString));
		
		
		printWord(firstString);
		
		printWord(secondString);
		
		input.close();

	}
	
	static void printWord(String word){
		
		System.out.println("\nString to upper case:\n" + word.toUpperCase());

		System.out.println("\nString to lower case:\n" + word.toLowerCase());
		
	}
	
	static boolean validateInput(String text) {

		boolean incorrectInput = false;

		if(text.length() > 40){
			incorrectInput = true;
		}
		
		if(incorrectInput){
			System.out.println("Incorrect input!!! Characters in the string has to be less than 40.");
		}

		return incorrectInput;
	}

}
