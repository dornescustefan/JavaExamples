package com.alghorithms;

public class Alghoritms {
	
	public static int[] shiftArrayWithTwoArrays( int a1[]) 
	{
	        int a2[] = new int[a1.length];
	        
	        for(int i = 0; i < a1.length - 1; i++ ){
	        	a2[i+1] = a1[i];
	        }
	       
	        a2[0] = a1[a1.length - 1];
	        
	        
	       return a2;
	}
	
	public static int[] shiftArrayWithOneAAray( int a1[], int count ) 
	{
		for (int i = 0; i < count; i++){
	       
			int temp = a1[a1.length-1];
	        	for(int j = a1.length-2; j > -1; j-- ){
	        	
	        		a1[i+1] = a1[i];
	        }
	       a1[0] = temp;
		}   
	       return a1;
	}
	
	public static int[] shiftMultiple(int[] array, int count){
		int[] result = {};
		for (int i = 0; i < count; i++){
		result = shiftArrayWithOneAAray(array, count);
			}
		return result;
	}
	
	
	
	
	
	

}
