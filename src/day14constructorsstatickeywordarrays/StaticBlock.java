package day14constructorsstatickeywordarrays;

public class StaticBlock {
	
	/*
	  1) Static block is used to initialize "static variables".
	       If you need a value before everything you can use static block
	       
	    2) If you need some variables to intialize before "constructors " and "main method " are executed
	        you should intialize the variable by static block
	        
	    3) If you have multiple static blocks, the static block at the top works first
	 */
	
	
	public static int age ;
	
	static{
		System.out.println("Static Block 1  is executed"); 
     age =23;
	}
	
	static{
		System.out.println("Static Block 2  is executed"); 
     age =24;
	}
	
	public StaticBlock() {
		System.out.println("Constructor is executed");
		System.out.println(++age);
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method  is executed 1");
		System.out.println(++age); // 24
		
		StaticBlock obj= new StaticBlock();  // 25
		
		System.out.println("Main Method  is executed 2");
		
		
	}

}
