package com.sort;

import java.util.Arrays;

import com.alghorithms.Alghoritms;
import com.alghorithms.Candy;

public class Main {

public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 1, 2, 4};
		
		int[] result = Candy.divideSamplesArray(array);
		//int[] result = Candy.concatTwoArrays(array, array1);
		//int[] result = Candy.removeElementFromArray(array1, 2);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.toString(result));
	}
}