package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class ConvertaHashsetToTreeset {

	public static final Logger log = Logger.getLogger(ConvertaHashsetToTreeset.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(5);
		
		Set<Integer>tset1=new TreeSet<Integer>(set);            // using direct pass ibject
		
		log.info(tset1+" ");
		
		Set<Integer>tset2=new TreeSet<Integer>();  
		 
		  for(Integer i:set) {
			  tset2.add(i);
		  }
		  log.info(tset2+" ");
	}
}
