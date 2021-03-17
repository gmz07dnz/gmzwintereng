package day21accessmodifiersstringbuilder;

public class AccessModifier02 {
	/*
	 1 ) to access a class member in another clas you have 2 ways
	      a- you can use "class name" -> use that way for "static class members"
	      b- you can use object of the class -> use that way for "non-static class members"
	  2) If sth is private, you can not access to it from classes 
	 3) If you do not tyoe anything for access modifier, it means access modifier is "default"
	 4) if sth is public, it is accessible from each packages
	 
	 NOTE:   If a class member has "default" access modifier, then you can not access to it form another packages
	                "default" and "package private " are synonyms
	             
	  5) In Java, some classes can be "child"  of another classes.
	  If sth is "protected", they can be accessed from child classes      
	                
	 */

	public static void main(String[] args) {

		AccessModifier01 obj = new AccessModifier01();
		System.out.println(obj.name); // Ali Can
		System.out.println(obj.schoolName); // FIU

	}

}
