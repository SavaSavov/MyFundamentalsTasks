package bookexercises;

import java.util.Scanner;

public class BookEx5 {

	public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		
		System.out.println("Enter first number: ");
		firstNum = input.nextInt();
		
		System.out.println("Enter second number: ");
		secondNum = input.nextInt();
		
		int firstTemp = 0;
		int secondTemp = 0;
		
		int equalBit = 0;
		int count = 0;
		
		while(count < 32){
			firstTemp = firstNum%2;
			secondTemp = secondNum%2;
			
			if(firstTemp == secondTemp){
				equalBit++;
			}
			firstNum /= 2;
			secondNum /= 2;
			count++;
		}
		System.out.println(equalBit);
		
		input.close();

	}

}
