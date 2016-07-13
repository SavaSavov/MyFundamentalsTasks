package homework;

public class Exercise20 {

	public static void main(String[] args) {

		int count = 1;
		for (int indexI = 0; indexI < 10; indexI++) {
			for (int indexJ = 0; indexJ < 10; indexJ++) {
				if (count == 10) {
					count = 0;
				}
				System.out.print(count);
				count++;
			}
			System.out.println();
			count++;
		}

	}

}
