package bookexmethodsandrecursion;

public class MethodUnifyingTwoArrs {

	public static void main(String[] args) {
		
		int[] arrA = {12, 23, 2, 45, 34}; 
		int[] arrB = {1, 223, 52, 405, 3};
		
		int[] arrC = unifyTwoArr(arrA, arrB);
		
		System.out.println("The unified array is:");
		
		for (int index = 0; index < arrC.length; index++) {
			System.out.print(arrC[index] + " ");
		}

	}
	
	public static int[] unifyTwoArr(int[] arrA, int[] arrB){
		
		int size = (arrA.length + arrB.length);
		int[] arrC = new int[size];
		
		int indexA;
		
		for (indexA = 0; indexA < arrA.length; indexA++) {
			arrC[indexA] = arrA[indexA];
		}
		
		for (int indexB = 0; indexB < arrB.length; indexB++) {
			arrC[indexA++] = arrB[indexB];
		}
		
		return arrC;
	}

}
