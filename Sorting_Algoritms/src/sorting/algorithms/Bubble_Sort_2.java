package sorting.algorithms;

import java.util.Arrays;

public class Bubble_Sort_2 
{
	static void bubbleSorting(int[] arr)
	   {
	       int n = arr.length;
	       for (int i = 0; i < n-1; i++) 
	       {
	           for (int j = 0; j < n-i-1; j++) 
	           {
	               if (arr[j] > arr[j+1]) 
	               {
	                   int temp = arr[j];
	                   arr[j] = arr[j+1];
	                   arr[j+1] = temp;
	               }//end of if 
	           }//end of loop 2
	       }//end of loop 1
	   }//end of method
public static void main (String [] args)
{
  int[] numbers = {3,2,5,6,9,10,1,4,8,7};
  System.out.println("Given Unsorted Array :"+Arrays.toString(numbers)+"\n");
  long t1=System.currentTimeMillis();
  bubbleSorting(numbers);
  long t2=System.currentTimeMillis();
  System.out.println("Bubble Sorted array :"+Arrays.toString(numbers)+"\n");
  System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
}
}
