package self.learn.sorting;

/**
 * @author krimanda1
 * 
 * Time complexity : O(n^2)
 *
 */
public class ShellSort implements SortingAlgo {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int gap = arr.length/2; gap > 0 ; gap /=2){
			
			for (int i = gap; i < arr.length; i++) {
				int newElement = arr[i];
				int j = i;
				while (j >= gap && arr[j-gap] > newElement) {
					arr[j] = arr[j-gap];
					j -= gap;
				}
				arr[j] = newElement;
			}
			
		}

	}

}
