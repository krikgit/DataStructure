package self.learn.ds.linkedlist.doubly;

public class DoublyLinkedlist<E> {

	private Node<E> headNode;
	private Node<E> tailNode;
	private long size = 0;
	
	public void addNodeToFront(E data) {
		
		Node<E> create = new Node<>(data);
		//Case 1: Empty List
		if (tailNode == null) {
			tailNode = create;
		}else {
			//Case 2: list is not empty
			create.setNext(headNode);
			headNode.setPrev(create);
			create.setPrev(null);
			Node<E> tempNode = create;
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tailNode = tempNode;
			
		}
		headNode = create;
		size++;
	}
	
	public void addNodeToEnd(E data) {
		Node<E> node = new Node<>(data);
		
		if (tailNode == null) {
			headNode = node;
			tailNode = node;
		}else if (headNode == tailNode && headNode != null) {
			headNode.setNext(node);
			tailNode = node;
			tailNode.setPrev(headNode);
		}else {
			node.setPrev(tailNode);
			tailNode.setNext(node);
			tailNode = node;
		}
		size++;
	}
	
	public void printList() {
		System.out.print("HEAD");
		
		Node<E> current = headNode;
		
		if (tailNode == null) {
			System.out.println("->"+"NULL");
		}else if (headNode == tailNode && headNode != null) {
			System.out.print("<->"+headNode.getData().toString());
		}else {
			while (current != null) {
				System.out.print("<->"+current.getData().toString());
				current = current.getNext();
			}
		}
	}
	
	public long getSize() {
		return size;
	}
	
	public Node<E> removeNodeFromFront(){
		Node<E> removedNode = null;
		
		if (tailNode == null) {
			removedNode = null;
		}else if (headNode == tailNode && headNode != null) {
			removedNode = headNode;
			headNode = tailNode = null;
		}else {
			removedNode = headNode;
			headNode = headNode.getNext();
			headNode.setPrev(null);
		}
		size--;
		return removedNode;
	}
	
	public Node<E> deleteNodeFromEnd(){
		Node<E> deletedNode = null;
		if (headNode == null) {
			deletedNode = null;
		}else if (headNode == tailNode && headNode != null) {
			deletedNode = headNode;
			headNode = tailNode = null;
		}else {
			deletedNode = tailNode;
			tailNode = tailNode.getPrev();
			tailNode.setNext(null);
		}
		size--;
		return deletedNode;
		
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addBefore(long position, Node<E> data) {
		long index = 0;
		Node<E> curentNode = headNode;
		if (isEmpty()) {
			System.out.println("Node can not be added to the specified position as list is empty");
		}else if (position >= size || position < 0) {
			System.out.println("Node can not be added to the specified position due to invalid position");
		}else {
			while (true) {
				
				System.out.println("Index:"+index);
				if (index == position) {
					System.out.println("In "+index+" break executed -");
					break;
				}
				curentNode = curentNode.getNext();
				index++;
			}
			data.setPrev(curentNode.getPrev());
			data.setNext(curentNode);
			curentNode.setPrev(data);
			if(headNode == curentNode) {
				headNode = data;
			}else {
				data.getPrev().setNext(data);
			}
			
			size++;
		}
		
	}

}
