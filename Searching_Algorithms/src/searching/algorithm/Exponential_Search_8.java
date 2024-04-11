package searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Exponential_Search_8 
{
	static int es(int arr[],int x)
	{
		int n = arr.length;
		if (n==0)
			return -1;
		int i=1;
		while(i<n && arr[i]<x)
			i*=2;
		int l=i/2,
			r=Math.min(i, n-1);
		while(l <= r)
		{
			int mid=(l+r)/2;
			
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] < x)
				l=mid+1;
			else
				r=mid-1;
		}
		return-1;
	}
	public static void main(String[] args) 
	{
		int[] arr = { 10, 12, 13, 16, 18, 19, 20, 21,22, 23, 24, 33, 35, 42, 47 };
		// Sort the array
		Arrays.sort(arr);
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =es(arr,x);
		sc.close();
		if (s != -1)
			System.out.println("Element found by Exponential Search at index:"+s+"\nElement is:"+arr[s]);
		else
			System.out.println("Element:"+x+" is Not Found !!! 🙁\r\n");
	}
}
