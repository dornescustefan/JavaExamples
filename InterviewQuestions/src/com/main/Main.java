package com.main;

import java.util.ArrayList;

import questionAndSolution.MergeStrings;
import questionAndSolution.SquareDigits;
import questionAndSolution.ThreesAndTwos;

public class Main {
	public static String order(String words) {
	    words = "is2 Thi1s T4est 3a";
		String result = new String();
	    String[] array = words.split("\\s");
	    String[] sortedArray=new String[array.length];
	   
	    if(words.isEmpty()){
	    	return  result;
	    }
		    
	    for(int i=0; i< array.length; i++) {
	    			
	    		if(array[i].indexOf('1')>=0) {
	    	       sortedArray[0] = array[i];
	    	    }
	    		if(array[i].indexOf('2')>=0) {
		    	       sortedArray[1] = array[i];
		    	    } 
	    		if(array[i].indexOf('3')>=0) {
		    	       sortedArray[2] = array[i];
		    	    } 
	    		if(array[i].indexOf('4')>=0) {
		    	       sortedArray[3] = array[i];
		    	    } 
	    	
	    		if(array[i].indexOf('5')>=0) {
		    	       sortedArray[4] = array[i];
		    	    } 
	    	
	    		if(array[i].indexOf('6')>=0) {
		    	       sortedArray[5] = array[i];
		    	    }
	    		if(array[i].indexOf('7')>=0) {
		    	       sortedArray[6] = array[i];
		    	    } 
	    		if(array[i].indexOf('8')>=0) {
		    	       sortedArray[7] = array[i];
		    	    } 
	    		if(array[i].indexOf('9')>=0) {
		    	       sortedArray[8] = array[i];
		    	    } 
	    }
	    
	    
	    for(int i=0; i<sortedArray.length; i++) {
	    	result = result + sortedArray[i]+ " ";
	    }
	    result = result.substring(0, result.length() - 1);
	    System.out.println(result);
	    return result;
	    		
	  } 
	
	
	

	public static void main(String[] args) {
    int[] array = {57,56,81,38,30,1,9,23,69,24,44,69,12,61,50,84,3,17,91,39,26,18,66,76,31,42,52,21,
					55,57,18,3,97,85,78,45,94,39,90,93,60,73,93,32,8,57,19,52,4,97,32,85,39,75,27,54,0};
    String s1 = "ABCDEF";
    String s2 = "hJKLMN";
    char[] c = {'a', 'a', 'a', 'b', 'b'};
    order(s2);
    //MinMaxSumInArray.sum(array);
    //BirthDayCake.birthdayCakeCandles(4, array);
	//StringToTime.stringToTime("07:05:40PM");
	//GradingStudents.gradingStudents(array);
	//LongFactorial.extraLongFactorials(10000);
	//MergeStrings.mergeStrings(s1, s2);
    //SquareDigits.squareDigits(93456);
	///ThreesAndTwos.checkThreeAndTwo(c);
	}

}
