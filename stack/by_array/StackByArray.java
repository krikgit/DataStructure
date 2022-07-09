package self.learn.ds.stack.by_array;

import java.util.EmptyStackException;

/**
 * @author krimanda1
 * 
 * if size of the list is known then only recommended
 *
 */
public class StackByArray {

	private Employee[] stack;
	private int top;
	
	public StackByArray(int capacity) {
		stack = new Employee[capacity];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void addElement(Employee employee) {
		
		if (top == stack.length) {
			Employee[] empArr = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, empArr, 0, stack.length);
			stack = empArr;
		}
		stack[top++] = employee;
	}
	
	public Employee popElement() {
		
		if (top == 0 ) {
			throw new EmptyStackException();
		}
		
		Employee employee = stack[--top]; //assigning stack top to employee and making top = top -1
		stack[top] = null;
		return employee;
		
	}
	
	public Employee peek() {
		if (top == 0 ) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public long getSize() {
		return top;
	}
	
	public void display() {
		if (top == 0) {
			System.out.println("Empty stack");
		}else {
			for (int i = top-1; i >=0; i--) {
				System.out.println(stack[i]);
			}
		}
	}

}
