package self.learn.sorting;

import java.util.Arrays;

public class JDK_API_Thread_Sorting implements SortingAlgo{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		Arrays.parallelSort(arr);
		
	}

}
