package day24inheritanceoverriding;

public class Dog extends Mammal{
	
	public boolean smellWell;
	public int height =25;
	
	
	public Dog() {
		super();    // If you type "super()" keyword , it is fine.
		                 //  If you don't type "super()" keyword, Java puts it automatically
	
		System.out.println("Dog cons without parameter");
	}
	
	public Dog(boolean smellWell) {
		super(true); // if you don't type any constructor call inside the first line , Java uses the parent constructor without parameter automatically 
		
		/*
		  super() is for "parent constructor call"
		  super is for "parent variables call"
		 */
		super.haveBaby= true;  // this update is for this object
		super.height = 11;
		super.weight= 22;
		this.smellWell =smellWell;
		
		
	}

}
