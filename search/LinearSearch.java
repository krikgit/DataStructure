package self.learn.ds.search;

public class LinearSearch implements Searching {

	@Override
	public void search(int[] arr, int element) {
		// TODO Auto-generated method stub
		int state = 999;
		for(int i = 0;i<arr.length; i++) {
			if(arr[i] == element) {
				state = i;
				break;
			}
		}
		if (state == 999) {
			System.out.println("Linear Search:Element "+element+" is not found in the provided array.");
		}else {
			System.out.println("Linear Search:Element "+element+" is found in the index "+state+" of the array.");
		}

	}

}
