package questionAndSolution;

import java.util.Arrays;

public class MinMaxSumInArray {
	public static void sum(int[] array) {
		int min = 0;
		int max = 0;
		int sum = 0;
		int[] temp = new int[array.length];
		
		for(int i=0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		for(int i=0; i < array.length; i++ ) {
			temp[i] = sum-array[i];
		}
		
		Arrays.sort(temp);
		
		min = temp[0];
		max = temp[array.length-1];
		System.out.println(min + " " + max);
	}

}
