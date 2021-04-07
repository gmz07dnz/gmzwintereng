package day24inheritanceoverriding;

public class Honda extends Car{
	
	public void factory () {
		System.out.println("Factory in Japan");
	}

	@Override  // if you want, you can remove it. But if you put it, Java checks if it is true according to overriding rules and it is also good for readilibity
	public void move() {  // overriding methods
		System.out.println("Honda reaches 100 in 6 seconds");
	}

	@Override
	public void engine() {
		System.out.println("Honda has eco engine in every model");
	}

	
}
