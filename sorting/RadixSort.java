package self.learn.sorting;

/**
 * @author krimanda1
 * 
 * Input array must be integer or string
 * Radix and width must be same
 *
 */
public class RadixSort implements SortingAlgo{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		radixSort(arr, 10, 4);
		//hard coded
	}
	
	public void radixSort(int [] arr, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(arr,i,radix);
		}
	}
	
	private void radixSingleSort(int[] arr, int position, int radix) {
		// TODO Auto-generated method stub
		int numItems = arr.length;
		int [] countArray = new int[radix];
		
		for(int value : arr) {
			countArray[getDigit(position,value,radix)]++;
		}
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j-1]; 
		}
		
		int [] temp = new int[numItems];
		for (int tempIndex = numItems-1; tempIndex >= 0; tempIndex--) {
			temp[--countArray[getDigit(position, arr[tempIndex], radix)]] = arr[tempIndex];
		}
		
		for (int i = 0; i < numItems; i++) {
			arr[i] = temp[i];
		}
	}
	
	private int getDigit(int position, int value, int radix) {
		// TODO Auto-generated method stub
		return value/(int) Math.pow(radix, position) % radix;
	}

}
