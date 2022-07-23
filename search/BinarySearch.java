package self.learn.ds.search;

import java.util.Arrays;

public class BinarySearch implements Searching {

	@Override
	public void search(int[] arr, int element) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length;
		
		Arrays.sort(arr); //as binary search required sorted array
		
		int state = 999;
		int midpoint = -1;
		
		while (start<end) {
			midpoint = (start + end)/2;
			
			if (arr[midpoint] == element) {
				state = midpoint;
				break;
			}else if (arr[midpoint]<element) {
				start = midpoint+1;
			}else {
				end = midpoint;
			}
		}
		if (state == 999) {
			System.out.println("Binary Search:The element "+element+" is not found in the array.");
		}else {
			System.out.println("Binary Search:The element "+element+" is found at position "+midpoint);
		}

	}
	
	public static void recursivelySearch(int [] arr,int searchElement ) {
		int state = recursiveSearch(arr, 0, arr.length, searchElement);	
		System.out.println(state == -1 ? "Recursive Binary search: Not found":"Recursive Binary search: found");
	}
	
	private static int recursiveSearch(int [] arr, int intialIndex, int length, int searchElement) {
		
		if (intialIndex>= length) {
			return -1;
		}
		
		int midpoint = (intialIndex + length)/2;
		
		if (arr[midpoint] == searchElement) {
			return midpoint;
		} else if (arr[midpoint] > searchElement) {
			return recursiveSearch(arr, intialIndex, midpoint, searchElement);
		} else {
			return recursiveSearch(arr, midpoint + 1, length, searchElement);
		}
		
	}

}
