package classworkdemo;

import java.util.Scanner;

public class AverageTemperatureForMonth {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int size = 0;
		
		System.out.println("Enter the month how many days: ");
		size = input.nextInt();
		
		float[] temperatureArr = new float[size]; 
		
		for (int index = 0; index < temperatureArr.length; index++) {
			System.out.println("Enter temperature for the " + (index + 1) +  " day");
			temperatureArr[index] = input.nextFloat();
		}
		
		float sum = 0.0F;
		
		for (int index = 0; index < temperatureArr.length; index++) {
			sum += temperatureArr[index];
		}
		
		float avgTemp = sum / temperatureArr.length;
		
		System.out.println("The average temperature for this month is: "  + avgTemp);
		
		int count = 0;
		int startIndex = 0;
		int maxInterval = 0;
		
		for (int index = 0; index < temperatureArr.length; index++) {
			if(temperatureArr[index] >= avgTemp){
				count = 0;
			}else{
				count++;
				if(count > maxInterval){
					startIndex = index - count + 1;
					maxInterval = count;
				}
			}
		}
		
		System.out.println("The largest period that the temperature is less than average starts from " + (startIndex + 1) + "to" + (startIndex + maxInterval));
		
		count = 0;
		maxInterval = 0;
		startIndex = 0;
		
		for (int index = 1; index < temperatureArr.length; index++) {
		
				if (temperatureArr[index] >= temperatureArr[index - 1]) {
					count = 0;
				} else {
					count++;
					if (count > maxInterval) {
						startIndex = index - count + 1;
						maxInterval = count;
					}
				}
			}
		
		System.out.println("The largest period that the temperature is getting colder starts from " + startIndex + "to" + (startIndex + maxInterval));

		input.close();

	}

}
