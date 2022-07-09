package self.learn.ds.stack.by_linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author krimanda1
 * 
 * Recommended when array needed to be resized frequently
 *
 */
public class StackByLinkedList {
	
	private LinkedList<Employee> stack;

	public StackByLinkedList() {
		stack = new LinkedList<>();
	}
	
	public void addElement(Employee e) {
		stack.push(e);
	}
	
	public Employee popElement() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	

}
