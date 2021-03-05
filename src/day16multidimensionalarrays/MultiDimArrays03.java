package day16multidimensionalarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
	
		String arr[][] = { {"A", "B" }, {"K", "e"}, {"L","X",  "e"}};
		
		// By using given multidimensional array, print "Bee" on the console
		
		String result = "";
		for (int i = 0; i<arr.length; i++) {
				result = result+ arr[i][arr[i].length-1];
			
		}
         System.out.println(result);
         
         
         
         // homework
         // Find the multiplication of the first elements in every array
         
         int brr [][] = { {32, 12,11}, {21, 34}, {3} };
         
         int product =1;
         
         for (int i = 0; i<brr.length; i++) {
        	 product = product*brr[i][0];
         }
         System.out.println(product);
	}

}
