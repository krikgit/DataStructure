package self.learn.ds.stack;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//adding
	static void add(Vector<Integer> vector) {
		for (int i = 0; i < 5; i++) {
			vector.add(i);
			
		}
	}
	//adding with index
	static void addWithIndex(Vector<Integer> vector,int index, int obj) {
		obj = 0;
		for (int i = 0; i < 5; i++) {
			vector.add(index,obj++);
		}
	}
	//updating 
	static void update(Vector<Integer> vector, Integer index,Integer  ele) {
		vector.set(index, ele);
	}
	
	//removing
	static void remove(Vector<Integer> vector, int pos) {
		vector.remove(pos);// indicate the position not element
	}
	

}
