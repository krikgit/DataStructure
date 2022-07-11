package self.learn.ds.queue.by_linkedlist;


public class QueueOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Nima", "Kundu");
		Employee e2 = new Employee(2, "Poncha", "Bhunia");
		Employee e3 = new Employee(3, "Khandu", "Pramanik");
		
		QueuByLinkedList<Employee> queue =new QueuByLinkedList<>();
		queue.addData(e1);
		queue.addData(e2);
		queue.addData(e3);
		
		queue.printQueue();
		
		System.out.println("Peek:"+queue.peek());
		
		System.out.println("Removed Employee:"+queue.removeData());
		queue.printQueue();
	}

}
