package searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Ternary_Search_5 
{
	static int ts(int arr[],int x) 
	{
		int l=0, r=arr.length-1;
		while(r>=l)
		{
			int m1 =l+(r-l)/3,
				m2= r-(r-l)/3;
			if(arr[m1]==x)
				return m1;
			if (arr[m2]==x)
				return m2;
			/* If the Given number is not found in the above conditions then the
			   the below condition will execute their conditions.
		    */
			if (x<arr[m1])
				r=m1-1;
			else if(x>arr[m2])
				l=m2+1;
			else
			{
				l=m1+1;
				r=m2-1;
			}
		}
	
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = { -5, 4, 6, 8, -10,10, 11};
		// Sort the array
		Arrays.sort(arr);
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =ts(arr,x);
		sc.close();
		if (s != -1)
			System.out.println("Element found by Ternary Search at index:"+s+"\nElement is:"+arr[s]);
		else
			System.out.println("Element:"+x+" is Not Found !!! 🙁\r\n");
	}	
	
}
