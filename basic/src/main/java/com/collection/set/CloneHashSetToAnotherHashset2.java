package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class CloneHashSetToAnotherHashset2 {
	private static final Logger log = Logger.getLogger(CloneHashSetToAnotherHashset2.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(5);

		log.info(set + " ");
		Set<Integer>set2=new HashSet<>(set);
		   log.info(set2.toString());

	}

}
