package homework;

import java.util.Scanner;

public class Exersice13 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		short temperature;
		
		System.out.println("Enter temperature in the range of -100 to 100 degrees: ");
		temperature = input.nextShort();
		
		if (temperature >= -100 && temperature <= 100) {
			if (temperature < -20) {
				System.out.println("The weather is freezing cold.");
			} else if (temperature >= -20 && temperature < 0) {
				System.out.println("The weather is cold.");
			} else if (temperature >= 0 && temperature < 15) {
				System.out.println("The weather is coolly.");
			} else if (temperature >= 15 && temperature < 25) {
				System.out.println("The weather is warmly.");
			} else {
				System.out.println("The weather is hot.");
			}
		}else{
			System.out.println("You've entered invalid temperature! The temperature has to be in the range of -100 to 100 degrees!");
		}
		
		input.close();

	}

}
