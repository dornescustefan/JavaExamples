package questionAndSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*Divide Array in half so the result has the most different values left */
public class Candy {
	 
	// Converts an Integer array to an ArrayList 
	public static ArrayList<Integer> turnArrayToLIst(int[] Array) {
		
		ArrayList<Integer> ResultList = new ArrayList<Integer>();;
		
		for(int i=0; i < Array.length; i++) {
			ResultList.add(Array[i]);
		}
		
		return ResultList;
	}
	 // Using  ArrayList
	public static int[] divideSamples(int[] arr ){
				
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		resultList = turnArrayToLIst(arr);
		Collections.sort(resultList);
		
		for(int i=0; i< resultList.size(); i++) {
			for(int j = 1; j < resultList.size()-i; j++) {

				if(resultList.get(i) == resultList.get(j)) {
				
					while(resultList.size() !=  arr.length/2) {
					resultList.remove(j);
					
					}
				}
			}
		}
		
		int[] result = resultList.stream()
  				.mapToInt(i->i)
  				.toArray();
		return result;
		}
	
	// Using  Arrays
	public static int[] concatTwoArrays(int[] first, int[] second) {
		  int[] result = Arrays.copyOf(first, first.length + second.length);
		  System.arraycopy(second, 0, result, first.length, second.length);
		  return result;
		}
	public static int[] removeElementFromArray( int [] arr, int remIndex )
	{
		int[] result = new int[arr.length-1];
		List<Integer>  aList= new ArrayList<Integer>(); 
		for(int i=0; i< arr.length; i++) {
		aList.add(arr[i]);
		}
		aList.remove(remIndex);
		for(int j=0; j<aList.size(); j++) {
			result[j] = aList.get(j);
		}
				
		return result;
		
	}
	
	public static int[] divideSamplesArray(int[] array) {
		List<Integer> resultList = new ArrayList<Integer>();
		Integer[] a = {};
		
		resultList = Arrays.asList(a);
		int[] result = new int[array.length];	
		int[] mary = new int[array.length];	
		int[] remain = new int[array.length];	
		
		Arrays.sort(array);
		
		for(int i=0; i < array.length; i++) {
			for(int j=1; j< array.length-i; j++) {
				
				if(array[i] == array[j])
				{
					remain[i] = array[j];
					//removeElementFromArray(array, j);
				}
				else{
					mary[i] = array[j];
				}
				
			}
		}
		
		return mary;
	}
}
