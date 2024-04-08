package sorting.algorithms;

import java.util.Arrays;

public class TIm_Sort_12
{
	static void flip(int arr[], int i)
    {
        int temp, start = 0;
        while (start < i)
        {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }
    static int findMax(int arr[], int n)
    {
        int mi, i;
        for (mi = 0, i = 0; i < n; ++i)
            if (arr[i] > arr[mi])
                mi = i;
        return mi;
    }
    static int pancakeSort(int arr[], int n)
    {
        for (int curr_size = n; curr_size > 1;--curr_size)
        {
            int mi = findMax(arr, curr_size);
            if (mi != curr_size-1)
            {
            	flip(arr, mi);
                flip(arr, curr_size-1);
            }
        }
        return 0;
    }
    public static void main (String[] args)
    {
        int arr[] = {23, 10, 20, 11, 12, 6, 7};
    	long t1=System.currentTimeMillis();
    	System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        int n = arr.length;
        pancakeSort(arr, n);
        System.out.println("Pancake Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");

    }
}
