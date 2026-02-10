import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]){
		ArrayList<Integer> fullSet = new ArrayList<Integer>();
		for(int i = 0; i < 200; i = i + 10){
			fullSet.add(i);
		}
		System.out.println("---------Base ArrayList---------");
		printArrayList(fullSet);
		System.out.println();
		// Create 50 random numbers (1-200 inclusive), place them into the ArrayList given in correct order!


		System.out.println("---------With Random Numbers---------");
		printArrayList(fullSet);
		System.out.println();
		// After your place all numbers in the ArrayList, create 2 separate ArrayLists of all even and odd numbers.
		ArrayList<Integer> evens = new ArrayList<Integer>();
		ArrayList<Integer> odds = new ArrayList<Integer>();
		
		
		
		System.out.println("---------Evens---------");
		printArrayList(evens);
		System.out.println();
		System.out.println("---------Odds---------");
		printArrayList(odds);
		System.out.println();
	}

	public static void printArrayList(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
}
