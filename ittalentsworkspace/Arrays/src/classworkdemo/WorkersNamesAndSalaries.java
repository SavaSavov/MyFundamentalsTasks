package classworkdemo;

import java.util.Scanner;

public class WorkersNamesAndSalaries {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int numberOfWorkers = 10;
		
		String[] workersNames = new String[numberOfWorkers];
		float[] workersSalaries = new float[numberOfWorkers];
		
		for (int index = 0; index < workersNames.length; index++) {
			System.out.println("Enter " + (index + 1) + " worker's name: ");
			workersNames[index] = input.next();

			System.out.printf("Enter " + (index + 1) + " worker's salary: ");
			workersSalaries[index] = input.nextFloat();
		}
		
		String name = "";
		float maxSalary = Float.MIN_VALUE;
		
		for (int index = 0; index < workersSalaries.length; index++) {
			if(workersSalaries[index] > maxSalary){
				maxSalary = workersSalaries[index];
				name  = workersNames[index];
			}
		}
		
		System.out.println("The worker with the highest salary " + maxSalary + " name is " + name);
		
		float minSalary = Float.MAX_VALUE;
		
		for (int index = 0; index < workersSalaries.length; index++) {
			if(workersSalaries[index] < minSalary){
				minSalary = workersSalaries[index];
				name  = workersNames[index];
			}
		}
		
		System.out.println("The worker with the minimal salary " + minSalary + " name is " + name);
		
		float sumOfSalaries = 0.0F;
		
		for (int index = 0; index < workersSalaries.length; index++) {
				sumOfSalaries += workersSalaries[index];
		}
		
		System.out.println("The sum of the salaries of all workers is: " + sumOfSalaries );
		
		float average = sumOfSalaries / numberOfWorkers;
		
		System.out.println("The average salary is: "  + average);
		input.close();

	}

}
