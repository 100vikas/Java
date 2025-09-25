package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class CreateSet {
	private static final Logger log = Logger.getLogger(CreateSet.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(5);
		//set.add(20);                         	 // not Allow duplicatevalue

		log.info(set.toString());
		set.remove(10);							// remove the element using value
		log.info(set.toString());
//		for (Integer value : set) {
//			log.info(value+"");
//
//		}
      
	}

}
