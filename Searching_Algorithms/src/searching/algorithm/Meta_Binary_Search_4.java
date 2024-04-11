package searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Meta_Binary_Search_4
{
	/* meta Binary Search is nothing but the updated version of BINARY SEARCH, 
	   in this algorith the number of comparision are reduced compared to the
	   previous version 
	 */
	static int mbs(int arr[],int n,int x)
	{
		int Is=n;//Is is Interval _Size  
		while(Is>0)
		{
			int i=Math.min(n-1, Is)/2;
			int mid=arr[i];
			if (mid ==x)
				return i;
			else if(mid< x)
				Is=(n-i)/2;
			else
				Is=i/2;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = { -5, 4, 6, 8, -10,10, 11};
		// Sort the array
		Arrays.sort(arr);
		int n = arr.length;
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =mbs(arr,n,x);
		sc.close();
		if (s != -1)
			System.out.println("Element found by Meta Binary Search at index:"+s+"\nElement is:"+arr[s]);
		else
			System.out.println("Element:"+x+" is Not Found !!! 🙁\r\n");
	}
}
