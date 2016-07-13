package additionaltasks;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {23, 12, -34, 56, 3, 45, -345};
		quickS(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));

	}
	
	static int partition(int[] arr, int start, int end){
		
		int randomIndex = (int) (Math.random())*(end - start + 1) + start;
		int temp = arr[end];
		arr[end] = arr[randomIndex];
		arr[randomIndex] = temp;
		
		int pivot = arr[end];
		int pos = start - 1;
		
		for (int index = start; index <= end; index++) {
			if(arr[index] <= pivot){
				pos++;
				
				temp = arr[index];
				arr[index] = arr[pos];
				arr[pos] = temp;
			}
		}
		
		return pos;
		
	}
	
	static void quickSort(int[] arr, int start, int end){
		if(start >= end){
			return;
		}
		
		int pos = partition(arr, start, end);
		quickSort(arr, start, pos - 1);
		quickSort(arr, pos + 1, end);
		
	}
	
	static int partition2(int[] arr, int start, int end){
		
		int randomIndex = (int) Math.random()*(end - start + 1) + start;
		
		int temp = arr[end];
		arr[end] = arr[randomIndex];
		arr[randomIndex] = temp;
		
		int pivot = arr[end];
		int pos = start - 1;
		
		for (int index = start; index <= end; index++) {
			if(arr[index] <= pivot){
				pos++;
				
				temp = arr[index];
				arr[index] = arr[pos];
				arr[pos] = temp;
			}
		}
		
		return pos;
	}
	
	static void quickS(int[] arr, int start, int end){
		
		if(start >= end){
			return;
		}
		
		int pos = partition2(arr, start, end);
		quickS(arr, start, pos - 1);
		quickS(arr, pos + 1, end);
	}

}
