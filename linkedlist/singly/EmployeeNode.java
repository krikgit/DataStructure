package self.learn.ds.linkedlist.singly;

public class EmployeeNode {
	
	private Employee employee;
	private EmployeeNode nextNodeAddress;
	
	public EmployeeNode(Employee employee) {
		// TODO Auto-generated constructor stub
		this.employee = employee;
		this.nextNodeAddress = null; 
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNextNodeAddress() {
		return nextNodeAddress;
	}

	public void setNextNodeAddress(EmployeeNode nextNodeAddress) {
		this.nextNodeAddress = nextNodeAddress;
	}

	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + "]";
	}

	
}
