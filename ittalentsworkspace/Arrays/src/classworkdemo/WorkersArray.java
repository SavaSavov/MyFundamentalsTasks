package classworkdemo;

import java.util.Scanner;

public class WorkersArray {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		String[] workersNames = new String[10];
		
		for (int i = 0; i < workersNames.length; i++) {
			System.out.printf("Enter %d worker's name: ", (i+1) );
			workersNames[i] = input.next();
		}
		
		System.out.println("Workers name in the way that were inputted: ");
		for (int j = 0; j < workersNames.length; j++) {
			System.out.print(workersNames[j] + "\n");
		}
		
		System.out.println("Workers name backwards: ");
		for (int k = workersNames.length - 1; k > 0; k--) {
			System.out.print(workersNames[k] + "\n");
		}
		input.close();
	}

}
