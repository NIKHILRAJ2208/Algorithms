package sorting.algorithms;

import java.util.Arrays;

public class Bogo_Sort_20 {
	static void bogoSort(int[] a)
    {
        while (isSorted(a) == false)
            shuffle(a);
    }
    static void shuffle(int[] a)
    {
        for (int i = 1; i < a.length; i++)
            swap(a, i, (int)(Math.random() * i));
    }
    static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static boolean isSorted(int[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }
    public static void main(String[] args)
    {
        int[] a = { 3, 2, 5, 1, 0, 4 }; 
        long t1=System.currentTimeMillis();
        bogoSort(a);
        System.out.println("Given Unsorted Array:"+Arrays.toString(a)+"\n");
		System.out.println("Bogo Sorted array :"+ Arrays.toString(a)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
	
    }
}
