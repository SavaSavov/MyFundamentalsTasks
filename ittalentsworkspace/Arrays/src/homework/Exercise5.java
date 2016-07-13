package homework;

public class Exercise5 {

	public static void main(String[] args) {
		
		int size = 10;
		int[] arr = new int[size];
		
		for (int index = 0; index < arr.length; index++) {
			arr[index] = (index*3);
		}
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}

	}

}
