package homework;

public class Exercise16 {

	public static void main(String[] args) {
		

		double[] arr = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
		
		double[] resultArr = new double[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int temp = i + 1;
			if (arr[i] < -0.231) {
				resultArr[i] = (temp * temp) + 41.25;
			} else {
				resultArr[i] = temp * arr[i];
			}
		}
		
		System.out.println("Elements of the original array are:\n");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + "  ");
		}
		
		System.out.println("\n\nElements of the array after modification are:\n");
		for (int index = 0; index < resultArr.length; index++) {
			System.out.print(resultArr[index] + "  ");
		}

	}

}
