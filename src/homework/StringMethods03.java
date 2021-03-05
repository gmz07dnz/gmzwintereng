package homework;

public class StringMethods03 {

	public static void main(String[] args) {
		
		String str = "Cat, caterpillar";

		String str1 = str.substring(0);
	    System.out.println(str1); // Cat, caterpillar
		
		String str2 = str.substring(3);
		System.out.println(str2); //  caterpillar
		
		String str3 = str.substring(4);
		System.out.println(str3); //  caterpillar
		
		String str4 = str.substring(15);
		System.out.println(str4); // r
		
		String str5 = str.substring(16);
		System.out.println(str5); // ""

		String str6 = str.substring(5, 8);
		System.out.println(str6); // cat
		
		String str7 = str.substring(3, 4);
		System.out.println(str7); // ,
		
		String str8 = str.substring(5, 5);
		System.out.println(str8); // ""
		
	// 	String str9 = str.substring(8, 5); -> rte
	
	}

}
