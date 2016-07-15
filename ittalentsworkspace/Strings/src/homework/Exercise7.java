package homework;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String sentence;
		
		do{
			
			System.out.println("Enter several words with spaces between them:");
			sentence = input.nextLine();
			
		}while(validateInput(sentence));
		
		String[] wordsArr = sentence.split(" ");
		int maxLength = 0;
		
		for (int index = 0; index < wordsArr.length; index++) {
			int currWordLength = wordsArr[index].length();
				if(currWordLength > maxLength){
					maxLength = currWordLength;
				}
		}
		
		int wordsCount = wordsArr.length;
		
		System.out.println("The sentence has " + wordsCount + " words \nand the longest word size is: " 
									+ maxLength + " letters.");
		
		input.close();		

	}
	
	static boolean validateInput(String text){
		
		boolean incorrectInput = true;
		
		for (int index = 0; index < text.length(); index++) {
			if(text.charAt(index) == ' '){
				incorrectInput = false;
				break;
			}
		}
		
		if(incorrectInput){
			System.out.println("Invalid input!!!");
		}
		
		return incorrectInput;
	}

}
