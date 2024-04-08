package sorting.algorithms;

import java.util.Arrays;

public class Gnome_Sort_21 
{
	static void gnomeSort(int arr[], int n) 
    { 
        int index = 0; 
        while (index < n) { 
            if (index == 0) 
                index++; 
            if (arr[index] >= arr[index - 1]) 
                index++; 
            else { 
                int temp = 0; 
                temp = arr[index]; 
                arr[index] = arr[index - 1]; 
                arr[index - 1] = temp; 
                index--; 
            } 
        } 
        return; 
    }  
    public static void main(String[] args) 
    { 
        int arr[] = { 34, 2, 10, -9 }; 
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        gnomeSort(arr, arr.length); 
        System.out.print("Gnome sorted: "+ Arrays.toString(arr)+"\n");
        long t2=System.currentTimeMillis();
        System.out.println("\n"+"Completed in :"+(t2-t1)+" Milli Sec");
    }
}
