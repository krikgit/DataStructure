package self.learn.sorting;

/**
 * @author krimanda1
 * 
 * Time complexity : O(n^2)
 *
 */
class BubbleSort implements SortingAlgo{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {

					Utility.swap(arr, j, j+1);
										
				}
				
			}
		}
		
	}
	
}
