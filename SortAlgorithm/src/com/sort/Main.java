package com.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.alghorithms.Alghoritms;
import com.alghorithms.Candy;

import InputOutput.PrintNStairs;

public class Main {

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
	
	
public static void main(String[] args) {
		
	int[] array = {1, 2, 3, 4, 5};

		sum(array);
	}
}