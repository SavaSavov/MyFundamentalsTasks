package homework;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int n;
		int count = 1;
				
		System.out.println("Enter how many numbers you whant to show\n that could be divided to 3: ");
		n = input.nextInt();
		
		while( count <= n){
			int prod = 3;
			prod *= count;
			System.out.print(prod + ", ");
			count++;
		}
		input.close();
	}

}
