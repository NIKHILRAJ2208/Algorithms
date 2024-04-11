package searching.algorithm;

import java.util.Scanner;

public class Sentinel_Linear_Search_2 
{
	/*Sentinel linear search is nothing but using while loop instead of 
	for loop by placing the given element to search placing at the last 
	index of array*/
	static void sls(int arr[],int x)
	{
		int l=arr.length-1;
		int last=arr[l];
		arr[l]=x;
		int i=0;
		while (arr[i]!=x)
			i++;
		arr[l]=last;
		if((i<l)||(arr[l]==x))
			System.out.println("Element Found by Sentinel Linear Search at index :"+i+"\nElement is:"+ arr[i]);
		else
			System.out.println("Element:"+x+" Not Found !!! 🙁\r\n");
	}
	public static void main(String[] args) 
	{
		int sl [] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Enter Element to Search:");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		sls(sl,x);
		sc.close();
	}
}