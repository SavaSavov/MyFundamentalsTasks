package homework;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		String firstWord;
		String secondWord;

		System.out.println("Input first sequence of characters to let the program find the differences:");
		firstWord = input.next();

		System.out.println("Input second sequence of characters to let the program find the differences:");
		secondWord = input.next();
		
		int lengthOfWord = 0;
		
		if (firstWord.length() > secondWord.length()) {
			System.out.println("\nThe first sequence of characters is longer than second one.");
			lengthOfWord = secondWord.length();
		} else {
			if (secondWord.length() > firstWord.length()) {
				System.out.println("\nThe second sequence of characters is longer than first one.");
				lengthOfWord = firstWord.length();
			} else {
				System.out.println("\nBoth sequences have same size.");
				lengthOfWord = firstWord.length();
			}
		}
		
		boolean equalChars = true;

		for (int index = 0; index < lengthOfWord; index++) {
			if (firstWord.charAt(index) != secondWord.charAt(index)) {
				equalChars = false;
				break;
			}
		}

		if (equalChars) {
			System.out.println("\nBoth sequences have same chars.");
		} else {
			System.out.println("\nThe difference is in positions:");
			for (int index = 0; index < lengthOfWord; index++) {
				if (firstWord.charAt(index) != secondWord.charAt(index)) {
					System.out.println(
							(index + 1) + " ---> " + firstWord.charAt(index) + " - " + secondWord.charAt(index));
				}
			}

		}
		
		input.close();

	}

}
