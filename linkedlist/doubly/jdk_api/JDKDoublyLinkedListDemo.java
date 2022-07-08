package self.learn.ds.linkedlist.doubly.jdk_api;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKDoublyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		
		list.add(2,10);
		
		Iterator<Integer> itr = list.iterator();
		System.out.print("HEAD");
		while (itr.hasNext()) {
			System.out.print("->"+itr.next());
			
		}
		System.out.println("\n=====================");
		LinkedList<Integer> lists = new LinkedList<>();
		lists.add(1);
		lists.add(2);
		Iterator<Integer> itrs = lists.iterator();
		System.out.print("HEAD");
		while (itrs.hasNext()) {
			System.out.print("->"+itrs.next());
			
		}
		System.out.println("\n=====================");
		LinkedList<Integer> l = new LinkedList<>();
		l.addLast(1);
		l.addLast(2);
		Iterator<Integer> it = l.iterator();
		System.out.print("HEAD");
		while (it.hasNext()) {
			System.out.print("->"+it.next());
			
		}
		System.out.println("\n=====================");
		list.remove();
		list.removeFirst();
		list.removeLast();
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
	}

}
