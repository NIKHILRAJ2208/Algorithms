package sorting.algorithms;

import java.util.Arrays;

public class Merge_Sort_4 
{
	 void merge(int arr[], int l, int m, int r)
	 {
		 int n1 = m - l + 1;//4-0+1=3
	     int n2 = r - m;//9-4=5
	     int L[] = new int[n1];//size=3
	     int R[] = new int[n2];//size=5
	     for (int i = 0; i < n1; ++i)
	    	 L[i] = arr[l + i];
	     for (int j = 0; j < n2; ++j)
	    	 R[j] = arr[m + 1 + j];
	     int i = 0, j = 0,k = l;;
	     while (i < n1 && j < n2) 
	     {
	    	 if (L[i] <= R[j]) 
	    	 {
	    		 arr[k] = L[i];
	    		 i++;
	         }
	    	 else 
	    	 {
	    		 arr[k] = R[j];
	    		 j++;
	    	 }
	    	 k++;
	     }//end of while
	     while (i < n1) 
	     {
	    	 arr[k] = L[i];
	    	 i++;
	    	 k++;
	     }//end of while
	     while (j < n2) 
	     {
	    	 arr[k] = R[j];
	    	 j++;
	    	 k++;
	     }//end of while
	  }
	 void sort(int arr[], int l, int r)//l=0,r=9
	 {
		 if (l < r) 
		 {
			 int m = l + (r - l) / 2;//m=0+(9-1)/2=> m=4
			 sort(arr, l, m);//l=0,m=4
			 sort(arr, m + 1, r);//m=4,r=9
			 merge(arr, l, m, r);//l=0,m=4,r=9
		 }
}
	 public static void main(String args[])
	 {
		 int[] numbers = {3,2,5,6,9,10,1,4,8,7};
	     System.out.println("Given Unsorted Array :"+Arrays.toString(numbers)+"\n");
	     long t1=System.currentTimeMillis();
	     new Merge_Sort_4().sort(numbers, 0, numbers.length-1);
	     long t2=System.currentTimeMillis();
	     System.out.println("Merge Sorted array :"+Arrays.toString(numbers)+"\n");
	     System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
	 }
}
