import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]){
	    ArrayList<Integer> myNums = new ArrayList<Integer>();
	    
	    for(int i = 0; i < 100; i++){
	        myNums.add((int)(Math.random()*5));
	    }
	    System.out.println("-----------Original-----------");
	    printArrayList(myNums);
	    System.out.println();
		
		// Write your code here
		// When you find a 0 in the ArrayList, remove the item before and after it
		// If you're at the start of the list, remove just the item after
		// If you're at the end of the list, remove just the item before
		// Print all values removed as you go through the ArrayList
		


	    System.out.println("-----------Changed-----------");
	    printArrayList(myNums);
	    System.out.println();
	}

	public static void printArrayList(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
}
