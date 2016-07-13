package exercises;

import java.util.Arrays;

public class WaysOfSorting {

	public static void main(String[] args) {
		

		int[] arr1 = { 12, 34, 100, 34, 45, 56, 23 , -1000, 340, -1000, -2000};
		
		sortBubble(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(findMaxDiff(arr1));
		
		System.out.println(findMaxDiffRecursively(arr1, 0, Integer.MAX_VALUE, Integer.MIN_VALUE));
		
		int[] arr2 = { -12, 34, -100, 34, 45, 56, 23, 879, 234, -345 };
		
		sortSelection(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = { -12, -100, 34, -100, 34, 45, 34, 45, 56, 23, 879, 234, -345 , 2, 4, 7, -5};
		
		sortCounting(arr3);
		
		System.out.println(Arrays.toString(arr3));

	}
	
	static void bubbleSort(int[] arr){
		
		for (int indexA = 0; indexA < arr.length; indexA++) {
			boolean isSorted = true;
			for (int indexB = 0; indexB < arr.length - 1 - indexA; indexB++) {
				if(arr[indexB] > arr[indexB + 1]){
					int temp = arr[indexB];
					arr[indexB] = arr[indexB + 1];
					arr[indexB + 1] = temp;
					isSorted = false;
				}
			}
			
			if(isSorted){
				break;
			}
		}
	}
	
	static void selectionSort(int[] arr){
		
		for (int start = 0, end = arr.length - 1; start < arr.length / 2; start++, end--) {
			int maxEl = Integer.MIN_VALUE;
			int minEl = Integer.MAX_VALUE;
			int maxIndex = 0;
			int minIndex = 0;
			for (int index = start; index <= end; index++) {
				if(arr[index] > maxEl){
					maxEl = arr[index];
					maxIndex = index;
				}
				
				if(arr[index] < minEl){
					minEl = arr[index];
					minIndex = index;
				}
			}
			
			int temp = arr[end];
			arr[end] = arr[maxIndex];
			arr[maxIndex] = temp;
			
			if(minIndex == end){
				minIndex = maxIndex;
			}
			
			temp = arr[start];
			arr[start] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
	}
	
	static void countingSort(int[] arr){
		
		int maxEl = Integer.MIN_VALUE;
		int minEl = Integer.MAX_VALUE;
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] > maxEl){
				maxEl = arr[index];
			}
			
			if(arr[index] < minEl){
				minEl = arr[index];
			}
		}
		
		int absValue = (minEl < 0) ? minEl*(-1) : minEl;
		
		int[] countArr = new int[maxEl + 1 + absValue];
		
		for (int index = 0; index < arr.length; index++) {
			int value = arr[index] + absValue;
			countArr[value]++;
		}
		
		int count = 0;
		
		for (int index = 0; index < countArr.length; index++) {
			int countOcc = countArr[index];
			while(countOcc > 0){
				arr[count++] = index - absValue; 
				countOcc--;
			}
		}
	}
	
	static int findMaxDiff(int[] arr){
		
		 int maxDiff = arr[1] - arr[0];
		 int min = arr[0];
		 
		  for(int i = 1; i < arr.length; i++){
		       
		    if (arr[i] - min > maxDiff){                               
		      maxDiff = arr[i] - min;
		    }
		    if (arr[i] < min){
		    	min = arr[i]; 
		    }
		  }
		  
		  return maxDiff;

	}
	
	static int findMaxDiffRecursively(int[] arr, int index, int min, int max) {

		int maxDiff = max - min;
		if (index >= arr.length) {
			return maxDiff;
		}

		if (arr[index] > max) {
			max = arr[index];
		}

		if (arr[index] < min) {
			min = arr[index];
		}

		return findMaxDiffRecursively(arr, index + 1, min, max);

	}
		
	static void sortBubble(int[] arr){
		
		for (int indexA = 0; indexA < arr.length; indexA++) {
			boolean isSorted = true;
			for (int indexB = 0; indexB < arr.length - 1 - indexA; indexB++) {
				if(arr[indexB] > arr[indexB + 1]){
					int temp = arr[indexB];
					arr[indexB] = arr[indexB + 1];
					arr[indexB + 1] = temp;
					isSorted = false;
				}
			}
			
			if(isSorted){
				break;
			}
		}
	}
	
	static void sortSelection(int[] arr){
		
		for (int start = 0, end = arr.length - 1; start < (arr.length / 2); start++, end--) {
			int maxEl = Integer.MIN_VALUE;
			int minEl = Integer.MAX_VALUE;
			int minIndex = start;
			int maxIndex = start;
			for (int index = start; index <= end; index++) {
				
				if(arr[index] > maxEl){
					maxEl = arr[index];
					maxIndex  = index;
				}
				
				if(arr[index] < minEl){
					minEl = arr[index];
					minIndex  = index;
				}
			}
			
			int temp = arr[end];
			arr[end] = arr[maxIndex];
			arr[maxIndex] = temp;
			
			if(minIndex == end){
				minIndex = maxIndex;
			}
			
			temp = arr[start];
			arr[start] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	static void sortCounting(int[] arr){
		
		int maxEl = Integer.MIN_VALUE;
		int minEl = Integer.MAX_VALUE;
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] > maxEl){
				maxEl = arr[index];
			}
			
			if(arr[index] < minEl){
				minEl = arr[index];
			}
		}
		
		int absVal = (minEl < 0) ? (-1)*minEl : minEl;
		
		int[] countArr = new int[maxEl + 1 + absVal];
		
		for (int index = 0; index < arr.length; index++) {
			int value = arr[index] + absVal;
			countArr[value]++;
		}
		
		int count = 0;
		
		for (int index = 0; index < countArr.length; index++) {
			int countOcc = countArr[index];
			
			while (countOcc > 0) {
				arr[count++] = index - absVal;
				countOcc--;				
			}
		}
	}
	
}
