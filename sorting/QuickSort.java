package self.learn.sorting;

/**
 * @author krimanda1
 * 
 * Time complexity : O(nlogn)
 *
 */

public class QuickSort implements SortingAlgo{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		quickSort(arr, 0, arr.length);
	}
	
	public void quickSort(int arr[], int start, int end) {
		
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(arr,start,end);
		quickSort(arr, start, pivotIndex);
		quickSort(arr, pivotIndex+1, end);
		
	}

	private int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		//using start index as pivot
		int pivot = arr[start];
		int i = start;
		int j = end;
		
		while (i<j) {
			
			while (i<j && arr[--j] >= pivot);
			if (i<j) {
				arr[i] = arr[j];
			}
			
			while (i<j && arr[++i] <= pivot);
			if (i<j) {
				arr[j] = arr[i];
			}
		}
		
		arr[j] = pivot;
		return j;
	}

}
