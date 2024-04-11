package searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_3 
{
	static int meth1(int arr[],int n,int x) 
	{
		int l = 0, r = n-1, m;
		while (l <= r) 
		{
			m= (l+r)/2;
			if (arr [m] == x)
				return m; // Found the element
			if (arr[m] < x)
				l = m + 1;
			else 
				r = m - 1;     
	        }
		return -1; // Element not found
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {110,120,130,150,160,140,170,180,190,200};
		// Sort the array
		Arrays.sort(arr);
		int n = arr.length;
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =meth1(arr,n,x);
		sc.close();
		if (s != -1)
			System.out.println("Element found by Binary Search at index:"+s+"\nElement is:"+arr[s]);
		else
			System.out.println("Element:"+x+" Not Found !!! 🙁\r\n");
	}
}