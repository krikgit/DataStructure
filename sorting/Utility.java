package self.learn.sorting;

public class Utility {
	
	public static void swap(int[] arr, int i, int j) {
		
		int temp = 0;
		
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void display(int arr[]) {
		for (int i:arr) {
			System.out.print(i+" ");
		}
	}

}
