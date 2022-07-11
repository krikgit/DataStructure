package self.learn.ds.queue.by_array;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * @author krimanda1
 *
 * @param <E>
 * 
 * There is some discrepancies in this approach of add method
 */
public class Queue<E> {
	
	private Employee [] queue;
	private int front;
	private int back;
	private long size;
	
	public Queue( int capacity) {
		queue = new Employee[capacity];
	}
	
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public long getSize() {
		return back-front;
	}
	
	public long getCapacity() {
		return queue.length;
	}
	
	
	/*
	 * If we continuously add and remove elements 
	 * every time the array size will be increased
	 * Thats why another approach is there
	 * 
	 */ 
	public void addDataToBack( Employee data) {
		
		if (back == queue.length) {
			Employee[] empArr = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, empArr, 0, queue.length);
			queue = empArr;
			
		}
		queue[back] = data;
		back++;
	}
	
	
	public Employee removeDataFromFront() {
		if(getSize() == 0) {
			throw new EmptyStackException();
		}
		Employee removedEmployee = queue[front];
		queue[front] = null;
		front++;
		if(getSize() == 0) {
			front = 0;
			back = 0;
		}
		return removedEmployee;
	}
	
	public Employee peek() {
		if(getSize() ==0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public void printQueue() {
		if (getSize() ==0) {
			System.out.println("Empty Queue");
		}else if (getSize() == 1) {
			System.out.print(queue[front]);
		}else {
			for (int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
	}

}
