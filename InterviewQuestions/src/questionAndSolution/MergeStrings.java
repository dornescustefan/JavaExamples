package questionAndSolution;

/*Merge 2 String and return one String*/
public class MergeStrings {
	
	public static String mergeStrings(String s1, String s2) {
        String result = null;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        char[] rArray = new char[s1Array.length + s2Array.length];
               
       //Merge in s1Array to result Array
        for(int i=0, j=0; i<s1Array.length;i++, j+=2) {
        	rArray[j] = s1Array[i];
        }
      //Merge in s2Array to result Array
        rArray[1] = s2Array[0];
        for(int i=1, j=3; i<s2Array.length;i++, j+=2) {
        	rArray[j] = s2Array[i];
        }
                
        //Print out the inputs and results
        System.out.println("First string as array:");
        for(int i=0; i< s1Array.length; i++) {
                	System.out.print(s1Array[i]+" ");
                }
        System.out.println();
        System.out.println("Second string as array:");
        for(int i=0; i< s2Array.length; i++) {
        	System.out.print(s2Array[i]+" ");
        }
        System.out.println();
        result = new String(rArray);
        System.out.println();
        System.out.println("Result String after merging:");
        System.out.println(result.toString());
	return result;
	}

}
