package homework;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int n;
		char sign;
		
		System.out.println("Enter number in range from 3 to 20 for the length of the square: ");
		n = input.nextInt();
		
		System.out.println("Enter sign + or - that you want to fill the square: ");
		sign = input.next().charAt(0);
		
		if( n >= 3 && n <= 20){
			for (int indexI = 0; indexI < n; indexI++) {
				for (int indexJ = 0; indexJ < n; indexJ++) {
					if (indexI == 0 || indexI == (n - 1) || indexJ == 0 || indexJ == n - 1) {
						System.out.print("*");
					} else {
						System.out.print(sign);
					}
				}
				System.out.println();
			}
		}else{
			System.out.println("Invalid input!");
		}
		input.close();
	}

}
