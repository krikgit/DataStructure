package self.learn.ds.queue.by_array;

public class QueueOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Krish", "kuma");
		Employee e2 = new Employee(1, "kk", "lo");
		Employee e3 = new Employee(1, "mki", "sds");
		
		Queue<Employee> queue = new Queue<>(3);
		queue.addDataToBack(e1);
		queue.addDataToBack(e2);
		queue.addDataToBack(e3);
		
		queue.printQueue();
		System.out.println("==============");
		System.out.println("Removed Employee:"+queue.removeDataFromFront());
		System.out.println("===============");
		queue.printQueue();
		System.out.println("================");
		System.out.println("Peek employee"+queue.peek());
		
		System.out.println("========Circular Queue Demonstration=========");
		CircularQueue circularQueue = new CircularQueue(3);

		circularQueue.addDataToBack(e1);
		circularQueue.addDataToBack(e2);
		circularQueue.addDataToBack(e3);
		circularQueue.printQueue();
		System.out.println("Capacity:"+circularQueue.getCapacity());
		System.out.println("Removed Employee:"+circularQueue.removeDataFromFront());
		circularQueue.printQueue();
		

	}

}
