package bookexmethodsandrecursion;

import java.util.Scanner;

public class FibonachiNumberWithRecursion {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number to let program show you which is the fibonachi number: ");
		number = input.nextInt();
		
		System.out.println("The " + number + " of fibonachi is ---> " + findingFibonachiNum(number));

		input.close();
		
	}
	
	public static int findingFibonachiNum(int num){
		
		int fibo = 0;
		if(num == 1 || num == 2){
			fibo = 1;
		}else{
			fibo = findingFibonachiNum(num - 1) + findingFibonachiNum(num - 2);
		}
		
		return fibo;
	}

}
