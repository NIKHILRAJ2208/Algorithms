package searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Interpolation_Search_7 
{
	static int is(int arr[],int low,int high,int x)
	{
		int pos;
		if(low<=high && x>=arr[low] && x<=arr[high])
		{
			pos=low + (((high-low)/(arr[high]-arr[low])) * (x-arr[low]));
			if(arr[pos]==x)
				return pos;
			if(arr[pos]<x)//if x is larger and x is in right sub array
				return is(arr,pos+1,high,x);
			if(arr[pos]>x)//if x is smaller and x is in left sub array
				return is(arr,low,pos-1,x);
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = { 10, 12, 13, 16, 18, 19, 20, 21,22, 23, 24, 33, 35, 42, 47 };
		// Sort the array
		Arrays.sort(arr);
		int low = 0,high=arr.length-1;
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =is(arr,low,high,x);
		sc.close();
		if (s != -1)
			System.out.println("Element found by Interpolation Search at index:"+s+"\nElement is:"+arr[s]);
		else
			System.out.println("Element:"+x+" is Not Found !!! 🙁\r\n");
	}
}
