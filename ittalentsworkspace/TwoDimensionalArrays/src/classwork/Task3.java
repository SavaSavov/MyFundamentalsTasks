package classwork;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		char[] charArr = {'w','g','i','y','n','f','d','l'};
		
		char ch;
		int indexOfElement =  -1;
		
		System.out.println("Enter character that you want to search for: ");
		ch = input.next().charAt(0);
		
		for (int index = 0; index < charArr.length; index++) {
			if(charArr[index] == ch){
				indexOfElement = index;
				break;
			}
		}
		
		if(indexOfElement >= 0){
			System.out.println("Character that you've entered is found on position " + indexOfElement);
		}else{
			System.out.println("Character that you've entered is not found.");
		}
		
		input.close();

	}

}
