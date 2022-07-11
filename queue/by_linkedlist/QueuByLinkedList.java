package self.learn.ds.queue.by_linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class QueuByLinkedList<E> {
	
	LinkedList<E> queue = new LinkedList<>();
	
	public int getSize() {
		return queue.size();
	}
	
	
	public void addData(E e) {
		queue.addLast(e);
	}
	
	public E removeData() {
		return queue.removeFirst();
	}
	
	public E peek() {
		return queue.peekFirst();
	}
	
	public void printQueue() {
		ListIterator<E> listIterator = queue.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

}
