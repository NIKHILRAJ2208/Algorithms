package searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_Search_9 
{
	static int fs(int arr[],int x)
	{
		int n = arr.length;
		int fib1=1,fib2=0,fib3= fib1+fib2;
		int offset= -1;
		
		while (fib3<n)
		{
			fib2=fib1;
			fib1=fib3;
			fib3=fib2+fib1;
		}
		while(fib3>1)
		{
			int i =Math.min(offset+fib2, n-1);
			if(arr[i]<x)
			{/*If x is greater than the value at index i,
			   move the split point to the right*/
				fib3 = fib1;
				fib1=fib2;
				fib2=fib3-fib1;
				offset=i;
			}
			else if (arr[i]>x)
			{/* If x is less than the value at index i, 
				move the split point to the left*/
				fib3=fib2;
				fib1=fib1-fib2;
				fib2=fib3-fib1;
			}
			else{/* If x is equal to the value at index i,return the index*/
				return i;
			}
		}//end of while
		// If x is not found in the array, return -1
		if(fib1 ==1 && arr[n-1] == x) {
			return n-1;
		}	
		else {
			return -1;
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = { 10, 12, 13, 16, 18, 19, 20, 21,22, 23, 24, 33, 35, 42, 47, 200, 235, 100};
		// Sort the array
		Arrays.sort(arr);
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =fs(arr,x);
		sc.close();
		if (s >0)
			System.out.println("Element found by Fibonacci Search at index:"+s+"\nElement is:"+arr[s]);
		else
			System.out.println("Element:"+x+" is Not Found !!! 🙁\r\n");
		
	}
}
