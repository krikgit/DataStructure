package self.learn.ds.hashtable;

public class HashtableByArray {
	
	Employee [] hashTable;
	
	public HashtableByArray(int capacity) {
		// TODO Auto-generated constructor stub
		hashTable = new Employee[capacity];
	}

	//creating hash function to generate keys
	private int getHashedKey(String key) {
		return key.length() % hashTable.length;
	}

	//occupied checking
	public boolean isOccupied(int key) {
		return hashTable[key] != null;
	}
	
	//storing data in hashtable array
	public void put(String key, Employee employee) {
		int hashedKey = getHashedKey(key);
		if(isOccupied(hashedKey)) {
			System.out.println("Position aquired by:"+hashedKey);
		}else {
			hashTable[hashedKey] = employee;
		}
	}
	
	//retriving data from hashtable
	public Employee get(String key) {
		int hashedKey = getHashedKey(key);
		return hashTable[hashedKey];
	}
	
	//printing that table
	public void print() {
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println(hashTable[i]);
		}
	}
	
}