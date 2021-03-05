package day13constructors;
     
public class Animal {
	
	/*
	 1) Constructors must have same name with the class.
	 2) Constructor names starts with uppercases ( Because they match with the class names ) but methods names start with lowercase
     3) Methods must have "return type", but  Constructors must not
	 */
	
    public String name = "Joe";
	public int weight = 78;
	public  static boolean isHerbivorous = true; // to use in eat() method, we make it static
	
	
	
	public static void main(String[] args) {
		Animal dog = new Animal();
	    System.out.println(dog.name); // null -> if I assign a value
	    System.out.println(dog.name); // Joe
	    System.out.println(dog.weight); // 0 -> if I assign a value
	    System.out.println(dog.name); // 78
	    System.out.println(dog.name); // false -> if I assign a value
	    System.out.println(dog.name); // true
	  
	    dog.move();
	    dog.eat();
	    dog.drink();
	    
	    // I created an object and I put some methods and variables ( features and avtions) in class and 
	    // I can use them by object
	}
	
	public static void eat() {
		if (isHerbivorous) {
		System.out.println("eats plants");
		}else {
			System.out.println("Eats both plants and meat");
		}
	}
	
	public static void drink() {
		System.out.println("drinks water");
	}
	
	public static void move() {
		System.out.println("move");
	}
	
	

}
