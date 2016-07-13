package homework;

import java.util.Scanner;

public class Exersice10 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int volume;
		
		System.out.println("Enter the volume of the tank? ");
		volume = input.nextInt();
		int temp = volume;

		int bucketA = 0;
		int bucketB = 0;  

		while (temp > 0) {
			if (temp >= 7) {
				temp = temp - 5;
				bucketA++;
				bucketB++;
			}else if (temp < 7) {
				if (temp % 3 == 0) {
					temp = temp - 3;
					bucketB++;
				}else if (temp % 2 == 0) {
					temp = temp - 2;
					bucketA++;
				}
			}
		}
		int diff = bucketA - bucketB;
		
		System.out.printf("To fill %d L tank ",volume);
		
		if(diff == 0){
			System.out.println("I'll use " + bucketA + " buckets from 2 and 3 litres.");
		}
		if(diff > 0){
			System.out.println("I'll use " + bucketB + " buckets from 2l and 3l litres and "+ diff + " buckets from 2 litres.");
		}
		if(diff < 0){
			System.out.println("I'll use " + bucketA + " buckets from 2 and 3 litres and "+(diff*(-1)) + " buckets from 3 litres.");
		}
		
		input.close();

	}

}
