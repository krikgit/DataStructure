package self.learn.ds.stack.by_array;

public class StackOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Krish", "kuma");
		Employee e2 = new Employee(1, "kk", "lo");
		Employee e3 = new Employee(1, "mki", "sds");
		
		StackByArray employeeStack = new StackByArray(5);
		employeeStack.addElement(e1);
		employeeStack.addElement(e2);
		employeeStack.addElement(e3);
		
		employeeStack.display();
		System.out.println("========================");
		employeeStack.popElement();
		employeeStack.display();
		
		System.out.println("Is stack empty:"+employeeStack.isEmpty());
		System.out.println(employeeStack.peek());
		System.out.println("Size:"+employeeStack.getSize());

	}
	
	

}
