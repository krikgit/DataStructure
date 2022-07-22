package self.learn.ds.hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee krishna = new Employee(1, "Krishna", "Mandal");
		Employee momo = new Employee(2, "Momo", "Mandala");

		Employee rambo = new Employee(3, "Rambo", "Bhai");
		Employee tapori = new Employee(4, "Tapori", "Paji");
		Employee gunda = new Employee(5, "Gunda", "Bhao");
		
		HashtableByArray hashTable = new HashtableByArray(3);
		
		hashTable.put("Mandal", momo);
		hashTable.put("Mandala", krishna);
		
		hashTable.print();
		System.out.println("==========");
		System.out.println(hashTable.get("Mandal"));
		System.out.println("==========");
		
		HashTableByArrayWithProbing hashTables = new HashTableByArrayWithProbing(3);
		hashTables.put("Bhai", rambo);
		hashTables.put("Paji", tapori);
		hashTables.put("Bhao", gunda);
		
		hashTables.print();
		
		System.out.println(hashTables.get("Bhao"));
		System.out.println("Removing:"+hashTables.remove("Bhai"));
		
	}

}
