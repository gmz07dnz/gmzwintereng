package day25overridingexceptions;

public class Runner {

	public static void main(String[] args) {

		// Create an object whose data type is Animal; constructor is Dog 
		// When you create an object, you may use parent classes as data type. 
		// If parent and child classes have methods whose names are same, look at the data types to understand which one will be called
		
		// If you use "parent class" as data type, the class members in child class will be unaccessable
		//  If you use "child class" as data type, the class members in child class and parent class will be accessable
		
		Animal obj1 = new Dog(); // name, height - drink()
		obj1.drink();
	
		
		Dog obj2 = new Dog();  // I am bale to use all members: birthday, tail, name, height - drink(), bark()
		obj2.bark();


		// First one is better. Because it is more general. It will be flexible
		

	}

}
