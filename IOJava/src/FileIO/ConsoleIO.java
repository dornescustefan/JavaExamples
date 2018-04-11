package FileIO;

import java.util.Scanner;

public class ConsoleIO {
	
	public static int divisionRest() {
		int i = 0;
		int j = 0;
		int k= 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("First number:");
		i = in.nextInt();
		
		System.out.println("Second number:");
		j = in.nextInt();
		
		k = i % j;
		System.out.println("Division rest =" + k);
		in.close();
		return k;
	
	}
	

}
