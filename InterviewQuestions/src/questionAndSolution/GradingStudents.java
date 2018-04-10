package questionAndSolution;
/*Round grades given in an array following rules*/
public class GradingStudents {
	public static int[] gradingStudents(int[] grades) {
       int[] result = new int[grades.length];
       int temp=0;
       for(int i=0; i < grades.length; i++) {
    	   if(grades[i]<38){
    		   result[i] = grades[i];       
    	   }
   	  
    	   else if(grades[i]>=38 && grades[i]<100) {
    		   
    		   if (grades[i]%5 >= 3){
    		   temp = grades[i];
    		   while(temp%5 != 0) {  
    			   temp = temp+1;
    			   result[i] = temp;
    			}
    		   }
    		   
    		   else if (grades[i]%5 < 3){
			   result[i] = grades[i];
    		   }
    		   
    		   else if (grades[i]%5 == 0) {
    		   result[i] = grades[i];
    		   }
    	   }
    	}
       System.out.println();
       System.out.println("Grades:");
       for(int i=0; i < grades.length; i++) {
    	   System.out.print(grades[i]+" ");
       }
       System.out.println();
       System.out.println("Grades rounded:");
       
       for(int i=0; i < result.length; i++) {
    	   System.out.print(result[i]+" ");
       }
       return result;
    }
	
}
