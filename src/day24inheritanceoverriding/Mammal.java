package day24inheritanceoverriding;

public class Mammal extends Animal {

	/*
	   1) to create an oblect you can use just a single constructor
	   2) super()  keyword must be in the first line in the constructor. so you can use super() just once in constructor
	   3) if you make constructor call for non-existing constructor from parent class, you will get CTE
	   4) this() keyword => constructor call for the same class. If you wanna navigate between constructors in the same class, you can use this() 
	        super() keyword => constructor call for the parent class.
	 */
	
	public boolean haveBaby;
	public int height =22;
	
	public Mammal() {
		super(5);  // call parent const with int parameter. If you don't type this line, Java calls super() 
		System.out.println("Mammal cons without parameter");
	}
	
	public Mammal(boolean haveBaby) {
		super(3,4);
		this.haveBaby =haveBaby;
		
	}
	
	
}
