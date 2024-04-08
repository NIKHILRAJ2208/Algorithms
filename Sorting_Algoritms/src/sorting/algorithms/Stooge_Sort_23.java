package sorting.algorithms;

import java.util.Arrays;

public class Stooge_Sort_23
{
	static void stoogesort(int arr[], int l, int h) 
    { 
        if (l >= h) 
            return; 
        if (arr[l] > arr[h]) { 
            int t = arr[l]; 
            arr[l] = arr[h]; 
            arr[h] = t; 
        }
        if (h - l + 1 > 2) { 
            int t = (h - l + 1) / 3;
            stoogesort(arr, l, h - t); 
            stoogesort(arr, l + t, h);
            stoogesort(arr, l, h - t); 
        } 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = { 2, 4, 5, 3, 1 }; 
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
		int n = arr.length; 
        stoogesort(arr, 0, n - 1); 
		System.out.println("Stooge Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");

    } 
}
