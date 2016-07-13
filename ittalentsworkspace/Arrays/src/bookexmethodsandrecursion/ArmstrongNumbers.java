package bookexmethodsandrecursion;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number:");
		number = input.nextInt();
		
		int tempNum = number;
		int count = 0;
		
		while(tempNum != 0){
			tempNum = tempNum / 10;
			count++;
		}
		
		int resultNum = 0;
		
		tempNum = number;
		
		while(tempNum != 0){
			int res = tempNum % 10;
			resultNum += Math.pow(res, count);
			tempNum = tempNum / 10;
		}
		
		if(resultNum == number){
			System.out.println("The number is Armstrong");
		}else{
			System.out.println("The number isn't Armstrong");
		}
		
		input.close();
		
	}

}
