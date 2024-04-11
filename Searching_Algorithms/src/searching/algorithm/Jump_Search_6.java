package searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Jump_Search_6 
{
	static int js(int arr[],int x)
	{
		int n =arr.length;
		int jump= (int)Math.floor(Math.sqrt(n));
		int prev=0;
		for(int ms=Math.min(jump,n)-1;arr[ms]<x;ms=Math.min(jump,n)-1)//ms->minstep
		{
			prev=jump;
			jump+=(int)Math.floor(Math.sqrt(n));
			if(prev >=n)
				return -1;
		}
		while(arr[prev]<x)
		{
			prev++;
			if(prev == Math.min(jump,n))
				return -1;
		}
		if (arr[prev]==x)
			return prev;
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = { 10, 12, 13, 16, 18, 19, 20, 21,22, 23, 24, 33, 35, 42, 47 };
		// Sort the array
		Arrays.sort(arr);
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =js(arr,x);
		sc.close();
		if (s != -1)
			System.out.println("Element found by Jump Search at index:"+s+"\nElement is:"+arr[s]);
		else
			System.out.println("Element:"+x+" is Not Found !!! 🙁\r\n");

	}
}
