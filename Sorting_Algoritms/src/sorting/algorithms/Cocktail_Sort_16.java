package sorting.algorithms;

import java.util.Arrays;

public class Cocktail_Sort_16 
{
	static void cocktailSort(int a[])
    {
        boolean swapped = true;
        int start = 0, end = a.length;
        while (swapped == true) 
        {
            swapped = false;
            for (int i = start; i < end - 1; ++i) 
            {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
            swapped = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--) 
            {
                if (a[i] > a[i + 1]) 
                {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }
    public static void main(String[] args)
    {
        int a[] = { 5, 1, 4, 2, 8, 0, 2 };
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(a)+"\n");
        cocktailSort(a);
		System.out.println("Cock tail Sorted array :"+ Arrays.toString(a)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
        
    }
}
