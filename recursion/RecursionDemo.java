package self.learn.recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long input = 5;
		long fact = factorialWithRecursion(input);
		if (fact == 999) {
			System.out.println("Enter  a positive non fraction number");
		}else {
			System.out.println("Factorial of "+input+ " is:"+fact);
		}
		

	}
	
	public static long factorialWithoutRecursion(long num) {
		
		long factorial = 1;
		
		if(num < 0 || num%1 != 0) {
			factorial = 999;
		}else if (num == 0) {
			factorial = 1;
		}else {
			for(int i= 1; i<=num;i++) {
				factorial *= i;
			}
		}
		return factorial;
	}
	
	public static long factorialWithRecursion(long num) {
		//Logic..
		/* 
		 * 1! = 1 * 0!
		 * 2! = 2 * 1 = 2* 1!
		 * 3! = 3 * 2 * 1 = 3 * 2!
		 * 4! = 4 * 3 * 2 * 1 = 4 * 3!
		 * n! = n * (n-1) * (n-2) *...*1 = n * (n-1)!
		 */ 


		if (num < 0 || num % 1 != 0) {
			return 999;
		} else if (num == 0) { //main breaking condition
			return 1;
		} else {
			return num * factorialWithRecursion(num-1);
		}
	}
	
}
