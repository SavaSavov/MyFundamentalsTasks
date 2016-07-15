package homework;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		String word;

		System.out.println("Enter word to let program evaluate if it's palindrome:");
		word = input.next();

		boolean isPalindrome = true;
		
		for (int index = 0; index < (word.length() + 1) / 2; index++) {
			if (word.charAt(index) != word.charAt(word.length() - index - 1)) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println("\nThe word is:\n\n" + word);

		if (isPalindrome) {
			System.out.println("\nand is palindrome.");
		} else {
			System.out.println("\nand isn't palindrome.");
		}
		
		input.close();
	}

}
