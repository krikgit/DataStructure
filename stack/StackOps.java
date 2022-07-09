package self.learn.ds.stack;

import java.util.Stack;
//Never use this in build class
public class StackOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<>();
		
		
		pushOps(stack);
		System.out.println("After push: "+stack);
		
		System.out.print("Top Element:");
		findTopOfStack(stack);
		
		System.out.println("Search for 3:");
		searchOps(stack, 3);
		
		System.out.print("Popping:");
		popOps(stack);
		System.out.print("After popped:"+stack);

	}
	//add into stack
	static void pushOps(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);			
		}
	}
	//remove from stack top
	static void popOps(Stack<Integer> stack) {
		System.out.println(stack.pop());
	}
	//stack top element
	static void findTopOfStack(Stack<Integer> stack) {
		System.out.println(stack.peek());
	}
	//search in stack
    static void searchOps(Stack<Integer> stack, int element)
    {
        Integer pos = stack.search(element);
  
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
	
	

}
