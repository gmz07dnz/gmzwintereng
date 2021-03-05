package homework;

public class TernaryWhatDoYouSeeOnConsole {

	public static void main(String[] args) {
		
		
		int y = 112;
		System.out.println( (y > 5) ? (21) : ("Zebra") ); //  21
		
		System.out.println((y < 91) ? 9 : "Horse"); //  Horse

		int y1 = 1;
		int z = 1;
		int result = y1<10 ? y1++ : z++;  // y1++ is put in the result container 
		System.out.println(y1 + "" + z); // 21
		System.out.println(result); //  like that  System.out.println(y1++); it is printed as 1 because of the post incerement, but value of y1 will be 2 
		
	}

}
