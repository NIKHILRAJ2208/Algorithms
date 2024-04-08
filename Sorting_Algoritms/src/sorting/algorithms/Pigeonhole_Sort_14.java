package sorting.algorithms;

import java.util.Arrays;

public class Pigeonhole_Sort_14 
{
	public static void pigeonhole_sort(int arr[],int n)
	{
			int min = arr[0];
			int max = arr[0];
			int range, i, j, index; 
			for(int a=0; a<n; a++)
			{
				if(arr[a] > max)
					max = arr[a];
				if(arr[a] < min)
					min = arr[a];
			}
			range = max - min + 1;
			int[] phole = new int[range];
			Arrays.fill(phole, 0);
			for(i = 0; i<n; i++)
				phole[arr[i] - min]++;
			index = 0;
			for(j = 0; j<range; j++)
				while(phole[j]-->0)
					arr[index++]=j+min;
	}
		public static void main(String[] args)
		{
			int[] arr = {8, 3, 2, 7, 4, 6, 8};
			long t1=System.currentTimeMillis();
			System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
			pigeonhole_sort(arr,arr.length);
			System.out.println("Pigeon Hole Sorted array :"+ Arrays.toString(arr)+"\n");
			long t2=System.currentTimeMillis();
			System.out.println("Completed in :"+(t2-t1)+" Milli Sec");

		}
}
