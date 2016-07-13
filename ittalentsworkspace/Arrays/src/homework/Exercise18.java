package homework;

public class Exercise18 {

	public static void main(String[] args) {

		
		int[] arrA = {18,19,32,1,3, 4, 5, 6, 7, 8};
		int[] arrB = {1, 2, 3,4,5,16,17,18,27,11};
		
		int size = arrA.length;
		int[] resultArr = new int[size];
		
		System.out.println("Elements of the first array are:\n");
		
		for (int index = 0; index < arrA.length; index++) {
			System.out.print(arrA[index] + " ");
		}
		
		System.out.println("\n\nElements of the second array are:\n");
		
		for (int index = 0; index < arrB.length; index++) {
			System.out.print(arrB[index] + " ");
		}
		
		for (int index = 0; index < resultArr.length; index++) {
			if(arrA[index] > arrB[index]){
				resultArr[index] = arrA[index];
			}else{
				resultArr[index] = arrB[index];
			}
		}
		
		System.out.println("\n\nElements of the result array are:\n");
		
		for (int index = 0; index < resultArr.length; index++) {
			System.out.print(resultArr[index] + " ");
		}

	}

}
