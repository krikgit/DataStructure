package self.learn.ds.queue.by_JDK_API;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		
		Iterator<Integer> iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
