package self.learn.ds.linkedlist.singly;

/**
 * @author krimanda1
 * 
 * Adding node at the end of the list
 * 
 * Not recommended
 *
 */
public class BackEmployeeLinkedList {
	
	private EmployeeNode head;
	
	public void addEmployee(Employee employee) {
		
		EmployeeNode employeeNode = new EmployeeNode(employee);
		
		if (head == null) {
			head = employeeNode;
		}else {
			EmployeeNode tempNode = head;
			while(tempNode.getNextNodeAddress() != null) {
				tempNode = tempNode.getNextNodeAddress();
			}
			tempNode.setNextNodeAddress(employeeNode);
		}
	}
	
	public void showEmployeeList() {
		EmployeeNode currentNode = head;
		if(currentNode == null) {
			System.out.println("This is empty list");
		}else {
			int i =0;
			while (currentNode != null) {
				i++;
				System.out.println("Employee "+i+": "+currentNode.getEmployee().getFirstName());
				currentNode = currentNode.getNextNodeAddress();
			}
		}
	}
	
	

}
