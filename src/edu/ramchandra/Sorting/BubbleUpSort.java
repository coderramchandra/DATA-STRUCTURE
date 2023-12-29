package edu.ramchandra.Sorting;

import java.util.Arrays;

public class BubbleUpSort {
	public static void main(String[] args) {
		int[] ar= {21,34,19,78,56,44};
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(ar));
		bubbleUpSort(ar);
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(ar));

	}

	static void bubbleUpSort(int[] ar) {
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}

	}
}
