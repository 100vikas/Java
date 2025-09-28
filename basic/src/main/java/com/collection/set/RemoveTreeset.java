package com.collection.set;

import java.util.TreeSet;
import java.util.logging.Logger;

public class RemoveTreeset {

	private static final Logger log = Logger.getLogger(FindTheNumbersLessThan7InATreeset.class.getName());

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(7);
		set.add(8);
		
		log.info(set + " ");
		set.remove(set.getFirst());
		log.info(set + " ");
		set.remove(set.getLast());
		log.info(set + " ");
		set.removeAll(set);
		log.info(set + " ");
		

	}

}
