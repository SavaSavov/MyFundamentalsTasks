package homework;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String twoPersonsNames;

		do {

			System.out.println("Enter two persons' first, middle and last names separated by comma\n"
					+ "between first and second person names:");
			twoPersonsNames = input.nextLine();

		} while (validateInput(twoPersonsNames));

		String[] namesArr = twoPersonsNames.split(",");
		int bestSum = Integer.MIN_VALUE;
		String biggerAsciName = "";

		for (int indexI = 0; indexI < namesArr.length; indexI++) {
			int currentSum = 0;
			String currName = namesArr[indexI].trim();
			for (int indexJ = 0; indexJ < currName.length(); indexJ++) {
				currentSum += currName.charAt(indexJ);

				if (currentSum > bestSum) {
					bestSum = currentSum;
					biggerAsciName = currName;
				}
			}
			currentSum = 0;
		}

		System.out.println("\nNames which letters ASCI values form greater sum are:\n" + biggerAsciName);

		input.close();

	}

	static boolean validateInput(String text) {

		boolean incorrectInput = true;

		String[] textArr1 = text.split(",");
		
		String[] textArr2 = textArr1[0].trim().split(" ");
		
		String[] textArr3 = textArr1[1].trim().split(" ");
		
		if(textArr3.length == 3 && textArr2.length == 3){
			incorrectInput = false;
		}
		
		if(incorrectInput){
			System.out.println("Invalid input!!!");
		}

		return incorrectInput;
	}

}
