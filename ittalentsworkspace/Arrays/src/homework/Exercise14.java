package homework;

public class Exercise14 {

	public static void main(String[] args) {
		

		double[] arr = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
		
//		first I'm representing the array which I'm going to search
		System.out.println("The array that we are going to search looks like this: ");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}

/**		afterwards I need to count how many numbers are in required range which I'm going to use
		for a size for the new result array */
		int countSize = 0;
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] >= -2.99 && arr[index] <= 2.99){
				countSize++;
			}
		}

//		I found the size and now I'm declaring and creating the new array using that variable
		
		double[] resultArr = new double[countSize];
		
		int count = 0;
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] >= -2.99 && arr[index] <= 2.99){
				resultArr[count] = arr[index];
				count++;
			}
		}

//		representation of the new array with the values in the required range
		System.out.println("\nThe numbers that are in the required range are: ");
		
		for (int index = 0; index < resultArr.length; index++) {
			System.out.print(resultArr[index] + " ");
		}

	}

}
