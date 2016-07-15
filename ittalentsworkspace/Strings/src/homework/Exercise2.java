package homework;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		String firstWord;
		String secondWord;

		do {
			
			System.out.println("Input first word minimum 10 and maximum 20 characters:");
			firstWord = input.next();
			
		} while (validateInput(firstWord));

		do{

		System.out.println("Input second word:");
		secondWord = input.next();
		
		}while(validateInput(secondWord));

		char[] firstWordToChar = firstWord.toCharArray();

		char[] secondWordToChar = secondWord.toCharArray();

		int replaceLength = 5;

		for (int index = 0; index < replaceLength; index++) {
			char tempChar = '\u0000';

			tempChar = firstWordToChar[index];
			firstWordToChar[index] = secondWordToChar[index];
			secondWordToChar[index] = tempChar;
		}

		if (firstWordToChar.length > secondWordToChar.length) {
			firstWord = new String(firstWordToChar);
			System.out.println("The length of the longer word is: " + (firstWord.length())
					+ "\nThe word after replacing first 5 characters is: " + firstWord);
		} else {
			if (secondWordToChar.length > firstWordToChar.length) {
				secondWord = new String(secondWordToChar);
				System.out.println("The length of the longer word is: " + (secondWord.length())
						+ "\nThe word after replacing first 5 characters is: " + secondWord);
			} else {
				firstWord = new String(firstWordToChar);
				secondWord = new String(secondWordToChar);
				System.out.println("Both words have same size: " + (firstWord.length())
						+ "\nFirst word after replacing first 5 characters is: " + firstWord
						+ "\nSecond word after replacing first 5 characters is: " + secondWord);
			}
		}
		
		input.close();
	}
	
	static boolean validateInput(String word){
		
		boolean incorrectInput = false;
		
		if(word.length() < 10 || word.length() > 20) {
			incorrectInput = true;
		}
		
		if(incorrectInput){
			System.out.println("Invalid input!!!");
		}
		
		return incorrectInput;
	}

}
