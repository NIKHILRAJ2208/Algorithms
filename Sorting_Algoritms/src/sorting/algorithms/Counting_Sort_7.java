package sorting.algorithms;

import java.util.Arrays;

public class Counting_Sort_7 
{
	public static int[] countSort(int[] inputArray) {
        int N = inputArray.length,M = 0;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }
        int[] countArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] outputArray = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
        return outputArray;
    }
    public static void main(String[] args) {
        int[] inputArray = {4, 3, 12, 1, 5, 5, 3, 9};
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(inputArray)+"\n");
        int[] outputArray = countSort(inputArray);
		System.out.println("Counting Sorted array :"+ Arrays.toString(outputArray)+"\n");
		long t2=System.currentTimeMillis();
		System.out.println("Completed in :"+(t2-t1)+" Milli Sec");
    }
}
