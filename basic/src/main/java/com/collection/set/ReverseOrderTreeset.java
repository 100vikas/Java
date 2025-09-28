package com.collection.set;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class ReverseOrderTreeset {
	
	public static final Logger log = Logger.getLogger(ReverseOrderTreeset.class.getName());

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();
		set.add(9);
		set.add(8);
		set.add(1);
		set.add(5);
		set.add(3);
		
		log.info(set+"");
		 
		NavigableSet<Integer> reverseset = set.descendingSet(); 
		
		System.out.println(reverseset);
//		
//
//		 log.info(set+"");
//		 
////		 NavigableSet<Integer> descending = set.descendingSet();
//		 // Get descending order view
//	        NavigableSet<String> descending = Set.descendingSet();
//	        
//	        // Iterate and print values in descending order
//	        for (String val : descending) {
//	            System.out.println("Value: " + val);
//	        }
//	    }
//		 NavigableSet<String>revrseset=
				

		
		         TreeSet<String> treeSet = new TreeSet<>();
		         treeSet.add("A");
		         treeSet.add("B");
		         treeSet.add("C");
		         treeSet.add("D");
		         
		         // Print the TreeSet in ascending order
		         System.out.println("TreeSet: " + treeSet); // [A, B, C, D]
		         
		         // Get descending order view
//		         NavigableSet<String> descending = treeSet.descendingSet();
		         
		         // Iterate and print values in descending order
//		         for (String val : descending) {
//		             System.out.println("Value: " + val);
//		         }
		     
		 

		 System.out.println("Result is :  "+ set.stream().sorted(Comparator.reverseOrder()).toList()); 
     
		
	}

}
