package sorting.algorithms;

import java.util.Arrays;

public class Quick_Sort_5 
{
	static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 static int partition(int[] arr, int low, int high)
 {
	 int pivot = arr[high];
	 int i = (low - 1);
	 for (int j = low; j <= high - 1; j++) 
     {           
		 if (arr[j] < pivot)// If current element is smaller than the pivot 
		 {
			 i++; // Increment index of smaller element
			 swap(arr, i, j);
		 }	
     }
	 swap(arr, i + 1, high);
	 return (i + 1);
 }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
   static void quickSort(int[] arr, int low, int high)
   {
	   if (low < high) {
		   int pi = partition(arr, low, high);// pi is partitioning index, arr[p] is now at right place 
		   quickSort(arr, low, pi - 1);// Separately sort elements before partition and after partition
		   quickSort(arr, pi + 1, high);
        }
   }
   public static void main(String[] args)
   {
	   int[] numbers = {3,2,5,6,9,10,1,4,8,7};
	   int N = numbers.length;
	   System.out.println("Given Unsorted Array :"+Arrays.toString(numbers)+"\n");
	   long t1=System.currentTimeMillis();
	   quickSort(numbers, 0, N - 1);
	   long t2=System.currentTimeMillis();
	   System.out.println("Quick Sorted array :"+Arrays.toString(numbers)+"\n");
	   System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
   }
}
