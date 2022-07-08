package self.learn.ds.vector;

import java.util.List;
import java.util.Vector;

import self.learn.ds.arraylist.Employee;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(123, "Jane", "Jones");
		Employee e2 = new Employee(723, "Jone", "Doe");
		Employee e3 = new Employee(823, "Mike", "Wilson");
		
		List<Employee> employees = new Vector<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		employees.forEach(System.out::println);
	}

}
