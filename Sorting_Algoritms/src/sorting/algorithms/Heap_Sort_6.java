package sorting.algorithms;

import java.util.Arrays;

public class Heap_Sort_6 
{
	public static  void sort(int arr[])
    {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    static void heapify(int arr[], int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1; 
        int r = 2 * i + 2;
        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        sort(arr);
        System.out.println("Heap Sorted array :"+ Arrays.toString(arr)+"\n");
        long t2=System.currentTimeMillis();
        System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
       
    }
}
