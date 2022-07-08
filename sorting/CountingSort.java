package self.learn.sorting;



/**
 * @author krimanda1
 * 
 * Works only on non negative discrete value(not applicable for float)
 *
 */
public class CountingSort implements SortingAlgo {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		countingSort(arr, 1, arr.length);

	}
	
	public void countingSort(int arr[], int min, int max) {
		int [] countArray = new int[(max-min)+1];
		
		for (int i = 0; i < arr.length; i++) {
			countArray[arr[i] - min]++;
		}
		
		int j = 0;
		for (int i = min; i <= max ; i++) {
			while (countArray[i-min] > 0) {
				arr[j++] = i;
				countArray[i-min]--;
			}
		}
	}

}
