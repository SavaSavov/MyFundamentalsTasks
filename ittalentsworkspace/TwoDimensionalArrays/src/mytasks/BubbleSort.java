package mytasks;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		

		int[] arr = { 45, 3, 8, 123, 5, 345, 678};
		
		System.out.println(Arrays.toString(bubbleSort(arr)));
		
		int[] arr1 = { 45, 3, 8, 123, 5, 345, 678};
		
		selectionSort(arr1);
		
		System.out.println(Arrays.toString(arr1));

	}
	
	static int[] bubbleSort(int[] arr){
		
		for (int indexA = 0; indexA < arr.length; indexA++) {
			boolean hasSwap = false;
			for (int indexB = 0; indexB < arr.length - 1 - indexA; indexB++) {
				if(arr[indexB] > arr[indexB + 1]){
					int temp = arr[indexB];
					arr[indexB] = arr[indexB + 1];
					arr[indexB + 1] = temp;
					hasSwap = true;
				}
			}
			
			if(!hasSwap){
				break;
			}
		}
		
		return arr;
	}
	
	static void selectionSort(int[] arr){
		
		int start = 0;
		int end = arr.length - 1;
		

		
		for (int sortedIndex = 0; sortedIndex < arr.length / 2; sortedIndex++) {
			
			int maxIndex = start;
			int minIndex = start;
					
			for (int index = start; index <= end; index++) {
				
				if (arr[index] > arr[maxIndex]) {
					maxIndex = index;
				} else {

					if (arr[index] < arr[minIndex]) {
						minIndex = index;
					}
				}
			}
				
				int temp = arr[maxIndex];
				arr[maxIndex] = arr[end];
				arr[end] = temp;
				
				if(minIndex == end){
					minIndex = maxIndex;
				}
				
				temp = arr[minIndex];
				arr[minIndex] = arr[start];
				arr[start] = temp;
				
				end--;
				start++;
			
		}
	}
}
