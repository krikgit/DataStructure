package self.learn.sorting;

/**
 * @author krimanda1
 * 
 * Time complexity : O(nlogn)
 *
 */

public class MergeSort implements SortingAlgo {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		mergeSort(arr, 0, arr.length);
		
	}
	
	public void mergeSort(int arr[], int start, int end) {
		
		if (end - start <2) { //one element
			return;
		}
		
		//partitioning
		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		merge(arr, start,mid, end);
	}
	
	//merge
	public void merge(int [] arr, int start, int mid, int end) {
		
		if (arr[mid-1] <= arr[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0; 
		
		int[] temp = new int[end - start];
		while (i<mid && j<end) {
			temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		System.arraycopy(arr, i, arr, start + tempIndex, mid -i);
		System.arraycopy(temp, 0, arr, start, tempIndex);
	}

}
