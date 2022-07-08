package self.learn.ds.linkedlist.doubly;

public class DoublyLinkedListOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedlist<Integer> linkedlist = new DoublyLinkedlist<>();
		
		linkedlist.addNodeToFront(1);
		linkedlist.addNodeToFront(5);
		linkedlist.addNodeToFront(7);
		linkedlist.addNodeToEnd(9);
		linkedlist.addNodeToEnd(6);
		
		
		  linkedlist.printList();
		  System.out.println("\nSize of the list:"+linkedlist.getSize());
		  System.out.println("==========================");
		 /* 
		 * System.out.println("Deleted node from front:"+linkedlist.removeNodeFromFront(
		 * ).getData()); linkedlist.printList();
		 * System.out.println("\nSize of the list:"+linkedlist.getSize());
		 * 
		 * System.out.println("Deleted node from end:"+linkedlist.deleteNodeFromEnd().
		 * getData()); linkedlist.printList();
		 * System.out.println("\nSize of the list:"+linkedlist.getSize());
		 * 
		 * System.out.println("Is the list empty:"+linkedlist.isEmpty())
		 */;
		
		linkedlist.addBefore(2, new Node<Integer>(99));
		linkedlist.printList();
		System.out.println("\nSize of the list:"+linkedlist.getSize());
		
		
		

	}

}
