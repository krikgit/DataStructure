package self.learn.ds.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(123, "Jane", "Jones");
		Employee e2 = new Employee(723, "Jone", "Doe");
		Employee e3 = new Employee(823, "Mike", "Wilson");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		//all employee
		employees.forEach(employee -> System.out.println(employee));
		System.out.println("=============");
		//get employee
		System.out.println(employees.get(1)); //print the 2nd object
		System.out.println("=============");
		//check emptiness
		System.out.println("Is the list empty: "+employees.isEmpty()); //print the 2nd object
		System.out.println("=============");
		//set or update data
		employees.set(1, new Employee(678, "Jone", "Abrad"));
		System.out.println(employees.get(1)); //after update
		System.out.println("=============");
		//list size
		System.out.println("Size of the list : "+employees.size());
		System.out.println("=============");
		//converting list to array
		Employee[] employee = employees.toArray(new Employee[employees.size()]);
		for (Employee emp : employee) {
			System.out.println(emp);
		}
		System.out.println("=============");
		// check list contain mentioned object
		System.out.println("Is employee present in the list:"+employees.contains(new Employee(123, "Jane", "Jones")));
		System.out.println("=============");
		//remove object
		employees.remove(0);
		System.out.println("after removal of object:");
		employees.forEach(emps -> System.out.println(emps));
		
	}

}
