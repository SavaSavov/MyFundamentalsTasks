package homework;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number in range from 10 to 99: ");
		number = input.nextInt();
		
		if(number >= 10 && number <= 99){
			
			while(number != 1){
				if(number%2 == 0){
					number *= 0.5;
					System.out.print(number + " ");
				}else{
					number = (number*3)+1;
					System.out.print(number + " ");
				}
			}
			
		}else{
			System.out.println("You've entered invalid number. The number has to be in range"
					+ "from 10 to 99");
		}
		input.close();
	}

}
