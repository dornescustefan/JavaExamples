package com.alghorithms;

public class BubbleSort {

	public static int[] bubbleSort(int[] a) {
	int[] result = new int[a.length];

	for(int i=0; i<a.length; i++){
			for(int j=1; j<(a.length-i); j++)
			{
  			if(a[j-1]>a[j]){
				int temp;
				temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
				}
			}
		}
		result = a;
		System.out.println("Array after sorting:");
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		return result;
	}

}
