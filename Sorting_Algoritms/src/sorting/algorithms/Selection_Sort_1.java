package sorting.algorithms;

import java.util.Arrays;

public class Selection_Sort_1 
{
	static void selection_sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
		{ 
			int min_i= i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_i]) 
					min_i = j; 
			int temp = arr[min_i]; 
			arr[min_i] = arr[i]; 
			arr[i] = temp; 
		} 
	} 
public static void main(String args[]) 
	{ 
		int arr[] = {3,2,5,6,9,10,1,4,8,7}; 
		System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
		long t1=System.currentTimeMillis();
		selection_sort(arr); 
		System.out.println("Selection Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
	}
}
