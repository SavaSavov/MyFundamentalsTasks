package homework;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter the number which you want to check if it is palindrome: ");
		number = input.nextInt();
		
		int temp = number;
		int count = 0;
		int result = 0;
		
		while(temp > 0){
			temp = temp/10;
			count++;
		}
		temp = number;
		
		do{			
			result += (int) ((temp%10)*Math.pow(10, (count-1)));
			temp = temp/10;
			count--;
		}while(count > 0);
		
		if(result == number){
			System.out.println("The number you've entered is palindrome.");
		}else{
			System.out.println("The number you've entered isn't palindrome.");
		}
		input.close();
	}

}
