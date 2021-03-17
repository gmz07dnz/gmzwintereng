package day20passbyvaluepassbyreferencedate;

public class A {

	public static void main(String[] args) {
		Test t = new Test(5);
		int a = 15;
		System.out.println(t.x);
		change(t,8);
		System.out.println(t.x);
		System.out.println("main a " + a);

	}

	private static void change(Test t, int a) {
		t.x=10;
		a = 17;
		System.out.println("Methoddaki a" + a);
		System.out.println(t.x);
	}

}
