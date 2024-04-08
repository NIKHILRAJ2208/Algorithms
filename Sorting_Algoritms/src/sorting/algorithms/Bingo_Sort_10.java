package sorting.algorithms;

import java.util.Arrays;

public class Bingo_Sort_10 
{
	static int bingo;
    static int nextBingo;
    static void maxMin(int[] vec, int n)
    {
        for (int i = 1; i < n; i++) {
            bingo = Math.min(bingo, vec[i]);
            nextBingo = Math.max(nextBingo, vec[i]);
        }
    }
    static int[] bingoSort(int[] vec, int n)
    {
        bingo = vec[0];
        nextBingo = vec[0];
        maxMin(vec, n);
        int largestEle = nextBingo;
        int nextElePos = 0;
        while (bingo < nextBingo) {
            int startPos = nextElePos;
            for (int i = startPos; i < n; i++) {
                if (vec[i] == bingo) {
                    int temp = vec[i];
                    vec[i] = vec[nextElePos];
                    vec[nextElePos] = temp;
                    nextElePos = nextElePos + 1;
                }
                else if (vec[i] < nextBingo)
                    nextBingo = vec[i];
            }
            bingo = nextBingo;
            nextBingo = largestEle;
        }
        return vec;
    }
    public static void main(String[] args)
    {
        int[] arr = { 5, 4, 8, 5, 4, 8, 5, 4, 4, 4 };
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        arr = bingoSort(arr, arr.length);
		System.out.println("Bingo Sorted array :"+ Arrays.toString(arr)+"\n");
        int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr2)+"\n");
        arr2 = bingoSort(arr2, arr2.length);
        System.out.println("Bingo Sorted array2 :"+ Arrays.toString(arr2)+"\n");
        int[] arr3 = { 0, 1, 0, 1, 0, 1 };
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr3)+"\n");
        arr3 = bingoSort(arr3, arr3.length);
        System.out.println("Bingo Sorted array 3:"+ Arrays.toString(arr3)+"\n");
	    long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
        
    }
}
