package homework;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter number to let the program draw triangle: ");
		n = input.nextInt();
		
		for(int indexI = 0; indexI < n; indexI++){
			for(int indexJ = 1; indexJ <= (2*n);indexJ++ ){
				if (n - indexI <= indexJ && n + indexI >= indexJ) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		
		input.close();

	}

}
