package homework;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		String lettersSeq;
		
		System.out.println("Enter sequence of characters:");
		lettersSeq = input.next();
		
		char[] charArr = lettersSeq.toCharArray();
		
		for (int index = 0; index < charArr.length; index++) {
			charArr[index] += 5;
		}
		
		System.out.println("First the sequence look like this:\n" + lettersSeq);
		
		lettersSeq = new String(charArr);
		
		System.out.println("\nAfter modification is:\n" + lettersSeq);
		
		input.close();

	}

}
