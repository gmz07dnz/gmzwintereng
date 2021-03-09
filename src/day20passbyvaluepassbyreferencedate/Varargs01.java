package day20passbyvaluepassbyreferencedate;

public class Varargs01 {
	
	/*
	  1) If you want a method to run with different number of arguments use varargs. 
	        By using varargs, no need to create  method for every number of arguments
	  2) Varargs behaves like lists, but behind the varargs arrays work. (behaves like lists. Because varags are flexible in length)
	  3) To declare a varag use "int... a" or "String... s" etc.
	  4) Varargs must be the last parameter inside the method paranthesis
	  5) Can I use multiple varargs inside a method paranthesis?
	       I can not. Because it contradicts with 4. point. If I you use multiple , at least one of them will not be at the end
	 */

	public static void main(String[] args) {
		
		System.out.println(add1(3, 5)); //  8

		System.out.println(add2(3, 5, 7)); // 15
		
		System.out.println(add(-1, 17)); // 15
		System.out.println(add(3,5,6)); // 14
		
		System.out.println(retirementPayment("Mary Stone",2, 3, 5, 6)); // Mary Stone: 180
	}
	
	public static int add1(int a, int b) {
		return a+b;
	}
	
	public static int add2(int a, int b, int c) {
		return a+b+c;
	}
	
	
	public static int add(int...  a ) {
		int sum =0;
		for(int w: a ) {
			sum = sum+w;
		}
		return  sum;
	}
	
     public static String retirementPayment(String empName, int... amount) {
    	 int result =1;
    	 for(int w: amount) {
    		 result = result*w;
    		 }
    	 return empName + ": " + result;
    	 
     }
	
}
