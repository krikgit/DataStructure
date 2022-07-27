package self.learn.ds.binary_search_tree;

public class BST_Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.insert(25);
		tree.insert(20);
		tree.insert(15);
		tree.insert(27);
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);
		tree.insert(17);
		
		System.out.println("In order :");
		tree.inOrderTraversal();
		
		System.out.println("\nPre order :");
		tree.preOrderTraversal();
		
		System.out.println("\nPost order :");
		tree.postOrderTraversal();
		
		System.out.print("\nSearched for 27:");
		System.out.println(tree.search(27).getData() == 27 ? "Found" : "Not Found");
		
		System.out.print("Searched for 31:");
		System.out.println(tree.search(27).getData() == 31 ? "Found" : "Not Found");
		
		System.out.println("Min of tree:"+tree.min());
		System.out.println("Max of tree:"+tree.max());
		
		tree.delete(25);
		System.out.println("After deletion in order :");
		tree.inOrderTraversal();
		
	}

}
