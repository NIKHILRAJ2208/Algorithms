package sorting.algorithms;

import java.util.Arrays;

public class Shell_Sort_11 
{
	static int sort(int arr[])
    {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for ( j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int arr[] = {12, 34, 54, 2, 3};
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        sort(arr);
		System.out.println("Shell Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");

    }
}
