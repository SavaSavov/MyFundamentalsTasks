package homework;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		String sentence;
		
		do{
			
			System.out.println("Enter several words with spaces between them:");
			sentence = input.nextLine();
			
		}while(validateInput(sentence));
		
		System.out.println("\nFirst sentence looks like this:\n" + sentence);
		
		sentence = turnFirstLetterToCapital(sentence);
		
		System.out.println("\nAfter turning the first letter in every single word to capital sentence is:\n" 
								+ sentence);
		
		input.close();

	}
	
	static boolean validateInput(String text){
		
		boolean incorrectInput = true;
		int count = 0;
		
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) == ' ') {
				count++;
				if (count >= 2) {
					incorrectInput = false;
					break;
				}
			}
		}
		
		if(incorrectInput){
			System.out.println("Invalid input!!!");
		}
		
		return incorrectInput;
	}
	
	static String turnFirstLetterToCapital(String text){
		
		String processedText = "";
		
		text = text.toLowerCase();
		
		String[] wordsArr = text.split("[ ,.]");
		
		for (int indexI = 0; indexI < wordsArr.length; indexI++) {
			char[] currWordToCharArr = wordsArr[indexI].toCharArray();
			for (int indexJ = 0; indexJ < currWordToCharArr.length; indexJ++) {
				if(indexJ == 0){
					currWordToCharArr[indexJ] -= 32;
				}
			}
			
			processedText += new String(currWordToCharArr) + " ";			
		}
		
		return processedText;
	}

}
