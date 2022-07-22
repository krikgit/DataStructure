package self.learn.ds.hashtable;

public class HashTableByArrayWithProbing {
	
	StoredEmployee [] hashTable;
	
	public HashTableByArrayWithProbing(int capacity) {
		// TODO Auto-generated constructor stub
		hashTable = new StoredEmployee[capacity];
	}

	//creating hash function to generate keys
	private int getHashedKey(String key) {
		return key.length() % hashTable.length;
	}

	//occupied checking
	private boolean isOccupied(int key) {
		return hashTable[key] != null;
	}
	
	//find the actual key
	private int findKey(String key) {
		int hashKey = getHashedKey(key);
		
		if(hashTable[hashKey] != null && hashTable[hashKey].getKey().equals(key)) {
			return hashKey;
		}
		
		int stopIndex = hashKey;
		if (hashKey == hashTable.length-1) {
			hashKey = 0;
		}else {
			hashKey++;
		}
		
		while (hashKey != stopIndex && hashTable[hashKey] != null && !hashTable[hashKey].getKey().equals(key)) {
			hashKey = (hashKey +1) % hashTable.length;
		}
		
		if (stopIndex == hashKey) {
			return -1;
		}else {
			return hashKey;
		}
	}
	
	//storing data in hashtable array
	public void put(String key, Employee employee) {
		int hashedKey = getHashedKey(key);
		
		if (isOccupied(hashedKey)) {
			
			int stopIndex = hashedKey;
			
			if (hashedKey == hashTable.length-1) {
				hashedKey = 0;
			}else {
				hashedKey++;
			}
			
			while (isOccupied(hashedKey) && stopIndex != hashedKey) {
				hashedKey = (hashedKey +1 ) % hashTable.length;
			}
		}
		
		if(isOccupied(hashedKey)) {
			System.out.println("Position aquired by:"+hashedKey);
		}else {
			hashTable[hashedKey] = new StoredEmployee(key,employee);
		}
	}
	
	//retriving data from hashtable
	public Employee get(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		}
		return hashTable[hashedKey].getEmployee();
	}
	
	public Employee remove(String key) {
		int hashKey = findKey(key);
		if (hashKey == -1) {
			return null;
		}
		Employee employee = hashTable[hashKey].getEmployee();
		hashTable[hashKey].setEmployee(null);
		return employee;
	}
	
	//printing that table
	public void print() {
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i] == null) {
				System.out.println("Position "+i+" empty");
			}else {
				System.out.println("Position "+i+" : "+hashTable[i].getEmployee());
			}
			
		}
	}

}
