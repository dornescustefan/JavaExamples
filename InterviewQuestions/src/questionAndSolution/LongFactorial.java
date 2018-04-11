package questionAndSolution;

import java.math.BigInteger;
/*
 * Calculate the the factorial of 25
 * */
public class LongFactorial {
	
	private static BigInteger factorial(int n) {
		long m = n;
		if (m <= 1) 
			return BigInteger.ONE;
		else
			BigInteger.valueOf(m);
			return BigInteger.valueOf(m).multiply(factorial(n-1));
					
	}
	
	private static BigInteger getFactorial(int num) {
	    BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <= num; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    return fact;
	}
	public static void extraLongFactorials(int n) {
		//BigInteger result = getFactorial(n);
		BigInteger result = factorial(n);
      	
      	System.out.println(result);
		
	}
}
