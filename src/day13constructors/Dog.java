package day13constructors;

public class Dog {

	/*
	-> If you create your own constructor,  you must type access modifier, Name, pharanthesis and curly braces.
	-> If you create your own constructor, the constructor is created by Java is removed.
	-> You can create more then one constructor in a class.
	-> To produce many objects which has different features  as I want, I should create constructor with parameter
	-> Objects are copy of class, so it can access to everything inside class. All class members are accessable.
    -> When you need sth in a class, create an object and get it.
	 */
	

    public String name ;
	public int weight ;
	public int height;
	
	
	// I create a constructor below
	// The constructor has no parameter
	// The constructor has nothing inside the body
	// That kind of constructor are same with the default constructor
	
	public Dog() {
	
	}
	
	public Dog(String name) { // you sould definitely write a name
   
		this.name =name;  // name at the left -> instance variable in class, name at the right -> is coming from user by parameter 
	}
	
    
	public Dog(int weight, int height ) { // I am getting value from user by the help of constructor parameter, I am making assigment to the variable inside of class 
  // you are getting the value from user, then Java is putting the value into the constructor, then the value from the constructor is passed to he variable inside the class
		this.height=height;
	}
	
	
	public Dog(String name, int weight, int height ) {
		this.name =name;     
		this.weight=weight;
		this.height=height;
		
	   /*
	    If I don't type "this" keyword, the parameter can not be passed and can not be assigned,
	    so I get the values of instance variables which are created at first
	    */
		
	}
	
	
	
	
	public static void main(String[] args) {
	Dog  dog1 = new Dog();
	System.out.println(dog1.name); // null
	dog1.sound();
	
	Dog dog2 = new Dog("Joe");
	
	System.out.println(dog2.name); //  Joe
	dog2.sound();
	
	// Create a dog by using name,height, weight
	
	Dog dog3 = new Dog("Bubby",12,15);
    System.out.println(dog3.name);
    System.out.println(dog3.height);
    System.out.println(dog3.weight);

    
    
	}
	
	
	
	
	public static void sound() {
		System.out.println("Dogs bark ...");
	}
	

}
