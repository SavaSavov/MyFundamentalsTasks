package bookexercises;

public class CheckingEquality {

	public static void main(String[] args) {
		

		int[] arrA = {12, 23, 45, 101, -1};
		int[] arrB = {-1, 101, 45, 23, 12};
		
		if (arrA.length != arrB.length) {
			System.out.println("The arrays aren't equal.");
		} else {
			for (int indexA = arrA.length - 1, indexB = 0; indexA >= 0 && indexB < arrB.length; indexA--, indexB++) {
				if (arrA[indexA] != arrB[indexB]) {
					System.out.println("The arrays have the same length but the els aren't equal");
					break;
				} else {
					if (indexA == arrA.length - 1) {
						System.out.println("The arrays are equal.");
					}
				}
			}
		}

	}

}
