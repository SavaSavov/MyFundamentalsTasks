package exam;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text1 = input.nextLine();
		
		System.out.println("Enter text:");
		String text2 = input.nextLine();
		
		System.out.println("Enter text:");
		String text3 = input.nextLine();
		
		String[] arr1 = text1.split(" ");
		String[] arr2 = text2.split(" ");
		String[] arr3 = text3.split(" ");
		
		int maxLength = Integer.MIN_VALUE;
		String longestWord = "";
		
		for (int indexA = 0; indexA < arr1.length; indexA++) {
			String currWordA = arr1[indexA];
			
			for (int indexB = 0; indexB < arr2.length; indexB++) {
				String currWordB = arr2[indexB];
				
				if(currWordA.equals(currWordB)){
					for (int indexC = 0; indexC < arr3.length; indexC++) {
						String currWordC = arr3[indexC];
						if(currWordA.equals(currWordC)){
							if(currWordA.length() > maxLength){
								longestWord = currWordA;
								maxLength = currWordA.length();
							}
						}
					}
				}
			}
		}
		
		System.out.println(longestWord);
		input.close();

	}

}
