package sorting.algorithms;

import java.util.Arrays;

public class Bitcoin_Sort_18 
{
	static void compAndSwap(int a[], int i, int j, int dir)
    {
        if ( (a[i] > a[j] && dir == 1) ||
             (a[i] < a[j] && dir == 0))
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
   static void bitonicMerge(int a[], int low, int cnt, int dir)
    {
        if (cnt>1)
        {
            int k = cnt/2;
            for (int i=low; i<low+k; i++)
                compAndSwap(a,i, i+k, dir);
            bitonicMerge(a,low, k, dir);
            bitonicMerge(a,low+k, k, dir);
        }
    }
   static void bitonicSort(int a[], int low, int cnt, int dir)
   {
	   if (cnt>1)
	   {
		   int k = cnt/2;
		   bitonicSort(a, low, k, 1);
		   bitonicSort(a,low+k, k, 0);
		   bitonicMerge(a, low, cnt, dir);
        }	
    }
    static void sort(int a[], int N, int up)
    {
        bitonicSort(a, 0, N, up);
    }
    public static void main(String args[])
    {
        int a[] = {3, 7, 4, 8, 6, 2, 1, 5};
        long t1=System.currentTimeMillis();
        int up = 1;
        sort(a, a.length,up);
        System.out.println("Given Unsorted Array:"+Arrays.toString(a)+"\n");
		System.out.println("Bitcoin Sorted array :"+ Arrays.toString(a)+"\n");
	    long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
	}
}

