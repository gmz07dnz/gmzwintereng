package day03wrapperclassconcatenatelogicaloperators;

public class Concatenation01 {
	
	// Concetenation: Joining Strings

	public static void main(String[] args) {
		String s1 = "Ali";
		String s2 ="Can";
		
		System.out.println(s1+s2); // if you use "+" sign for Strings , java understand that it can not be mathematical operation. Because they are String.
		
		/*
		  "+" sign has two meaninhs in Java:
		  1) Addition (mathematical operation)
		  2) Concatenation
		  
		  -> If you use "+" sign between numbers, Java will use it for addition
		  -> If you use "+" sign between Strings, Java will use it for concatenation
		 */
		
		
		// If wanna put space between s1 and s2. It has 3 ways:
		// 1. way
		String s3= "Ali ";  // you can put space at the end of Ali
		String s4 ="Can";
		System.out.println(s3+s4);
		
		// 2. way
		String s5 = "Ali"; 
		String s6= " Can"; // you can put space before Can
		System.out.println(s5 + s6);
		
		// 2. way
		String s7 = "Ali";
		String s8 = "Can"; 
		System.out.println(s7 +" "+ s8); // you can put a space as character between Ali and Can
	
	
		int a = 5;
		int b = 7;
		String s9 = "Java";
		System.out.println(a+s9);//5Java  
		System.out.println(s9+a); // Java5
		System.out.println(a+s9+b);// 5Java7
		System.out.println(a+b+s9); // 12Java
		System.out.println(s9+ a*b); // Java35
		
		
		// By using following variable,print "61Study-1" on the console
		int m = 2;
		int n = 3;
		String s = "Study";
	
		System.out.println(((m+n)*n*m*m + (n-m)) + s + (m-n));
	
	
	}

}
