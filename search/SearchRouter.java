package self.learn.ds.search;

public class SearchRouter {
	
	private static Searching search = null;
	
	
	public static Searching router(String searchMethod) {
		
		if (searchMethod.equalsIgnoreCase("L") || searchMethod.equalsIgnoreCase("Linear")) {
			search = new LinearSearch();
		}else if (searchMethod.equalsIgnoreCase("B") || searchMethod.equalsIgnoreCase("Binary")) {
			search = new BinarySearch();
		}
		
		return search;
	}

}
