package com.alghorithms;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;

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
	
	public static int factorial(int n) {
		if (n <= 1) 
			return 1;
		else
			return n * factorial(n-1);
			
	}

	public static void moves(int n, boolean left) {
        if (n == 0) return;
        	moves(n-1, !left);
        	
        	if (left) System.out.println(n + " left");
        	
        	else      System.out.println(n + " right");
        	
        	moves(n-1, !left);
    }
	
	public static long fibonacci1(int n) {
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	    return fibonacci1(n-1) + fibonacci1(n-2);
	} 

	public static long fibonacci(int n) {
	    long[] f = new long[n+1];
	    f[0] = 0;
	    f[1] = 1;
	    for (int i = 2; i <= n; i++)
	        f[i] = f[i-1] + f[i-2];
	    return f[n];
	}
	
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
	
	public static void fileReadWrite()  {
		FileWriter out = null;
		try {
			out = new FileWriter("text.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	    try {
	    	Random random = new Random();
	    	int r = random.nextInt(500);
	    	for(int i = 0; i < r; i++) {
			out.write("Id: " + i + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    FileReader in = null;
		try {
			in = new FileReader("text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    Scanner src = new Scanner(in);
	    while (src.hasNext()){
	    	System.out.println(src.next());
	    }
	    src.close();
	}
	
	public static void drawCanvas() {
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new Canvas();
		canvas.setSize(400, 400);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
		}
	public static void paint(Graphics g) {
		g.fillOval(100, 100, 200, 200);
		}
	
	public static int  binarySearch(int arr[], int l, int r, int x)
	    {
	        if (r>=l)
	        {
	            int mid = l + (r - l)/2;
	 
	            // If the element is present at the 
	            // middle itself
	            if (arr[mid] == x)
	               return mid;
	 
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray
	            if (arr[mid] > x)
	               return binarySearch(arr, l, mid-1, x);
	 
	            // Else the element can only be present
	            // in right subarray
	            return binarySearch(arr, mid+1, r, x);
	        }
	 
	        // We reach here when element is not present
	        //  in array
	        return -1;
	    }
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
