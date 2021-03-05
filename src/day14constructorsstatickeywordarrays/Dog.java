package day14constructorsstatickeywordarrays;

public class Dog {
	
	/*
	 1) Static one just uses class name. To access a static thing , we need to use just class name
	  2) Non static one uses objects. To access non static thing, we need to create oblect
	 */
	 public static int a;

	public static void main(String[] args) {

		Dog dog = new Dog();
		System.out.println(dog.a);
System.out.println(Dog.a);
	}
	
	
	
	public static void eat() {
		System.out.println("This is static eat method");
	}
	
	
	public  void drink() {
		System.out.println("This is not static drink method");
	}

}
