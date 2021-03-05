package homework;

public class StringMethods02 {

	public static void main(String[] args) {
		
		String str = "Cat, caterpillar";

		int idx1 = str.lastIndexOf("a");
		System.out.println(idx1); // 14
		
		int idx2 = str.lastIndexOf("at");
		System.out.println(idx2); // 6
		
		int idx3 = str.lastIndexOf("s");
		System.out.println(idx3); // -1
		
		int idx4 = str.lastIndexOf("CAT");
		System.out.println(idx4); // -1
		
		int idx6 = str.lastIndexOf("pars");
		System.out.println(idx6); // -1
		
		int idx7 = str.lastIndexOf("a", 3); 
		System.out.println(idx7); // 1
		
		int idx8 = str.lastIndexOf("a", 5);
		System.out.println(idx8); // 1
		
		int idx9 = str.lastIndexOf("at", 2);
		System.out.println(idx9); // 1
		
		int idx10 = str.lastIndexOf("at", 7);
		System.out.println(idx10); // 1
		
		 String str1= "Java is easy if you study";
		 
		 System.out.println(str1.lastIndexOf("a",11)); // 9
		 System.out.println(str1.lastIndexOf('u',23)); // 22
		 
	}
}
