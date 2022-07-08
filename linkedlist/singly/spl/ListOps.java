package self.learn.ds.linkedlist.singly.spl;

public class ListOps {
	
	private Node head;
	private long size;
	
	public void getSize() {
		System.out.println("Size of the list is :"+size);
	}
	
	public void addNode(Integer data){
		
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
		}else {
			node.setNextNode(head);
			head = node;
		}
		size++;
	}
	
	public void printList() {
		Node current = head;
		if (current == null) {
			System.out.println("Empty list");
		}else {
			while (current != null) {
				System.out.println(current.getData());
				current = current.getNextNode();
			}
		}
	}
	
	public void sort() {
		Node current = head;
		
	}
}
