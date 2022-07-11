package self.learn.ds.queue.by_array;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class CircularQueue {
	private Employee [] queue;
	private int front;
	private int back;
	private int size;
	
	public CircularQueue( int capacity) {
		queue = new Employee[capacity];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		if (front <= back) {
			return back - front;
		}else {
			return back-front + queue.length;
		}
	}
	
	public long getCapacity() {
		return queue.length;
	}
	/* Demonstration
	 *  // 0   jane
        // 1    john
        // 2  -   -back
        // 3  -mike - front
        // 4   -bill

        // 0 mike
        // 1 bill
        // 2 jane
        // 3 john
        // 4 - back
        // 5
        // 9

	 */
	public void addDataToBack(Employee data) {

		if (getSize() == queue.length-1) {
			int numItems = getSize();
			Employee[] empArr = new Employee[2 * queue.length];
			//copying front to end
			System.arraycopy(queue, front, empArr, 0, queue.length-front);
			//copying queue data upto back
			System.arraycopy(queue, 0, empArr, queue.length - front, back);
			queue = empArr;
			
			front = 0;
			back = numItems;

		}
		queue[back] = data;
		if (back < queue.length-1) {
			back++;
		}else {
			back = 0;
		}
		
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
		}else if (front == queue.length) {
			front = 0;
		}
		return removedEmployee;
	}
	
	public Employee peek() {
		if(getSize() == 0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public void printQueue() {
		if (getSize() == 0) {
			System.out.println("Empty Queue");
		} else if (getSize() == 1) {
			System.out.print(queue[front]);
		} else {
			if (front <= back) {
				for (int i = front; i < back; i++) {
					System.out.println(queue[i]);
				}
			} else {
				for (int i = front; i < queue.length; i++) {
					System.out.println(queue[i]);
				}
				for (int i = 0; i < back; i++) {
					System.out.println(queue[i]);
				}
			}

		}
	}
}
