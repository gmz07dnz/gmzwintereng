package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassByValuePassByReference {

	
	/*
	   If original value is not updated, it is called immutable class.
	   If original value is updated, it is called mutable class.
	 */
	
	 
	public static void main(String[] args) {
		
		int price = 100; 
		
		System.out.println(discount(price)); // calling method is not enough to update the original value
		System.out.println(price );  // 100 -> it doesn't change
		
		price = discount(price); // if you wanna update the original value, you must assign
		System.out.println(price );  // 90 _ Because of assignmet, the original value changed
		
		
		String str = "Java";
		System.out.println(concatenate(str)); // JavaX
		System.out.println(str);  // Java

	
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println(updateAllElements( list));  // [14, 15, 16]
		System.out.println(list);  // [14, 15, 16]
		
		
		Scanner scan  = new Scanner (System.in);
		System.out.println("Enter a String");  // when java says enter a string, the container already has been ready
		String d = scan.next();
		
		
		String a = "Java";
		String b = "Java";  
		String c = new String ("Java");
		System.out.println(a + "-" + b + "-" + c);  // Java-Java-Java
		System.out.println(a == b);  // true -- because of String Pool
		System.out.println(a.equals(b)); // true
		
		System.out.println(a==c); // false -- c is new object
		System.out.println(a.equals(c)); // true  -- value -> equal  ----    ref-> not equal, equals() method doesn't check the ref
	     
		System.out.println(a == d); // false
		System.out.println(a.equals(d)); // User enter "Java"  ==> true  -- value -> equal  ----    ref-> not equal equals() method doesn't check the ref
		

	
	}

	public  static int discount(int price) {
	    price = price -10;
	    return price;
	}
	
	
	public  static String concatenate(String str) {
	    str = str+ "X";
	    return str;
	}
	
	public  static List<Integer> updateAllElements(List<Integer> list) {
	
		for (int i =0; i<list.size(); i++) {
			list.set(i, list.get(i)+3);
			
		}
	
		return list;
		
	}
	

}
