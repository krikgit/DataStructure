package self.learn.ds.linkedlist.singly;

/**
 * @author krimanda1
 * 
 * Adding node to the front of the list
 * 
 * Always recommended
 *
 */
public class FrontEmployeeList {
	
	private EmployeeNode headNode;
	
	private long size;
	
	public void addEmployee(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);
		
		if(headNode == null) {
			headNode = employeeNode; 
			size++;
		}else {
			employeeNode.setNextNodeAddress(headNode);
			headNode = employeeNode;
			size++;
		}
		
	}
	
	public void showEmployees() {
		EmployeeNode current = headNode;
		if (current == null) {
			System.out.println("Empty List");
		}else {
			while (current != null) {
				System.out.println(current.getEmployee().getFirstName());
				current = current.getNextNodeAddress();
			}
		}
	}
	
	public long getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return headNode == null;
	}
	
	public EmployeeNode removeNodeFromFront() {
		EmployeeNode delNode = null;
		if(headNode == null) {
			delNode = null;
		}else {
			delNode = headNode;
			if (headNode.getNextNodeAddress() != null) {
				headNode = headNode.getNextNodeAddress();
				delNode.setNextNodeAddress(null);
			}else {
				headNode = null;
			}
			size--;
		}
		return delNode;
	}

}
