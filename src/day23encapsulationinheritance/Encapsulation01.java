package day23encapsulationinheritance;

public class Encapsulation01 {
	
	private String name = "Ali Can";
	private int age = 21;
	private boolean retired = false;
	private char initial = 'A';
	private String address = "Florida";	
	
	// for getter of boolean variables start the name of getter with "is"
	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {    // it does some actions, doesn't return anything, so return type will be "void" 
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}


	/*
	public boolean getRetired() {
		return retired;
	}
	
	public void setRetired(boolean retired) {
		this.retired= retired;
	}
	*/
	
	// Make initial variale just readable, you shouldn't create setter, create just "getter"

	public char getInitial() {
		return initial;
	}

	
	// Make "address" just updatable, you should not create "getter", you should create " setter"
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	  1) If you want not not to update any value, do not create any setter method
	  Question: How can you make a class immutable?
	                    * Make all variables private then do not create any setter method
	   => If you do not create any setter method it means no value can be updated, and the class is called "immutable class"
	   
	   
	 */
	
	
	
	
	
	
	
	
	

}
