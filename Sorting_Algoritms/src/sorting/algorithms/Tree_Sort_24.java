package sorting.algorithms;

import java.util.Arrays;

public class Tree_Sort_24 
{
	class Node  
    { 
        int key; 
        Node left, right; 
  
        public Node(int item)  
        { 
            key = item; 
            left = right = null; 
        } 
    } 
    Node root; 
    Tree_Sort_24()  
    {  
        root = null;  
    } 
    void insert(int key) 
    { 
        root = insertRec(root, key); 
    } 
    Node insertRec(Node root, int key)  
    { 
        if (root == null)  
        { 
            root = new Node(key); 
            return root; 
        } 
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
        return root; 
    } 
    void inorderRec(Node root)  
    { 
        if (root != null)  
        { 
            inorderRec(root.left); 
            System.out.print(root.key + " "); 
            inorderRec(root.right); 
        } 
    } 
    void treeins(int arr[]) 
    { 
        for(int i = 0; i < arr.length; i++) 
        { 
            insert(arr[i]); 
        } 
    } 
    public static void main(String[] args)  
    {     	
        int arr[] = {5, 4, 7, 2, 11}; 
        long t1=System.currentTimeMillis();
        System.out.println("Given Unsorted Array:"+Arrays.toString(arr)+"\n");
        Tree_Sort_24 tree = new Tree_Sort_24(); 
        tree.treeins(arr);
		System.out.println("Tree Sorted array :");
		tree.inorderRec(tree.root); 
		long t2=System.currentTimeMillis();
		System.out.println("\n \n"+"Completed in :"+(t2-t1)+" Milli Sec");

    } 
}
