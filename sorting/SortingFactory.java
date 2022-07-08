package self.learn.sorting;

public class SortingFactory {
	
	public SortingAlgo getSortingPattern(String sortStyle) {
		
		SortingAlgo algo = null;
		
		if (sortStyle.equalsIgnoreCase("bubble")) {
			
			algo = new BubbleSort();
			
		}else if (sortStyle.equalsIgnoreCase("selection")) {
			
			algo = new SelectionSort();
			
		}else if (sortStyle.equalsIgnoreCase("insertion")) {
			
			algo = new InsertionSort();
			
		}else if (sortStyle.equalsIgnoreCase("shell")) {
			
			algo = new ShellSort();
			
		}else if (sortStyle.equalsIgnoreCase("merge")) {
			
			algo = new MergeSort();
			
		}else if (sortStyle.equalsIgnoreCase("quick")) {
			
			algo = new QuickSort();
			
		}else if (sortStyle.equalsIgnoreCase("counting")) {
			
			algo = new CountingSort();
			
		}else if (sortStyle.equalsIgnoreCase("radix")) {
			
			algo = new RadixSort();
			
		}else if (sortStyle.equalsIgnoreCase("jdk")) {
			
			algo = new JDK_API_Sorting();
			
		}else if (sortStyle.equalsIgnoreCase("jdk_thread")) {
			
			algo = new JDK_API_Thread_Sorting();
			
		}
		return algo;
		
	}

}
