package searching.algorithm;

import java.util.Scanner;

public class Linear_Search_1 
{
	static int Ls(int arr[],int x)
	{
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int ls[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter Element to Search:");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int r=Ls(ls,x);
		if(r!= -1)
		{
			System.out.println("Element Found by Linear Search at index: "+r+"\nElement is " +ls[r]);
		}
		else
			System.out.println("Element:"+x+" Not Found !!! 🙁\r\n");
		sc.close();
	}
}
