package day14constructorsstatickeywordarrays;
     
public class Animal {
	
	/*
	   1) this();  means -> go to the constructor => call constructor
	   2) this(); must be typed  in the first line everytime
	   3)  in a constructor you can do  just a single  constructor call. Beccause if you do multiple constructor
	        call at least one of them will not be in the first line.That contradicts with the 2nd rule
	   4) ýf you select a constructor which  is not being when you call , java is complainig
	 */
	
    public String name = "Joe";
	public int weight = 78;
	public  boolean herbivorous = true; 
	
	
	public Animal() {
		this("Mark", 23);
    System.out.println("1st constructor is executed");
	}

	public Animal(String name) {
	   System.out.println("2nd constructor is executed");
		this.name = name;
	}

	public Animal(String name, int weight) {
		this("dog");  // navigate to the 2nd constructor
		 System.out.println("3rd constructor is executed");
		this.name = name;
		this.weight = weight;
	}
	

	public Animal(String name, int weight, boolean herbivorous) {
		 System.out.println("4th constructor is executed");
		this.name = name;
		this.weight = weight;
		this.herbivorous = herbivorous;
	}

	public static void main(String[] args) {
		
		Animal dog1 = new Animal("Cat", 25); // 2nd constructor is executed
		                                                                     // 3rd constructor is executed           
		System.out.println(dog1.name); // Mark
		System.out.println(dog1.weight); // 23
		
	}
	
	
	
	

}
