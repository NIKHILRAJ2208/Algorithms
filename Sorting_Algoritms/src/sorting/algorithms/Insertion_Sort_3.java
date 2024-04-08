package sorting.algorithms;

import java.util.Arrays;

public class Insertion_Sort_3 
{
	static void insertionsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }//end of while loop 
            arr[j + 1] = key;
        }//end of loop
    }
	public static void main(String[] args) 
	{
		 int[] numbers = {3,2,5,6,9,10,1,4,8,7};
	     System.out.println("Given Unsorted Array :"+Arrays.toString(numbers)+"\n");
	     long t1=System.currentTimeMillis();
	     insertionsort(numbers);
	     long t2=System.currentTimeMillis();
	     System.out.println("Insertion Sorted array :"+Arrays.toString(numbers)+"\n");
	     System.out.println("Completed in :"+(t2-t1)+" Milli Sec");	
	}
}
