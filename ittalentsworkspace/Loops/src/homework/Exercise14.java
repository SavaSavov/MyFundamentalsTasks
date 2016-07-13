package homework;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number in the range of 10 to 200: ");
		number = input.nextInt();
		
		if(number > 10 && number <=200){
			int temp = number;
			while(temp >= 10){
				if(temp % 7 == 0 && temp != number){
					System.out.print(temp + ", ");
				}
				temp--;
			}
			
		}else{
			System.out.println("Invalid number.");
		}
		input.close();
	}

}
