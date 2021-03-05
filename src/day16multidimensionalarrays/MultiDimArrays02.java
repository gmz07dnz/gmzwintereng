package day16multidimensionalarrays;

public class MultiDimArrays02 {

	/*
	 Find the sum of all elements in a multidimensional array
	 */
	public static void main(String[] args) {
		
		int arr[][] = { {3, 4}, {5}, {6,7,9}, {11, 21}  };
		
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			for(int k= 0; k<arr[i].length;k++) {
				sum = sum +  arr[i][k] ;
			}
		}
		System.out.println(sum);

	}

}
