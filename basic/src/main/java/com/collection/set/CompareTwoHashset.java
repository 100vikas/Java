package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class CompareTwoHashset {
	public static final Logger log = Logger.getLogger(CompareTwoHashset.class.getName());

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);                   //Write a program to compare two sets and retain elements which are same on bothsets.
		set1.add(5);

		log.info(set1.toString());

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(2);
		set2.add(30);
		set2.add(4);
		set2.add(5);
		log.info(set2.toString());
       
		CommanElemtsFinder elemtsFinder = new CommanElemtsFinder();
		elemtsFinder.comonElement(set1,set2);
		
		
		
		
		
//		// using method compair
//		if (set1.equals(set2)) {
//			log.info("the set is equal");
//		} else {
//			log.info("the set is not equal");
//		}
//		  
//		set1.retainAll(set2);
//		log.info("equal set is "+set1.toString());
		
		
		
		
	}
}



class CommanElemtsFinder {

	public static final Logger log = Logger.getLogger(CompareTwoHashset.class.getName());
	
	public void comonElement(Set<Integer> set1, Set<Integer> set2) {
		  Set<Integer>findcomele=new HashSet<Integer>(set1);
		  findcomele.retainAll(set2);
		  log.info("Common elements: " + findcomele);
		  
	  }
}