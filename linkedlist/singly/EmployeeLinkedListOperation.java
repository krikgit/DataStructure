package self.learn.ds.linkedlist.singly;


public class EmployeeLinkedListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(123, "Jane", "Jones");
		Employee e2 = new Employee(723, "Jone", "Doe");
		Employee e3 = new Employee(823, "Mike", "Wilson");
		
		/*
		 * System.out.println("===Adding node at the last of the list===");
		 * BackEmployeeLinkedList listed =new BackEmployeeLinkedList();
		 * listed.addEmployee(e1); listed.addEmployee(e2); listed.addEmployee(e3);
		 * 
		 * listed.showEmployeeList();
		 */
		
		//this appropriate approach
		System.out.println("===Adding node in front of the list===");
		FrontEmployeeList list = new FrontEmployeeList();
		list.addEmployee(e1);
		list.addEmployee(e2);
		list.addEmployee(e3);
		
		list.showEmployees();
		long size = list.getSize();
		System.out.println("Size of the list is:"+size);
		
		System.out.println("List emptiness status:"+list.isEmpty());
		System.out.println("Deleted node:"+ list.removeNodeFromFront());
		System.out.println("Deleted node:"+ list.removeNodeFromFront());
		System.out.println("Deleted node:"+ list.removeNodeFromFront());
		list.showEmployees();

	}

}
