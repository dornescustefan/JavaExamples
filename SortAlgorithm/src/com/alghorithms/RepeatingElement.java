package com.alghorithms;

import java.util.Arrays;

public class RepeatingElement {
	public static int sprintRepeating(int T[]) 
	{
		int result = 0;
		
		Arrays.sort(T);
		
		// Set<Integer> hashSet = new HashSet<Integer>();

		  /*  for(int i=0; i < T.length; i++){
		        boolean unique = hashSet.add(T[i]);
		        
		        if(unique == false)
		            System.out.println("duplication " + T[i]);
		    } */
		
		for(int i = 0; i < T.length; i++) {
						
            for(int j = i+1; j < T.length; j++) {
               
            	if( T[i] == T[j] ) {
            		
            	System.out.print(" "+ T[i] + " "); 
            	result++; 
                }
            }
		}
		System.out.println();  
		return result;
	}

}
