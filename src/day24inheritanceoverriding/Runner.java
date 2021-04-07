package day24inheritanceoverriding;

public class Runner {

	public static void main(String[] args) {
		
		// when you wanna create an obj everything starts from object class
		// If you create a dog, its parent should be created first and its parents' parents as well ...
		
		Dog dog1 = new Dog(true);    // Animal cons without parameter
		                                              //  Mammal cons without parameter
		                                              //  Dog cons without parameter
		
		// the grandparent is Animal class, so at first the top parent should be created
	
		System.out.println(dog1.height); // 3
		System.out.println(dog1.height); // 4
		System.out.println(dog1.haveBaby); // true
		System.out.println(dog1.smellWell); // true

		Audi audi1 = new Audi();
		audi1.move();      // Audi moves very fast
                                  	// 	Vehicles move
		 
	}

}
