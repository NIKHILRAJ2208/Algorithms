package sorting.algorithms;

import java.util.Arrays;

public class Comb_Sort_13 
{
	static int getNextGap(int gap)
    {
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }
    static void sort(int arr[])
    {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
        while (gap != 1 || swapped == true)
        {
            gap = getNextGap(gap);
            swapped = false;
            for (int i=0; i<n-gap; i++)
            {
                if (arr[i] > arr[i+gap])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;
                    swapped = true;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
		long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        sort(arr);
		System.out.println("Comb Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
    }
}
