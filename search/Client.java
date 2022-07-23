package self.learn.ds.search;

public class Client {
	
	public static void main(String[] args) {
		int [] arr = new int[] {5, 7, 3, 9, 1, 0};
		
		final String LINEAR_SEARCH = "L";
		final String BINARY_SEARCH = "B";
		
		final int successElement = 9;
		final int failedElement = 77;
		
		
		Searching searchRouter = SearchRouter.router(LINEAR_SEARCH);
		searchRouter.search(arr, successElement);
		searchRouter.search(arr, failedElement);
		
		searchRouter = SearchRouter.router(BINARY_SEARCH);
		searchRouter.search(arr, successElement);
		searchRouter.search(arr, failedElement);
		
		BinarySearch.recursivelySearch(arr, successElement);
		
	}

}
