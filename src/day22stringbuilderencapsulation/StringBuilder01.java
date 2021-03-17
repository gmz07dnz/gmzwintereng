package day22stringbuilderencapsulation;

public class StringBuilder01 {

	public static void main(String[] args) {
	
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		// equals() method in StringBuilder returns false even the values are same
		System.out.println(sb1.equals(sb2)); // false -> using "==" sign 
		
		// How can we compares the values of StringBuilder?
		//1. Convert StringBuilder to String then use equals() method
		System.out.println(sb1.toString().equals(sb2.toString()));  // true
		
		
		// 2. way : Use compareTo() method 0>  if you get "0" be sure  StringBuilder values are same
		System.out.println(sb1.compareTo(sb2));  // 0 ==> StringBuilders have same characters
		
		
    
	
	}

}
