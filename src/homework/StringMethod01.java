package homework;


public class StringMethod01 {

	public static void main(String[] args) {
		       String str = "Cat, caterpillar";

				int idx1 = str.indexOf("c"); 
				System.out.println(idx1); // 5
				
		    	int idx2 = str.indexOf("cat");
		    	System.out.println(idx2); //  5
		    	
     			int idx3 = str.indexOf("s");
     			System.out.println(idx3); // -1
     			
     			int idx4 = str.indexOf("CAT");
     			System.out.println(idx4); // -1
     			
				int idx5 = str.indexOf("ter");
				System.out.println(idx5); //  7
				
				int idx6 = str.indexOf("pars");
				System.out.println(idx6); // -1

				int idx7 = str.indexOf("a" , 3 );
				System.out.println(idx7); //  6
				
				int idx8 = str.indexOf("at", 2);
				System.out.println(idx8); // 6
				
				int idx9 = str.indexOf("at", 8);
				System.out.println(idx9); // -1
		    	
		    	
		    	

	}

}
