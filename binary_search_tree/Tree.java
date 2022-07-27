package self.learn.ds.binary_search_tree;

public class Tree {
	private TreeNode root;
	
	public void insert(int value) {
		
		if (root == null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
		
	}
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		// TODO Auto-generated method stub
		if (subtreeRoot == null) {
			return subtreeRoot;
		}
		
		if (value < subtreeRoot.getData()) {
			subtreeRoot.setLeftNode(delete(subtreeRoot.getLeftNode(), value));
		}else if (value > subtreeRoot.getData()) {
			subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), value));
		}else {
			
			if (subtreeRoot.getLeftNode() == null) {
				return subtreeRoot.getRightNode();
			}else if (subtreeRoot.getRightNode() == null) {
				return subtreeRoot.getLeftNode();
			}
				subtreeRoot.setData(subtreeRoot.getRightNode().getMin());
				subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), subtreeRoot.getData()));
		}
		
		return subtreeRoot;
	}

	public TreeNode search(int val) {
		if (root != null) {
			return root.search(val);
		}
		return null;
	}
	
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		return root.getMin();
	}
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		return root.getMax();
	}
	
	public void inOrderTraversal() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
	public void preOrderTraversal() {
		if (root != null) {
			root.traversePreOrder();
		}
	}
	
	public void postOrderTraversal() {
		if (root != null) {
			root.traversePostOrder();
		}
	}
}
