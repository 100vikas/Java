package com.collection.set;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

public class LinkedHashset {
	private static final Logger log =Logger.getLogger(LinkedHashset.class.getName());
	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>(5);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(5);
		set.add(null);
		set.add(5);
		set.add(null);
		set.add(4);
		set.add(3);
		log.info(set.toString());
		
	}

}
