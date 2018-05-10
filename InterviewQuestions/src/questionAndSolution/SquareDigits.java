package questionAndSolution;

public class SquareDigits {
	public static int squareDigits(int n) {
		 String r="";		 
		 char[] charArray = Integer.toString(n).toCharArray();
		 int[] resultInt = new int[charArray.length];		
		 for(int i=0; i<resultInt.length; i++) {
			 resultInt[i] = Integer. parseInt(String. valueOf(charArray[i])) * Integer. parseInt(String. valueOf(charArray[i]));
		     r = r + resultInt[i];
		 }
		 
		 
		 int result=0;
		 result = Integer.parseInt(r);
		 System.out.println(result);
		 return result;
		 
		  }
	/*public static int squareDigits(int n) {
	 
	int result=0;
	String output=""; 
	int divider = 10;
	 int rounder =1;
	 while (n > 0) {
		 int temp = n%divider;
		 n = n - temp;
		 divider = divider*10;
		 result = (temp/rounder)*(temp/rounder);
		 output = output + result;
		 rounder = rounder * 10;
		 
	 };
	 
	 
	 
	 System.out.print(output + " ");
	return result;	
	 }*/
	
	/*
	    String result = ""; 
    
    while (n != 0) {
      int digit = n % 10 ;
      result = digit*digit + result ;
      n /= 10 ;
    }
    
    return Integer.parseInt(result) ;
  }
 
	 */
	 

}
