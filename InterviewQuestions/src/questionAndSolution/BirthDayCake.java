package questionAndSolution;

import java.util.Arrays;

public class BirthDayCake {
	
	 public static int birthdayCakeCandles(int n, int[] ar) {
	         
		 Arrays.sort(ar);
		 int heighest = ar[n-1];
		 int result=1;
		 
	     for(int i = 0; i < n-1; i++) {
	   	   		if(ar[i] == heighest) {
	   	   			result++;
	   	   		}
	     }
	    
	     System.out.print(result);
	     return result;
	 }

}
