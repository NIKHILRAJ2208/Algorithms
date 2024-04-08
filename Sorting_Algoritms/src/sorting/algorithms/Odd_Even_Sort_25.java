package sorting.algorithms;

import java.util.Arrays;

public class Odd_Even_Sort_25 {

	public static void oddEvenSort(int arr[], int n)
    {
        boolean isSorted = false; // Initially array is unsorted
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;
            // Perform Bubble sort on odd indexed element
            for (int i=1; i<=n-2; i=i+2)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
            // Perform Bubble sort on even indexed element
            for (int i=0; i<=n-2; i=i+2)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return;
    }
    public static void main (String[] args)
    {
        int arr[] = {34, 2, 10, -9};
        long t1=System.currentTimeMillis();
        int n = arr.length;
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        oddEvenSort(arr, n);
		System.out.println("Odd/Even....Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
    }
}
