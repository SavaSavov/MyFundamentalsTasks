package homework;

public class Exercise2 {

	public static void main(String[] args) {

		
		int[] arrA = { 5, 7, 23, 78, 12, 7, 9, 12 };
		
		System.out.println("The original array is:\n");

		for (int index = 0; index < arrA.length; index++) {
			System.out.print(arrA[index] + " ");
		}
		
		int[] arrB = new int[(2*arrA.length)];
		int indexA = arrA.length - 1;
		
		for (int index = 0; index < arrB.length; index++) {
			if (index < arrA.length) {
				arrB[index] = arrA[index];
			}else{
				if(indexA >= 0){
				arrB[index] = arrA[indexA];
				indexA--;
				}
			}
		}

		System.out.println("\n\nThe result array is:\n");

		for (int index = 0; index < arrB.length; index++) {
			System.out.print(arrB[index] + " ");
		}

	}

}
