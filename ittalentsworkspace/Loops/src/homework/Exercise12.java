package homework;

public class Exercise12 {

	public static void main(String[] args) {


		int number = 100;
		
		while(number < 1000){
			int temp = number;
			
			int numberOfHundreds = temp / 100 % 10;
			int numberOfTens = temp / 10 % 10;
			int numberOfUnits = temp % 10;
			
			if (numberOfHundreds != numberOfTens && numberOfHundreds != numberOfUnits && numberOfTens != numberOfUnits) {
				System.out.print(temp + ", ");
			}
			number++;
		}

	}

}
