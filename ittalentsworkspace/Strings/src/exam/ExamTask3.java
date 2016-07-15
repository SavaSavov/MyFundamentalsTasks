package exam;

public class ExamTask3 {

	public static void main(String[] args) {
		

		int[] arr = {33, 12, 5, 34, 23, 3};
		
		System.out.println(findSum(arr, 0, 0));

	}
	
	static int findSum(int[] arr, int index, int sum){
		
		if(index >= arr.length){
			return sum;
		}
		
		int currEl = arr[index];
		
		if(currEl % 3 == 0){
			sum += currEl;
		}
		
		return findSum(arr, index + 1, sum);
	}

}
