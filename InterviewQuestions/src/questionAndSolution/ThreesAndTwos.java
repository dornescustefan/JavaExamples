package questionAndSolution;

public class ThreesAndTwos {

	public static  boolean checkThreeAndTwo(char[] chars) {
	      boolean result = false;
	     int counter=1;
	     for(int i=1; i<chars.length; i++) {
	    	 
	    		 if(chars[0] == chars[i]) {
	    			 counter++;
	    		 	 
	    	 }
	    	 
	     }
	      
	     if (counter >= 3) {
	    	 result=true;
	     }
	      System.out.print(counter);
	      return result;
	    }
}
