package self.learn.sorting;

/**
 * @author krimanda1
 * 
 * Time complexity : O(n^2)
 *
 */

public class InsertionSort implements SortingAlgo {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			
			int newElement = arr[i];
			int j;
			
			for (j = i; j > 0 && arr[j-1] > newElement; j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = newElement;
		}

	}

}
