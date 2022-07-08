package self.learn.ds.linkedlist.singly.generic;

public class SinglyLinkedList<E> {

	// Represent a node of the singly linked list
	@SuppressWarnings("hiding")
	class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//Represent the head and tail of the singly linked list    
    public Node<E> head = null;    
    public Node<E> tail = null; 
    
    /* ===== adding new node to the linked list ===== */
    public void addNode(E i) {
    	//creating node
    	Node<E> newNode = new Node<E>(i);
    	
    	//checking if node is null
    	if(head == null) {
    		head = newNode;
    		tail = newNode;
    	}//if not null then pointing simulation 
    	else {
    		//newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			
			//newNode will become new tail of the list 
			tail = newNode;
		}
    }
    
    
    /* =====displaying node===== */
    public void displayList() {
    	Node<E> current = head;
    	if (head == null) {
			System.out.print("List is empty!");
		}
    	System.out.print("Nodes of singly linked list: ");  
    	while (current != null) {
			System.out.print( current.data +" ");
			current = current.next;
		}
    	System.out.println();
    }
    
    /* =====search element in list===== */
    public int searchList(Integer element) {
    	int index = 0;
    	
    	Node<E> current = head;
    	if (current == null) {
			index = -1;
		}else {
			while (current != null) {
				if (current.data == element) {
					index = 1000;
					break;
				}else {
					current = current.next;
					index = 999;
				}
			}
		}
    	
    	return index;
    }
    
    /* =====get first element===== */
    public E getFirst() throws Exception {
    	
    	E data;
    	Node<E> current = head;
    	
    	if (current != null) {
			data = current.data;
		}else {
			throw new Exception("Empty List");
		}
		return data;
		
    }
    
    /* =====get last element===== */
	public E getLast() throws Exception {
		
		if (head == null) {
			throw new Exception("Empty list!");
		}
		
		Node<E> tempNode = head;
    	
    	while (tempNode.next != null) {
			tempNode = tempNode.next;
		}
    	
		return tempNode.data;
		
    }
	
	/* ===== sort linked list ===== */
	public void sort() {
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
		list.addNode(3);
		list.addNode(9);
		list.addNode(5);
		
		list.displayList();
		
		int p = list.searchList(7);
		
		String state = p == -1 ? "List is empty!" : p == 1000 ? "Item found!" : "Element not found!" ;
		
		System.out.println(state);
		
		System.out.println("First Node data:"+list.getFirst());
		
		System.out.println("Last Node data:"+list.getLast());
		
	}
	
	

}
