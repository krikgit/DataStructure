package self.learn.ds.binary_search_tree;

public class TreeNode {
	
	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	public TreeNode(int data) {
		this.data = data;
	}
	//insertion in tree
	public void insert(int value) {
		if (value == data) {
			return; //not entering Duplicate value
		}
		if (value<data) {
			if(leftNode == null) {
				leftNode = new TreeNode(value);
			}else {
				leftNode.insert(value);
			}
		} else {
			if (rightNode == null) {
				rightNode = new TreeNode(value);
			} else {
				rightNode.insert(value);
			}
		}
	}
	
	//search in tree
	public TreeNode search(int value) {
		if (data == value) {
			return this;
		}
		
		if (value > data) {
			if(rightNode != null) {
				return rightNode.search(value);
			}
		}else {
			if (leftNode != null) {
				return leftNode.search(value);
			}
		}
		
		return null;
	}
	//get min
	public int getMin() {
		if(leftNode == null) {
			return data;
		}else {
			return leftNode.getMin();
		}
	}
	//get max
		public int getMax() {
			if(rightNode == null) {
				return data;
			}else {
				return rightNode.getMax();
			}
		}
	//inorder traversal
	public void traverseInOrder() {
		if (leftNode != null) {
			leftNode.traverseInOrder();
		}
		System.out.print(data+"  ");
		if (rightNode != null) {
			rightNode.traverseInOrder();
		}
	}
	//preorder traversal
	public void traversePreOrder() {
		System.out.print(data+"  ");
		if (leftNode != null) {
			leftNode.traversePreOrder();
		}
		if (rightNode != null) {
			rightNode.traversePreOrder();
		}
	}
	//postorder traversal
	public void traversePostOrder() {
		
		if (leftNode != null) {
			leftNode.traversePostOrder();
		}
		if (rightNode != null) {
			rightNode.traversePostOrder();
		}
		System.out.print(data+"  ");
	}
	
	//getters and setters
	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
}
