package day24inheritanceoverriding;

public class Audi extends Car {
	
	
	/*
	 1)  If you change the "method body" of a method which is in parent class before using in child Class, it is "method overriding"
	 2) In "method overriding", we do not create a new method.
	      We change the implementation and use it.
	 3)  In "method overriding" you can not change " method parameters and name"
	       NOTE: Method Signature : method parameters and name.
	                   so we do not change Method Signature in "method overriding"
	                   
	   4) Private methods can not be overriden. Because private methods can not be seen in another class.
	   5) Access modifiers of "overriding methods" ( methods are in child class) should be wider than the access modifiers of "overridden methods" ( methods are in parent class)
	       Child class can not restrict the parent class
	       
       6) If return type is primitive or void in overriding, you can not touch to the return type
       7) If return type is non - primitive, you should have IS-A relationship 
	      
	       
	 */
	
	/*
	       We need overriding to make method specific for child classes
	       In overriding we shouldn't touch method signature
	       In overriding  method body is updated
	       Access modifiers of child classes should be same or wider then access modifiers of parent class
	 */
	
	public void price () {
		System.out.println("Audi is expensive");
	}

	
	// Can I use both "overridden" and "overriding" method in child class

	@Override
	public void move() {
	    System.out.println("Audi moves very fast");
		super.move();
		
		
	}


	// Polymorhism = Method Overloading + method Overriding
	// we create same method in different forms
	// Method Overloading is compile time Polymorhism -- Static Polymorhism
	// method Overriding is run time Polymorhism -- Dynamic Polymorhism
	

}
