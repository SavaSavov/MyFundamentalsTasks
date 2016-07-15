package homework;

public class Exercise11 {

	public static void main(String[] args) {
		

		int[] arr = { 23, 34, 2, 6, 67, 1, 9 };
		
		printArr(arr);

	}
	
	static void printArr(int[] arrX){
		
		for (int index = 0; index < arrX.length; index++) {
			if (index != arrX.length - 1) {
				System.out.print(arrX[index] + ", ");
			} else {
				System.out.print(arrX[index]);
			}
		}
	}

}
