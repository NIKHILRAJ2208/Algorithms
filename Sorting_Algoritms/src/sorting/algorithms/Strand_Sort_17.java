package sorting.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Strand_Sort_17 
{
	public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) { 
        List<Integer> result = new ArrayList<>(); 
        while (!list1.isEmpty() && !list2.isEmpty()) { 
            if (list1.get(0) < list2.get(0)) { 
                result.add(list1.remove(0)); 
            } else { 
                result.add(list2.remove(0)); 
            } 
        } 
        result.addAll(list1); 
        result.addAll(list2); 
        return result; 
    } 
 public static List<Integer> strandSort(List<Integer> inputList) 
 { 
	 if (inputList.size() <= 1) { 
		 return inputList; 
        } 
	 List<Integer> sublist = new ArrayList<>(); 
	 sublist.add(inputList.remove(0)); 
	 int i = 0; 
	 while (i < inputList.size()) 
	 { 
		 if (inputList.get(i) > sublist.get(sublist.size() - 1))
		 { 
			 sublist.add(inputList.remove(i)); 
         } 
		 else 
		 { 
			 i++; 
         } 
      } 
     List<Integer> sortedSublist = new ArrayList<>(sublist); 
     List<Integer> remainingList = strandSort(inputList); 
     	return mergeLists(sortedSublist, remainingList); 
 } 	  
 public static void main(String[] args) 
 { 
	 List<Integer> inputList = new ArrayList<>();
	 long t1=System.currentTimeMillis();
	 inputList.add(10); 
	 inputList.add(5); 
	 inputList.add(30); 
	 inputList.add(40); 
	 inputList.add(2); 
	 inputList.add(4); 
	 inputList.add(9); 
	 System.out.println("Given Unsorted Array:");
	 for (int x : inputList) { 
		 System.out.print(x + " "); 
        }
	 List<Integer> outputList = strandSort(inputList); 
	 System.out.println("\n \n"+"Strand Sorted array :");
	 for (int x : outputList) { 
		 System.out.print(x + " "); 
        }	 
	 long t2=System.currentTimeMillis();
	 System.out.println("\n \n"+"Completed in :"+(t2-t1)+" Milli Sec");
  }
}
