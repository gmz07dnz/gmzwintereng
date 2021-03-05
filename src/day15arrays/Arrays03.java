package day15arrays;

import java.util.Arrays;

public class Arrays03 {

	/*
	 One more String Method ...
	 split() method is used to split a String by using specific character/s
	 split() method puts the splitted parts into an array
	 */
	
	public static void main(String[] args) {
		
		String str = "JavaGood";

		// str.split("a"); -> split() method needs the array to put the element in it

		String arr[] = str.split("a");
		System.out.println(Arrays.toString(arr)); // [ J, v, Good];

		// if you wanna count the number of characters you can use str.split();
		String arr1[] = str.split("");
		System.out.println(Arrays.toString(arr1)); // [J, a, v, a, G, o, o, d]
		System.out.println("Number of characters: " + arr1.length);
		
		String str2 = "Ali Can come here";
		
		// How can count number of words
		String arr3[] = str2.split(" ");
		System.out.println(Arrays.toString(arr3));  // [Ali, Can, come, here]
		System.out.println("Number of characters: " + arr3.length);

	}

}
