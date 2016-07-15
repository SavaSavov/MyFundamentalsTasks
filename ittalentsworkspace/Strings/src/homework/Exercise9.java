package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		String word;

		System.out.println("Enter sequence of characters and digits:");
		word = input.next();
		
		System.out.println("First finding numbers in text using regular expression:\n");
		printNumsAndSumWithRegex(word);
	    
		System.out.println("Afterwards finding numbers in text by chars:\n");
		printNumsAndSum(word);
		
		input.close();

	}
	
	static void printNumsAndSumWithRegex(String text){
		
		int sumOfNumsInText = 0;

		String pattern = "(-?(\\d+))";

		Pattern myPattern = Pattern.compile(pattern);

		Matcher match = myPattern.matcher(text);
		
		while (match.find()) {
			
			String numString = match.group(0);
			
			System.out.println(numString);
			
			int currNum = 0;
			currNum = Integer.parseInt(numString);
			
			sumOfNumsInText += currNum;
		}
		
		System.out.println("\nThe sum of the digits in the text is: " + sumOfNumsInText + "\n");
	}
	
	static void printNumsAndSum(String text){
		
		String currNum = "";
		int sumOfDigits = 0;

		for (int indexI = 0; indexI < (text.length() - 1); indexI++) {
			
			if (text.charAt(indexI) == '-' && (text.charAt(indexI + 1) >= '1' && text.charAt(indexI + 1) <= '9')) {
				currNum += text.charAt(indexI);
			}
			
			if ((text.charAt(indexI) >= '0' && text.charAt(indexI) <= '9')) {
				currNum += text.charAt(indexI);
			} 

			for (int indexJ = indexI + 1; indexJ < text.length(); indexJ++) {

				if (!(text.charAt(indexJ) >= '0' && text.charAt(indexJ) <= '9')) {
					if (text.charAt(indexJ) == '-') {
						indexI = (indexJ - 1);
						break;
					} else {
						indexI = indexJ;
						break;
					}
				} else {
						currNum += text.charAt(indexJ);
						indexI = indexJ;
				}
			}

			if (currNum != "") {
				sumOfDigits += Integer.parseInt(currNum);
				System.out.println(currNum);
				currNum = "";
			}				
		}
		
		System.out.println("\nThe sum of the digits in the text is: " + sumOfDigits);
		
	}

}
