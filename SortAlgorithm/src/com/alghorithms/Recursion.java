package com.alghorithms;

	//Factorial
	public class Recursion {
	public static int factorial(int n) {
		if (n <= 1) 
			return 1;
		else
			return n * factorial(n-1);
			
	}

	public static long fibonacci1(int n) {
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	    return fibonacci1(n-1) + fibonacci1(n-2);
	} 
    //Fibonacci without recursion
	public static long fibonacci(int n) {
	    long[] f = new long[n+1];
	    f[0] = 0;
	    f[1] = 1;
	    for (int i = 2; i <= n; i++)
	        f[i] = f[i-1] + f[i-2];
	    return f[n];
	}
	
	public static void moves(int n, boolean left) {
        if (n == 0) return;
        	moves(n-1, !left);
        	
        	if (left) System.out.println(n + " left");
        	
        	else      System.out.println(n + " right");
        	
        	moves(n-1, !left);
    }
	

}
