package sorting.algorithms;

import java.util.Arrays;

public class Radix_Sort_8 
{
	static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < n; i++)// Store count of occurrences in count[]
            count[(arr[i] / exp) % 10]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    static void radixsort(int arr[], int n)
    {
        int m = getMax(arr, n);    
        /*
         Do counting sort for every digit. Note that-
         instead of passing digit number, exp is passed.
         exp is 10^i where i is current digit number
        */
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    public static void main(String[] args)
    {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        int n = arr.length;        
        radixsort(arr, n);
		System.out.println("Radix  Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");

    }
}
