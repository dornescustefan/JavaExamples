package questionAndSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Make out the amount=amount from the a given Array of Bank notes
 * */
public class BankNotesIntoMoney {

    //int[] notes = {50, 20, 10, 5,  2, 1 };
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
