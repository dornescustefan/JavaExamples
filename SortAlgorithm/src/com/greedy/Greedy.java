package com.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greedy {
	
	
	
	public static int[] makeOut(int[] notes, int amount ) {
				
		List<Integer> resultList = new ArrayList<>();
		Arrays.sort(notes);
		
		for(int i= notes.length-1; i>=0; i--) {
			
			while (amount >= notes[i])
			{
				amount = amount - notes[i];
				resultList.add(notes[i]);
			}
		}
		
		int[] result = resultList.stream()
				  				.mapToInt(i->i)
				  				.toArray();
		return result;
		}

}
