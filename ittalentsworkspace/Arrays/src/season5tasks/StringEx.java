package season5tasks;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text;
		
		System.out.println("Enter some text:");
		text = input.nextLine();
		
		findingMostOccuringWord(text);
		
		input.close();		

	}
	
	static void findingMostOccuringWord(String text){
		
		String[] arrOfWords = text.split(" ");
		
		int mostPopular = 0;
		String mostFrequentWord = "";
		
		
		for (int indexA = 0; indexA < arrOfWords.length - 1; indexA++) {
			String currWord = arrOfWords[indexA];
			int currCount = 1;
			for (int indexB = indexA + 1; indexB < arrOfWords.length; indexB++) {
				if (currWord.equals(arrOfWords[indexB])) {
					currCount++;
				}

				if (currCount > mostPopular) {
					mostPopular = currCount;
					mostFrequentWord = currWord;
				}
			}
		}
		
		System.out.println("The most popular word is ---> " + mostFrequentWord + " found " + mostPopular);
	}

}
