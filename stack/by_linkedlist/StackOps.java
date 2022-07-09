package self.learn.ds.stack.by_linkedlist;


public class StackOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Alpha", "Mike");
		Employee e2 = new Employee(1, "Dude", "Stuart");
		Employee e3 = new Employee(1, "Wilson", "Bret");
		
		StackByLinkedList list = new StackByLinkedList();
		list.addElement(e1);
		list.addElement(e2);
		list.addElement(e3);
		
		list.printStack();
		System.out.println("==================");
		list.popElement();
		list.popElement();
		list.printStack();
		System.out.println("==================");
		System.out.println(list.isEmpty());
	}

}
