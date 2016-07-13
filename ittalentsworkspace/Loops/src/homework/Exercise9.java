package homework;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int sum = 0;
		int power = 1;
		
		System.out.println("Enter first integer number: ");
		a = input.nextInt();
		
		System.out.println("Enter second integer number: ");
		b = input.nextInt();
		
		while (a <= b) {
			power = a * a;
			if (power % 3 != 0) {
				System.out.print(power + ", ");
				if (sum + power < 200) {
					sum += power;
					a++;
				} else {
					break;
				}
			} else {
				System.out.print(" Skipping " + power + ", ");
				a++;
				continue;
			}
		}
		System.out.println();
		System.out.println(" The sum is: "+sum);
		input.close();
	}

}
