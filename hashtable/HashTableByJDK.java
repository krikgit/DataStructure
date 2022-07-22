package self.learn.ds.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashTableByJDK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee krishna = new Employee(1, "Krishna", "Mandal");
		Employee momo = new Employee(2, "Momo", "Mandala");

		Employee rambo = new Employee(3, "Rambo", "Bhai");
		Employee tapori = new Employee(4, "Tapori", "Paji");
		Employee gunda = new Employee(5, "Gunda", "Bhao");
		
		Map<String, Employee> map = new HashMap<>();
		map.put("Mandal", krishna);
		map.put("Mandala", momo);
		map.put("Bhai", rambo);
		map.put("Paji", tapori);
		map.put("Bhao", gunda);
		
		Iterator< Employee> itr = map.values().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==============");
		map.forEach((k,v) -> System.out.println(v));

	}

}
