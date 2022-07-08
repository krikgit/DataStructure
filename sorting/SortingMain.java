package self.learn.sorting;

//1. Easiest way with O(n^2)
public class SortingMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortingFactory sortingStyle = new SortingFactory();
		
		SortingAlgo algo = null;
		
		int [] myArr = new int[]{6,7,1,2,9,3,0};
		
		System.out.print("Before sorting:");
		Utility.display(myArr);
			
		
		System.out.print("\n===Applying bubble sort=== ");
		algo =  sortingStyle.getSortingPattern("bubble");
		algo.sort(myArr);
		System.out.print("\nAfter sorting:");
		Utility.display(myArr);
		
		
		System.out.print("\n===Applying selection sort=== ");
		algo =  sortingStyle.getSortingPattern("selection");
		algo.sort(myArr);
		System.out.print("\nAfter sorting:");
		Utility.display(myArr);
		
		
		System.out.print("\n===Applying insertion sort=== ");
		algo =  sortingStyle.getSortingPattern("insertion");
		algo.sort(myArr);
		System.out.print("\nAfter sorting:");
		Utility.display(myArr);
		
		
		System.out.print("\n===Applying shell sort=== ");
		algo =  sortingStyle.getSortingPattern("shell");
		algo.sort(myArr);
		System.out.print("\nAfter sorting:");
		Utility.display(myArr);
		
		
		System.out.print("\n===Applying merge sort=== ");
		algo = sortingStyle.getSortingPattern("merge");
		algo.sort(myArr);
		System.out.print("\nAfter sorting:");
		Utility.display(myArr);
		
		
		System.out.print("\n===Applying quick sort=== ");
		algo = sortingStyle.getSortingPattern("quick");
		algo.sort(myArr);
		System.out.print("\nAfter sorting:");
		Utility.display(myArr);
		
		
		System.out.print("\n===Applying counting sort=== ");
		algo = sortingStyle.getSortingPattern("counting");
		int [] mySplArr = new int[]{2,5,9,8,2,8,7,10,4,3};
		System.out.print("\nBefore sorting:");
		Utility.display(mySplArr);
		algo.sort(mySplArr);
		System.out.print("\nAfter sorting:");
		Utility.display(mySplArr);
		
		
		System.out.print("\n===Applying radix sort=== ");
		algo = sortingStyle.getSortingPattern("radix");
		int [] mySplRadArr = new int[]{4725,4586,1330,8792,1594,5729};
		System.out.print("\nBefore sorting:");
		Utility.display(mySplRadArr);
		algo.sort(mySplRadArr);
		System.out.print("\nAfter sorting:");
		Utility.display(mySplRadArr);
		
		
		System.out.print("\n===Applying JDK sort method=== ");
		algo = sortingStyle.getSortingPattern("jdk_thread");
		algo.sort(myArr);
		System.out.print("\nAfter sorting:");
		Utility.display(myArr);
		
	}

}
