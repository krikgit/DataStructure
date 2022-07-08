package self.learn.sorting;

/**
 * @author krimanda1
 * 
 * Time complexity : O(n^2)
 *
 */

class SelectionSort implements SortingAlgo{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = arr.length-1; i>0; i--) {
			int largest = 0;
			for (int j = 1; j <= i; j++) {
				if(arr[j]>arr[largest]) {
					largest = j;
				}
			}
			Utility.swap(arr, i, largest);
		}
		
	}
	
}
