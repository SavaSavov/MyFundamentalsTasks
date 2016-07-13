package bookexmethodsandrecursion;

import java.util.Arrays;

public class FindingBiggestAndSmallestElWithRecursion {

	public static void main(String[] args) {
		

		int[] arr = {67, -65, 1, 2, 3, 4, 5, 6};
		
		System.out.println(findSmallestEl(arr, 0));
		
		System.out.println(findLargest(arr, 0));
		
		System.out.println(Arrays.toString(bubbleSort(arr)));
		
		binarySearch(arr, 67);

	}
	
	static int  findSmallestEl(int[] arr, int index){
		
		if(index >= arr.length - 1){
			return arr[index];
		}
		
		int smallest = findSmallestEl(arr, index + 1);
		
		if(arr[index] < smallest){
			return arr[index];
		}else{
			return smallest;
		}
							
	}
	
	static int findLargest(int[] arr, int index){
		
		if(index >= arr.length - 1){
			return arr[index];
		}
		
		int biggestEl = findLargest(arr, index + 1);
		
		if(arr[index] > biggestEl){
			return arr[index];
		}else{
			return biggestEl;
		}
	}
	
	static int[] bubbleSort(int[] arr){
		
		for (int indexA = 0; indexA < arr.length; indexA++) {
			boolean flag = false;
			for (int indexB = 0; indexB < arr.length - 1 - indexA; indexB++) {
				if(arr[indexB] > arr[indexB + 1]){
					int temp = arr[indexB];
					arr[indexB] = arr[indexB + 1];
					arr[indexB + 1] = temp;
					flag = true;
				}
			}
			
			if(!flag){
				break;
			}
		}
		
		return arr;
	}
	
	static void binarySearch(int[] arr, int num){
		
		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last) / 2;
		
		while(first <= last){
			if(num > arr[middle]){
				first = middle + 1; 
			}else{
				if(num == arr[middle]){
					System.out.println(middle + 1);
					break;
				}else{
					last = middle - 1;

				}
				
			}
			middle = (first + last) / 2;
		}
		
		if(first > last){
			System.out.println("The element is not found.");
		}
	}

}
