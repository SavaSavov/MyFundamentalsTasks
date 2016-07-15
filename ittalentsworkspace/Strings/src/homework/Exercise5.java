package homework;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		String firstWord;
		String secondWord;
		
		System.out.println("Enter first word:");
		firstWord = input.next();
		
		System.out.println("Enter second word:");
		secondWord = input.next();
		
		boolean hasSameChar = false;
		int horizontalIndex = 0;
		int verticalIndex = 0;
		
		for (int indexA = 0; indexA < firstWord.length(); indexA++) {
			for (int indexB = 0; indexB < secondWord.length(); indexB++) {
				if(firstWord.charAt(indexA) == secondWord.charAt(indexB)){
					hasSameChar  = true;
					horizontalIndex = indexA;
					verticalIndex = indexB;
					break;
				}
			}
			if(hasSameChar){
				break;
			}
		}
		
		if (hasSameChar) {

			for (int row = 0; row < secondWord.length(); row++) {
				for (int col = 0; col < firstWord.length(); col++) {
					if (row == verticalIndex) {
						System.out.print(firstWord.charAt(col));
					} else {
							if (horizontalIndex == col) {
								System.out.print(secondWord.charAt(row));
							} else {
								System.out.print(" ");
							}
					}
				}
				System.out.println();
			}

		} else {
			System.out.println("The words don't have characters in common.");
		}
		
		input.close();

	}

}
