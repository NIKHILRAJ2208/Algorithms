package sorting.algorithms;

import java.util.ArrayList;

public class Sleep_Sort_22 {
	public static void sleepSort(ArrayList<Integer> arr) {
        ArrayList<Thread> threads = new ArrayList<>();  // Create an ArrayList to hold threads
        for (int num : arr) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(num);  
                    System.out.print(num + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads.add(thread); // Add the thread to the ArrayList
            thread.start(); // Start the thread
        }
        for (Thread thread : threads) {
            try {
                thread.join(); // Wait for each thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    	long t1=System.currentTimeMillis(); 
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(23);
        arr.add(122);
        arr.add(9);
        System.out.println("Given Unsorted Array:");
        for(int num:arr){
        	System.out.print(num+" ");
        	}
        System.out.println("\n"+"Sleep Sorted array :");
        sleepSort(arr);
        System.out.println();
		long t2=System.currentTimeMillis();
		System.out.println("\n"+"Completed in :"+(t2-t1)+" Milli Sec");

    }
}
