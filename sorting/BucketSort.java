package self.learn.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort implements SortingAlgo {

	@SuppressWarnings("unchecked")
	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> [] bucket = new List[10];
		
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = new ArrayList<>(); //we can write linkedlist/vector as well
		}
		
		for (int i = 0; i < arr.length; i++) {
			bucket[hashed(arr[i])].add(arr[i]);
		}
		
		for (List<Integer> list : bucket) {
			Collections.sort(list);
		}
		
		int j=0;
		for (int i = 0; i < bucket.length; i++) {
			for (int val : bucket[i]) {
				arr[j++] = val;
			}
		}

	}
	
	private int hashed(int val) {
		return val / (int)10;
	}

}
