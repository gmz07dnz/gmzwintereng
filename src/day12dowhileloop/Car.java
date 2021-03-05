package day12dowhileloop;



public class Car {
	
	/*
	 Constructor creates objects from class.
	 When you create a class, Java knows that you will create objects.
	 To create object you need constructor, because of that Java puts "Constructor" behind the class for you
	 That kinds of constructors are called " Default Constructor"
	 */
	
	public String make = "Honda";
	public String model = "Accord";
	public int price = 20000;
	public int year = 2020;
	
	public static void main(String[] args) {
		
		Car myCar1 = new Car();  //  when we create an object from a class, it has all features of class
	
		System.out.println(myCar1.make); //  Honda
		System.out.println(myCar1.model); // Accord
		System.out.println(myCar1.price); // 20000
	    System.out.println(myCar1.year); // 2020
	    
	    myCar1.move(); // Moves Fast
	    myCar1.stop(); // The car can stop
	
	}
	
	public static void move() {
		System.out.println("Moves Fast");
	}
	
	
	public static void stop() {
		System.out.println("The car can stop");
	}
	
}
