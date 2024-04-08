package sorting.algorithms;

import java.util.Arrays;

public class Cycle_Sort_15 
{
	public static void cycleSort(int arr[], int n)
    {
		@SuppressWarnings("unused")
		int w = 0;
        for (int cs = 0; cs <= n - 2; cs++) 
        {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;
            if (pos == cs)
                continue;
            while (item == arr[pos])
                pos += 1;
           if (pos != cs) 
           {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                w++;
            }
             while (pos != cs) 
             {
                pos = cs;
                for (int i = cs + 1; i < n; i++)
                    if (arr[i] < item)
                        pos += 1;
                 while (item == arr[pos])
                    pos += 1;
                 if (item != arr[pos]) 
                 {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    w++;
                }//end of if
            }//end of while
        }//end of for
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 8, 3, 9, 10, 10, 2, 4 };
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        int n = arr.length;
        cycleSort(arr, n);
		System.out.println("Cycle Sorted array :"+ Arrays.toString(arr)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
    }
}
