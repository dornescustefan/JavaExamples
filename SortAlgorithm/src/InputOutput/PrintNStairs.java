package InputOutput;

public class PrintNStairs {
	
	public static void printNstairs(int n) {
	String hash = "#";
	String space = " ";
	String[] array = new String[n];
	
	for(int i=0; i < array.length; i++) {
		array[i] = space;
	}
	
	for(int i=array.length-1; i > -1; i--) {
		 for(int j=0; j < n; j++){
			 array[i] = hash;
			 System.out.print(array[j]);
		 }
	System.out.println();
	}
	}
}
