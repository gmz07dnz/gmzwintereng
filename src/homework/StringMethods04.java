package homework;

public class StringMethods04 {
	public static void main(String[] args) {

		String str = "Cat, caterpillar";
		
		String str1 = str.toUpperCase();
		System.out.println(str1); // CAT, CATERPILLAR
		
		String str2 = str.toLowerCase();
		System.out.println(str2); // cat, caterpillar
		
		String str3 = str.substring(4).toLowerCase();
		System.out.println(str3); // "  caterpillar"
		
		String str4 = str.substring(3, 8).toUpperCase();
		System.out.println(str4); //  , CAT
		
		String str5 = str.toUpperCase().toLowerCase();
		System.out.println(str5); // cat, caterpillar

		String strA = "Cat   ";
		String str6 = strA.trim();
		System.out.println(str6); // "Cat"

		String strB = "  Cat";
		String str7 = strB.trim();
		System.out.println(str7); // "Cat"

		String strC = "  Cat   ";
		String str8 = strC.trim();
		System.out.println(str8); // "Cat"
		
		
	}

}
