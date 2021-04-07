package day24inheritanceoverriding;

public class Animal {
	
	public int height;
	public int weight;
	
	
	
	public Animal() {
		System.out.println("Animal cons without parameter");
	}
	
	public Animal(int a) {
		System.out.println("Animal cons with int  parameter");
	}
	
	public Animal(int height, int weight) {
		this.height =height;
		this.weight=weight;
	}

}
